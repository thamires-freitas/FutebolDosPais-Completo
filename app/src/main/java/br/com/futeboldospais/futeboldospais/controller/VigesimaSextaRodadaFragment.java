package br.com.futeboldospais.futeboldospais.controller;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;

import br.com.futeboldospais.futeboldospais.R;
import br.com.futeboldospais.futeboldospais.model.Resultado;
import br.com.futeboldospais.futeboldospais.service.ResultadoService;
import br.com.futeboldospais.futeboldospais.util.AdapterPadrao;
import br.com.futeboldospais.futeboldospais.util.ResultadoAdapter;


/**
 * A simple {@link Fragment} subclass.
 */

public class VigesimaSextaRodadaFragment extends Fragment {

    /**
     * Created by Bruno on 28/10/2017.
     * Cria um singleton da classe
     */
    private static VigesimaSextaRodadaFragment fragment = null;

    public static VigesimaSextaRodadaFragment newInstance() {
        if (fragment == null) {
            fragment = new VigesimaSextaRodadaFragment();
        }
        return fragment;
    }

    public static VigesimaSextaRodadaFragment getInstance() {
        return fragment;
    }

    private ListView tabelaResultado;
    private Resultado[] listaResultado;
    private ResultadoService resultadoService;
    private ResultadoAdapter resultadoAdapter;

    public VigesimaSextaRodadaFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_vigesimasexta_rodada, container, false);

        tabelaResultado = (ListView) view.findViewById(R.id.vigesimasexta_rodada_tabela);
        Log.d("teste", "adapter fragment");

        resultadoService = new ResultadoService();
        listaResultado = resultadoService.listarDadosPorRodadaETurno(getActivity().getBaseContext(), 26, 3);

        if (listaResultado.length != 0) {
            Log.d("teste", "lista resultado nao é nulo");

            resultadoAdapter = new ResultadoAdapter(listaResultado, getActivity().getBaseContext());
            tabelaResultado.setAdapter(resultadoAdapter);
        } else {
            AdapterPadrao adapterPadrao = new AdapterPadrao(getActivity().getBaseContext(), "Ocorreu um erro nesta rodada!");
            tabelaResultado.setAdapter(adapterPadrao);
        }

        tabelaResultado.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                if (listaResultado[position].getGolsEquipe1() != -1 && listaResultado[position].getGolsEquipe2() != -1) {

                    String data = listaResultado[position].getData();
                    String hora = listaResultado[position].getHorario();
                    String categoria = listaResultado[position].getCategoria();

                    String url = "" + data.charAt(6) + "" + data.charAt(7) + "" + data.charAt(8) + "" +
                            data.charAt(9) + "" + data.charAt(3) + "" + data.charAt(4) + "" + data.charAt(0) + "" +
                            data.charAt(1) + "_" + hora.charAt(0) + "" + hora.charAt(1) + "h" + hora.charAt(3) + "" +
                            hora.charAt(4) + "_" + categoria + "_frente.pdf";

                    String urlBase = "http://www.futeboldospais.com.br/campeonato2017/sumulas/Jogo_" + url;
                    //resultadoAdapter = (ResultadoAdapter) parent.getItemAtPosition(position);
                    //String url = resultadoAdapter.getItemUrl(position);

                    Log.d("teste", urlBase);

                    Intent intent = new Intent(getActivity().getBaseContext(), DocumentViewer.class);
                    intent.putExtra("title", "Súmula");
                    intent.putExtra("url", urlBase);

                    startActivity(intent);
                }
            }

        });

        return view;
    }

}


