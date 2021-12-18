package sample;


import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.XYChart;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;

import java.net.URL;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.ResourceBundle;
import java.util.Set;


public class Controller implements Initializable {
    private static final int KPCMin =  2;
    private static final int TPCMin =  10;
    private static final int VPCMin = 10;
    private static final int FSMin = 1;
    private static final int KSdMax = 2000;

    private int id1=1;
    private int id2=1;
    private int id3=1;
    private int id4=1;
    private int id5=1;

    int[][] Y= new int[4][21];
    int[][] Z= new int[51][31];
    int[][] S = new int[3][21];
    int[] Sd = new int[KSdMax+1];

    int FS;


    @FXML private Button win1_run_button;
    @FXML private Spinner<Integer> win1_quality_device;
    @FXML private Spinner<Integer> win1_volume_storage;
    @FXML private Spinner<Integer> win1_quality_tests;
    @FXML private Spinner<Integer> win1_max_process;
    @FXML private Spinner<Integer> win1_maxTime;
    @FXML private Spinner<Integer> win1_max_volume_process;
    @FXML private TextArea jurText1;
    @FXML private TableView<Tab1Liner> table1;
    @FXML private TableColumn<Tab1Liner, Integer> tab1_id;
    @FXML private TableColumn<Tab1Liner, Integer> tab1_kp;
    @FXML private TableColumn<Tab1Liner, Integer> tab1_prod;
    @FXML private TableColumn<Tab1Liner, Integer> tab1_kz;
    @FXML private TableColumn<Tab1Liner, Integer> tab1_ky;
    @FXML private TableColumn<Tab1Liner, Integer> tab1_ob;
    @FXML private TableColumn<Tab1Liner, Integer> tab1_max_raz;
    @FXML private TableColumn<Tab1Liner, Integer> tab1_sumTime;
    @FXML private TableColumn<Tab1Liner, Integer> tab1_srTime;
    private final ObservableList<Tab1Liner> tab1Data = FXCollections.observableArrayList();
    @FXML private LineChart<Number,Number> chart1;
    @FXML private ChoiceBox<String> x1;
    @FXML private ChoiceBox<String> y1;
    @FXML private ChoiceBox<String> arg1;
    @FXML private Accordion accord1;
    @FXML private TitledPane tt1;
    @FXML private CheckBox rr1;


    @FXML private Button win2_run_button;
    @FXML private Spinner<Integer> win2_quality_device;
    @FXML private Spinner<Integer> win2_volume_storage;
    @FXML private Spinner<Integer> win2_load_cpu;
    @FXML private Spinner<Integer> win2_quality_tests;
    @FXML private Spinner<Integer> win2_max_process;
    @FXML private Spinner<Integer> win2_maxTime;
    @FXML private Spinner<Integer> win2_max_volume_process;
    @FXML private TextArea jurText2;
    @FXML private TableView<Tab2Liner> table2;
    @FXML private TableColumn<Tab2Liner, Integer> tab2_id;
    @FXML private TableColumn<Tab2Liner, Integer> tab2_kp;
    @FXML private TableColumn<Tab2Liner, Integer> tab2_prod;
    @FXML private TableColumn<Tab2Liner, Integer> tab2_kz;
    @FXML private TableColumn<Tab2Liner, Integer> tab2_ky;
    @FXML private TableColumn<Tab2Liner, Integer> tab2_ob;
    @FXML private TableColumn<Tab2Liner, Integer> tab2_CP;
    @FXML private TableColumn<Tab2Liner, Integer> tab2_max_raz;
    @FXML private TableColumn<Tab2Liner, Integer> tab2_sumTime;
    @FXML private TableColumn<Tab2Liner, Integer> tab2_srTime;
    private final ObservableList<Tab2Liner> tab2Data = FXCollections.observableArrayList();
    @FXML private LineChart<Number,Number> chart2;
    @FXML private ChoiceBox<String> x2;
    @FXML private ChoiceBox<String> y2;
    @FXML private ChoiceBox<String> arg2;
    @FXML private Accordion accord2;
    @FXML private TitledPane tt2;
    @FXML private CheckBox rr2;

    @FXML private Button win3_run_button;
    @FXML private Spinner<Integer> win3_quality_device;
    @FXML private Spinner<Integer> win3_number_sections;
    @FXML private Spinner<Integer> win3_quality_tests;
    @FXML private Spinner<Integer> win3_max_process;
    @FXML private Spinner<Integer> win3_maxTime;
    @FXML private Spinner<Integer> win3_max_volume_process;
    @FXML private Spinner<Integer> tabSpin1;
    @FXML private Spinner<Integer> tabSpin2;
    @FXML private Spinner<Integer> tabSpin3;
    @FXML private Spinner<Integer> tabSpin4;
    @FXML private Spinner<Integer> tabSpin5;
    @FXML private Spinner<Integer> tabSpin6;
    @FXML private Spinner<Integer> tabSpin7;
    @FXML private Spinner<Integer> tabSpin8;
    @FXML private TextArea jurText3;
    @FXML private TableView<Tab3Liner> table3;
    @FXML private TableColumn<Tab3Liner, Integer> tab3_id;
    @FXML private TableColumn<Tab3Liner, Integer> tab3_kp;
    @FXML private TableColumn<Tab3Liner, Integer> tab3_prod;
    @FXML private TableColumn<Tab3Liner, Integer> tab3_kz;
    @FXML private TableColumn<Tab3Liner, Integer> tab3_ky;
    @FXML private TableColumn<Tab3Liner, Integer> tab3_kr;
    @FXML private TableColumn<Tab3Liner, Integer> tab3_max_raz;
    @FXML private TableColumn<Tab3Liner, Integer> tab3_sumTime;
    @FXML private TableColumn<Tab3Liner, Integer> tab3_srTime;
    private final ObservableList<Tab3Liner> tab3Data = FXCollections.observableArrayList();
    @FXML private LineChart<Number,Number> chart3;
    @FXML private ChoiceBox<String> x3;
    @FXML private ChoiceBox<String> y3;
    @FXML private ChoiceBox<String> arg3;
    @FXML private Accordion accord3;
    @FXML private TitledPane tt3;
    @FXML private CheckBox rr3;

    @FXML private Button win4_run_button;
    @FXML private Spinner<Integer> win4_quality_device;
    @FXML private Spinner<Integer> win4_volume_storage;
    @FXML private Spinner<Integer> win4_load_cpu;
    @FXML private Spinner<Integer> win4_load_md;
    @FXML private Spinner<Integer> win4_quality_tests;
    @FXML private Spinner<Integer> win4_max_process;
    @FXML private Spinner<Integer> win4_maxTime;
    @FXML private Spinner<Integer> win4_max_volume_process;
    @FXML private TextArea jurText4;
    @FXML private TableView<Tab4Liner> table4;
    @FXML private TableColumn<Tab4Liner, Integer> tab4_id;
    @FXML private TableColumn<Tab4Liner, Integer> tab4_kp;
    @FXML private TableColumn<Tab4Liner, Integer> tab4_prod;
    @FXML private TableColumn<Tab4Liner, Integer> tab4_kz;
    @FXML private TableColumn<Tab4Liner, Integer> tab4_ky;
    @FXML private TableColumn<Tab4Liner, Integer> tab4_ob;
    @FXML private TableColumn<Tab4Liner, Integer> tab4_cp;
    @FXML private TableColumn<Tab4Liner, Integer> tab4_md;
    @FXML private TableColumn<Tab4Liner, Integer> tab4_max_raz;
    @FXML private TableColumn<Tab4Liner, Integer> tab4_sumTime;
    @FXML private TableColumn<Tab4Liner, Integer> tab4_srTime;
    private final ObservableList<Tab4Liner> tab4Data = FXCollections.observableArrayList();
    @FXML private LineChart<Number,Number> chart4;
    @FXML private ChoiceBox<String> x4;
    @FXML private ChoiceBox<String> y4;
    @FXML private ChoiceBox<String> arg4;
    @FXML private Accordion accord4;
    @FXML private TitledPane tt4;
    @FXML private CheckBox rr4;

    @FXML private Button win5_run_button;
    @FXML private Spinner<Integer> win5_quality_device;
    @FXML private Spinner<Integer> win5_volume_storage;
    @FXML private Spinner<Integer> win5_load_cpu;
    @FXML private Spinner<Integer> win5_load_md;
    @FXML private Spinner<Integer> win5_quality_tests;
    @FXML private Spinner<Integer> win5_max_process;
    @FXML private Spinner<Integer> win5_maxTime;
    @FXML private Spinner<Integer> win5_max_volume_process;
    @FXML private CheckBox win5_dynamic_checkbox;
    @FXML private TextArea jurText5;
    @FXML private TableView<Tab4Liner> table5;
    @FXML private TableColumn<Tab4Liner, Integer> tab5_id;
    @FXML private TableColumn<Tab4Liner, Integer> tab5_kp;
    @FXML private TableColumn<Tab4Liner, Integer> tab5_prod;
    @FXML private TableColumn<Tab4Liner, Integer> tab5_kz;
    @FXML private TableColumn<Tab4Liner, Integer> tab5_ky;
    @FXML private TableColumn<Tab4Liner, Integer> tab5_ob;
    @FXML private TableColumn<Tab4Liner, Integer> tab5_cp;
    @FXML private TableColumn<Tab4Liner, Integer> tab5_md;
    @FXML private TableColumn<Tab4Liner, Integer> tab5_max_raz;
    @FXML private TableColumn<Tab4Liner, Integer> tab5_sumTime;
    @FXML private TableColumn<Tab4Liner, Integer> tab5_srTime;
    private final ObservableList<Tab4Liner> tab5Data = FXCollections.observableArrayList();
    @FXML private LineChart<Number,Number> chart5;
    @FXML private ChoiceBox<String> x5;
    @FXML private ChoiceBox<String> y5;
    @FXML private ChoiceBox<String> arg5;
    @FXML private Accordion accord5;
    @FXML private TitledPane tt5;
    @FXML private CheckBox rr5;


    @FXML void runButton1Click(){

        int KY = win1_quality_device.getValue();
        int KZ = win1_quality_tests.getValue();
        int KPC = win1_max_process.getValue();
        int TPC=  win1_maxTime.getValue();
        int VPC= win1_max_volume_process.getValue();
        int KSd =  win1_volume_storage.getValue();
        disableFields(true);
        StringBuilder sb = new StringBuilder();

        boolean rrSelected = rr1.isSelected();
        if (!rrSelected) clickClear1();
        for (int aaa = 2; aaa<=8;aaa+=3) {
            if (aaa==8) aaa--;
            if (rrSelected) aaa = 8;
            else KPC = aaa;
            for (int kzp=1;kzp<=30;kzp++) {
                if (rrSelected) kzp = 30;
                else KZ=kzp;
                for (int prod = 25; prod <=85; prod+=30) {
                    if (rrSelected) prod = 85;
                    else TPC=prod;
                    int jz, js, ls, jsz;
                    for (int i = 1; i < 51; i++)
                        for (int j = 1; j < 31; j++) Z[i][j] = 0;
                    for (int i = 1; i < 4; i++)
                        for (int j = 1; j < 21; j++) Y[i][j] = 0;
                    for (int i = 1; i < 3; i++)
                        for (int j = 1; j < 21; j++) S[i][j] = 0;
                    for (int i = 1; i <= 2000; i++) Sd[i] = 0;


                    int T = 0, KZC = 0;

                    if (rrSelected) {
                        sb.append("--------------------------------------------------\n");
                        sb.append("Результаты моделирования SRDNP\n");
                        sb.append("--------------------------------------------------\n");
                    }
                    // Задание конфигурации системы и потока заданий
                    for (int i = 1; i <= KZ; i++) {
                        zADS(T, i, KY, TPC, KPC, VPC);
                        if (rrSelected) sb.append(WZS(i));
                    }


//        me7:
                    for (int k = 0; k < 7000; k++) {
                        if (k == 6999) System.out.println("ERROR1");
                        jsz = 0;
                        for (int i = 1; i <= KSd; i++) {
                            if (Sd[i] == 0) {
                                jz = 0;
                                ls = 100000;
                                js = 0;

//            me80:
                                do {
                                    js = js + 1;
                                }
                                while (!me80(i, js, KSd, Sd));

                                for (int j = 1; j <= KZ; j++) {
                                    if (Z[1][j] == 0) {
                                        int ms = js - Z[7][j];
                                        if ((ms >= 0) && (ms < ls)) {
                                            jz = j;
                                            ls = ms;
                                        }
                                    }
                                }

                                if (jz != 0) {
                                    Z[1][jz] = 1;
                                    js = i + Z[7][jz] - 1;
                                    for (ls = i; ls <= js; ls++) {
                                        Sd[ls] = jz;
                                    }
                                    if (rrSelected) {
                                        sb.append(String.format("Т= %5d; Загружено задание № %2d (Код \"%1s\")\n", T, jz, getCode(jz)));
                                    }
                                    jsz = 1;
                                }
                            }
                        }
                        if (jsz == 1 && rrSelected) sb.append(SMap(T, KSd, Sd));

                        // Загрузка освободившихся устройств
                        for (int i = 1; i <= KY; i++) {
                            if (Y[2][i] == 0) {
                                for (int j = 1; j <= KZ; j++) {
                                    if (Z[1][j] == 1) {
                                        int ip = Z[3][j] + 1;
                                        if (i == Z[8 + 3 * ip][j]) {
                                            Y[2][i] = j;
                                            Y[3][i] = Z[9 + 3 * ip][j];
                                            Z[1][j] = 2;
                                            Z[3][j] = ip;
                                            break;
                                        }
                                    }
                                }
                            }
                        }
                        // Поиск ближайшей особой точки
                        int kt = 100000;
                        int ly = 0;
                        for (int i = 1; i <= KY; i++) {
                            if (Y[2][i] != 0 && Y[3][i] < kt) {
                                kt = Y[3][i];
                                ly = i;
                            }
                        }
                        if (ly > 0) {
                            // Шаг обработки на KT
                            T = T + kt;
                            for (int i = 1; i <= KY; i++) {
                                if (Y[2][i] != 0) {
                                    Y[3][i] = Y[3][i] - kt;
                                    if (Y[3][i] == 0) {
                                        int iz = Y[2][i];
                                        Y[2][i] = 0;
                                        Z[1][iz] = 1;
                                        if (Z[2][iz] <= Z[3][iz]) {
                                            Z[1][iz] = 9;
                                            for (int j = 1; j <= KSd; j++)
                                                if (Sd[j] == iz) Sd[j] = 0;

                                            if (rrSelected) {
                                                sb.append(String.format("Т= %5d; Закончилось задание %2d (Код \"%1s\")\n", T, iz, getCode(iz)));
                                                sb.append(SMap(T, KSd, Sd));
                                            }
                                        }

                                    }
                                }
                            }
                            KZC = 0;
                            for (int i = 1; i <= KZ; i++)
                                if (Z[1][i] == 9) KZC++;
//                if (KZC == KZ) break;
//                if (KZC <> KZ)  then goto me7;

                        } else {
                            if (rrSelected) {
                                sb.append("--------------------------------------------------\n");
                                sb.append(String.format("Т= %5d; KZ=%3d; KY=%3d;\n", T, KZ, KY));
                                sb.append(String.format("Всего решено заданий %3d\n", KZC));

                            }
                            int TC = 0;
                            if (KZC > 0) TC = Math.round((float) T / KZC);
                            if (rrSelected) {
                                sb.append(String.format("Среднее время решения одного задания ТС=%6d\n", TC));
                            }
                            else {
                                sb.append(String.format("id=%3d, КУ=%3d, KZ=%3d, KPC=%3d, TPC=%3d, VPC=%3d, KSD=%3d\n", id1, KY, KZ, KPC,TPC,VPC,KSd));
                                sb.append(String.format("          Результат: Ср. время: 3%d, Сумм. время: %d\n", TC, T));
                                sb.append("--------------------------------------------------\n");
                            }

                            tab1Data.add(new Tab1Liner(id1, KPC, TPC, KZ, KY, KSd, VPC, T, TC));
                            id1++;

                            break;
                        }
                    }
                }
            }
        }

        jurText1.setText(sb.toString());

        generateChart1();

        disableFields(false);
    }



    @FXML void runButton2Click(){
        int  jz, ls;

        int KY = win2_quality_device.getValue();
        int KZ = win2_quality_tests.getValue();
        int KPC = win2_max_process.getValue();
        int TPC=  win2_maxTime.getValue();
        int VPC= win2_max_volume_process.getValue();
        int KSd =  win2_volume_storage.getValue();
        int TOSP = win2_load_cpu.getValue();
        disableFields(true);

        StringBuilder sb = new StringBuilder();

        boolean rrSelected = rr2.isSelected();
        if (!rrSelected) clickClear2();
        for (int aaa = 2; aaa<=8;aaa+=3) {
            if (aaa==8) aaa--;
            if (rrSelected) aaa = 8;
            else KPC = aaa;
            for (int kzp=1;kzp<=30;kzp++) {
                if (rrSelected) kzp = 30;
                else KZ = kzp;
                for (int prod = 25; prod <= 85; prod += 30) {
                    if (rrSelected) prod = 85;
                    else TPC = prod;

                    for (int i = 1; i<51;i++)
                        for (int j = 1; j<31; j++) Z[i][j]=0;
                    for (int i = 1; i<4;i++)
                        for (int j = 1; j<21; j++) Y[i][j]=0;
                    for (int i = 1; i<3;i++)
                        for (int j = 1; j<21; j++) S[i][j]=0;
                    for (int i = 1;  i <= 2000; i++) Sd[i] = 0;

                    int T = 0, KZC = 0;

                    if (rrSelected) {
                        sb.append("--------------------------------------------------\n");
                        sb.append("Результаты моделирования SRDPR\n");
                        sb.append("--------------------------------------------------\n");
                    }
                    // Задание конфигурации системы и потока заданий
                    for (int i = 1; i <= KZ; i++) {
                        zADS(T, i, KY, TPC, KPC, VPC);
                        if (rrSelected) sb.append(WZS(i));
                    }


                    int iss = KSd; // Сначала свободна вся память
                    // Загрузка заданий, помещаемых в разделы памяти
                    //me7
                    for (int k = 0; k < 7000; k++) {
                        if (k == 6999) System.out.println("ERROR2");
                        jz = 0;
                        ls = 100000;
                        for (int i = 1; i <= KZ; i++) {
//                System.out.println("Z " + Z[1][i]);
                            if (Z[1][i] == 0) {
                                int ms = iss - Z[7][i];
                                if (ms >= 0 && ms < ls) {
                                    jz = i;
                                    ls = ms;
                                }
                            }
                        }
                        if (jz != 0) {
                            Z[1][jz] = 1;
                            iss = ls;
                            char c = IntToChar(jz);
                            if (rrSelected) {
                                sb.append(String.format("Т= %5d; Загружено задание № %2d (Код \"%1s\")\n", T, jz, c));
                                sb.append(String.format("          Свободная память = %d\n", iss));
                            }
                            if (Y[2][1] == 0) continue;
                            Y[3][1] += TOSP;
                            continue;
                        }

                        // Загрузка освободившихся устройств
                        for (int i = 1; i <= KY; i++) {
                            if (Y[2][i] == 0) {
                                for (int j = 1; j <= KZ; j++) {
                                    if (Z[1][j] == 1) {
                                        int ip = Z[3][j] + 1;
                                        int ij = Z[8 + 3 * ip][j];
                                        if (i == ij) {
                                            Y[2][i] = j;
                                            Y[3][i] = Z[9 + 3 * ip][j];
                                            Z[1][j] = 2;
                                            Z[3][j] = ip;
                                            break;
                                        }
                                    }
                                }
                            }
                        }


                        // Поиск ближайшей особой точки
                        int kt = 100000;
                        int ly = 0;

                        for (int i = 1; i <= KY; i++) {
                            if (Y[2][i] != 0 && Y[3][i] < kt) {
                                kt = Y[3][i];
                                ly = i;
                            }
                        }
                        if (ly > 0) {
                            T += kt;
                            for (int i = 1; i <= KY; i++) {
                                if (Y[2][i] != 0) {
                                    Y[3][i] -= kt;
                                    if (Y[3][i] == 0) {
                                        int iz = Y[2][i];
                                        Y[2][i] = 0;
                                        Z[1][iz] = 1;
                                        if (Z[2][iz] <= Z[3][iz]) {
                                            Z[1][iz] = 9;
                                            iss += Z[7][iz];
                                            if (rrSelected) {
                                                sb.append(String.format("Т= %5d; Закончилось задание %2d (Код \"%1s\")\n", T, iz, IntToChar(iz)));
                                                sb.append(String.format("          Свободная память = %d\n", iss));
                                            }
                                        }
                                    }
                                }
                            }
                            KZC = 0;
                            for (int i = 1; i <= KZ; i++) {
                                if (Z[1][i] == 9) KZC++;
                            }
//                if (KZC != KZ) break;
                        } else {
                            if (rrSelected) {
                                sb.append("--------------------------------------------------\n");
                                sb.append(String.format("Т= %5d; KZ=%3d; KY=%3d;\n", T, KZ, KY));
                                sb.append(String.format("Всего решено заданий %3d\n", KZC));
                            }
                            int TC = 0;
                            if (KZC > 0) TC = Math.round((float) T / KZC);
                            if (rrSelected) sb.append(String.format("Среднее время решения одного задания ТС=%6d\n", TC));
                            else {
                                sb.append(String.format("id=%3d, КУ=%3d, KZ=%3d, KPC=%3d, TPC=%3d, VPC=%3d, KSD=%3d, TOSP=%3d\n", id2, KY, KZ, KPC,TPC,VPC,KSd, TOSP));
                                sb.append(String.format("          Результат: Ср. время: 3%d, Сумм. время: %d\n", TC, T));
                                sb.append("--------------------------------------------------\n");
                            }
                            tab2Data.add(new Tab2Liner(id2, KPC, TPC, KZ, KY, KSd, VPC, T, TC, TOSP));
                            id2++;
                            break;
                        }
                    }
                }
            }
        }

        jurText2.setText(sb.toString());
        generateChart2();
        disableFields(false);
    }

    @FXML void runButton3Click(){
        int  jz, ls;

        int KY = win3_quality_device.getValue();
        int KZ = win3_quality_tests.getValue();
        int KPC = win3_max_process.getValue();
        int TPC=  win3_maxTime.getValue();
        int VPC= win3_max_volume_process.getValue();
        int KS =  win3_number_sections.getValue();
        StringBuilder sb = new StringBuilder();
        disableFields(true);

        boolean rrSelected = rr3.isSelected();
        if (!rrSelected) clickClear3();
        for (int aaa = 2; aaa<=8;aaa+=3) {
            if (aaa==8) aaa--;
            if (rrSelected) aaa = 8;
            else KPC = aaa;
            for (int kzp=1;kzp<=30;kzp++) {
                if (rrSelected) kzp = 30;
                else KZ = kzp;
                for (int prod = 25; prod <= 85; prod += 30) {
                    if (rrSelected) prod = 85;
                    else TPC = prod;
                    for (int i = 1; i < 51; i++)
                        for (int j = 1; j < 31; j++) Z[i][j] = 0;
                    for (int i = 1; i < 4; i++)
                        for (int j = 1; j < 21; j++) Y[i][j] = 0;
                    for (int i = 1; i < 3; i++)
                        for (int j = 1; j < 21; j++) S[i][j] = 0;
                    for (int i = 1; i <= 2000; i++) Sd[i] = 0;
                    if (KS >= 1) S[1][1] = tabSpin1.getValue();
                    if (KS >= 2) S[1][2] = tabSpin2.getValue();
                    if (KS >= 3) S[1][3] = tabSpin3.getValue();
                    if (KS >= 4) S[1][4] = tabSpin4.getValue();
                    if (KS >= 5) S[1][5] = tabSpin5.getValue();
                    if (KS >= 6) S[1][6] = tabSpin6.getValue();
                    if (KS >= 7) S[1][7] = tabSpin7.getValue();
                    if (KS >= 8) S[1][8] = tabSpin8.getValue();
                    int T = 0, KZC = 0;


                    if (rrSelected) {
                        sb.append("--------------------------------------------------\n");
                        sb.append("Результаты моделирования SRSTAT\n");
                        sb.append("--------------------------------------------------\n");
                    }
                    // Задание конфигурации системы и потока заданий
                    for (int i = 1; i <= KZ; i++) {
                        zADS(T, i, KY, TPC, KPC, VPC);
                        if (rrSelected) sb.append(WZS(i));
                    }
                    // Загрузка заданий, помещаемых в разделы памяти
                    //me7
                    for (int k = 0; k < 7000; k++) {
                        if (k == 6999) System.out.println("ERROR3");
                        for (int i = 1; i <= KS; i++) {
                            if (S[2][i] == 0) {
                                jz = 0;
                                ls = 100000;
                                for (int j = 1; j <= KZ; j++) {
                                    if (Z[1][j] == 0) {
                                        int ms = S[1][i] - Z[7][j];
                                        if (ms >= 0 && ms < ls) {
                                            jz = j;
                                            ls = ms;
                                        }
                                    }
                                }
                                if (jz != 0) {
                                    Z[1][jz] = 1;
                                    S[2][i] = jz;
                                }
                            }
                        }
                        // Загрузка освободившихся устройств
                        for (int i = 1; i <= KY; i++) {
                            if (Y[2][i] == 0) {
                                for (int j = 1; j <= KZ; j++) {
                                    if (Z[1][j] == 1) {
                                        int ip = Z[3][j] + 1;
                                        int ij = Z[8 + 3 * ip][j];
                                        if (i == ij) {
                                            Y[2][i] = j;
                                            Y[3][i] = Z[9 + 3 * ip][j];
                                            Z[1][j] = 2;
                                            Z[3][j] = ip;
                                            break;
                                        }
                                    }
                                }
                            }
                        }
                        // Поиск ближайшей особой точки
                        int kt = 100000;
                        int ly = 0;

                        for (int i = 1; i <= KY; i++) {
                            if (Y[2][i] != 0 && Y[3][i] < kt) {
                                kt = Y[3][i];
                                ly = i;
                            }
                        }
                        if (ly > 0) {
                            T += kt;
                            for (int i = 1; i <= KY; i++) {
                                if (Y[2][i] != 0) {
                                    Y[3][i] -= kt;
                                    if (Y[3][i] == 0) {
                                        int iz = Y[2][i];
                                        Y[2][i] = 0;
                                        Z[1][iz] = 1;
                                        if (Z[2][iz] <= Z[3][iz]) {
                                            Z[1][iz] = 9;
                                            for (int j = 1; j < KS; j++) {
                                                if (S[2][j] == iz) S[2][j] = 0;
                                            }
                                        }
                                    }
                                }
                            }
                            KZC = 0;
                            for (int i = 1; i <= KZ; i++) {
                                if (Z[1][i] == 9) KZC++;
                            }
//                if (KZC != KZ) break;
                        } else {
                            if (rrSelected) {
                                sb.append("--------------------------------------------------\n");
                                sb.append(String.format("Т= %5d; KZ=%3d; KY=%3d;\n", T, KZ, KY));
                                sb.append(String.format("Всего решено заданий %3d\n", KZC));
                            }

                            int TC = 0;
                            if (KZC > 0) TC = Math.round((float) T / KZC);
                            if (rrSelected) {
                                sb.append(String.format("Среднее время решения одного задания ТС=%6d\n", TC));
                            }
                            else {
                                sb.append(String.format("id=%3d, КУ=%3d, KZ=%3d, KPC=%3d, TPC=%3d, VPC=%3d, KS=%3d\n", id3, KY, KZ, KPC,TPC,VPC,KS));
                                sb.append(String.format("          Результат: Ср. время: 3%d, Сумм. время: %d\n", TC, T));
                                sb.append("--------------------------------------------------\n");
                            }
                            tab3Data.add(new Tab3Liner(id3, KPC, TPC, KZ, KY, KS, VPC, T, TC));
                            id3++;
                            break;
                        }
                    }
                }
            }
        }
        sb.append("Разделы: ");
        for (int i = 1; i <= KS; i++)
            sb.append(String.format("%4d ", S[1][i]));
        jurText3.setText(sb.toString());
        generateChart3();
        disableFields(false);
    }

    @FXML void runButton4Click(){
        int KY = win4_quality_device.getValue();
        int KZ = win4_quality_tests.getValue();
        int KPC = win4_max_process.getValue();
        int TPC=  win4_maxTime.getValue();
        int VPC= win4_max_volume_process.getValue();
        int KSSeg =  win4_volume_storage.getValue();
        int TOS1 = win4_load_cpu.getValue();
        int TOS2 = win4_load_md.getValue();
        disableFields(true);
        StringBuilder sb = new StringBuilder();

        boolean rrSelected = rr4.isSelected();
        if (!rrSelected) clickClear4();
        for (int aaa = 2; aaa<=8;aaa+=3) {
            if (aaa==8) aaa--;
            if (rrSelected) aaa = 8;
            else KPC = aaa;

            for (int kzp=1;kzp<=30;kzp++) {
                if (rrSelected) kzp = 30;
                else KZ = kzp;
                for (int prod = 25; prod <= 85; prod += 30) {
                    if (rrSelected) prod = 85;
                    else TPC = prod;

                    for (int i = 1; i < 51; i++)
                        for (int j = 1; j < 31; j++) Z[i][j] = 0;
                    for (int i = 1; i < 4; i++)
                        for (int j = 1; j < 21; j++) Y[i][j] = 0;
                    for (int i = 1; i < 3; i++)
                        for (int j = 1; j < 21; j++) S[i][j] = 0;
                    for (int i = 1; i <= 2000; i++) Sd[i] = 0;

                    int T = 0, KZC = 0;

                    if (rrSelected) {
                        sb.append("--------------------------------------------------\n");
                        sb.append("Результаты моделирования SSEG\n");
                        sb.append("--------------------------------------------------\n");
                    }
                    // Задание конфигурации системы и потока заданий
                    for (int i = 1; i <= KZ; i++) {
                        zADS(T, i, KY, TPC, KPC, VPC);
                        if (rrSelected)sb.append(WZS(i));
                    }
                    if (rrSelected) sb.append("--------------------------------------------------\n");
                    // Загрузка заданий, помещаемых в разделы памяти
                    for (int i = 1; i <= KZ; i++) {
                        Z[1][i] = 1;
                        if (rrSelected) sb.append(String.format("Т= %5d; Загружено задание № %2d (Код \"%1s\")\n", T, i, IntToChar(i)));
                    }
                    if (rrSelected) sb.append("--------------------------------------------------\n");
                    int ISSeg = KSSeg; // Сначала свободна вся память
                    //me7
                    for (int k = 0; k < 7000; k++) {
                        if (k == 6999) System.out.println("ERROR4");
                        int k1 = 0, k2 = 0;
                        for (int i = 1; i <= KY; i++) {
                            if (Y[2][i] == 0) {
                                for (int j = 1; j <= KZ; j++) {
                                    if (Z[1][j] == 1) {
                                        int ip = Z[3][j] + 1;
                                        int ij = Z[8 + 3 * ip][j];
                                        if (i == ij) {
                                            int isiz = Z[10 + 3 * ip][j];
                                            if (isiz <= ISSeg) {
                                                ISSeg -= isiz;
                                                Y[2][i] = j;
                                                Y[3][i] = Z[9 + 3 * ip][j];
                                                Z[1][j] = 2;
                                                Z[3][j] = ip;
                                                k1 += TOS1;
                                                k2 += TOS2;
                                                if (rrSelected) {
                                                    sb.append(String.format("Т= %5d; Запущен процесс %d задания %d\n", T, ip, j));
                                                    sb.append(String.format("          Свободная память = %d\n", ISSeg));
                                                }
                                                break;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        if (Y[2][1] != 0) Y[3][1] += k1;
                        if (Y[2][2] != 0) Y[3][2] += k2;

                        // Поиск ближайшей особой точки
                        int kt = 100000;
                        int ly = 0;

                        for (int i = 1; i <= KY; i++) {
                            if (Y[2][i] != 0 && Y[3][i] < kt) {
                                kt = Y[3][i];
                                ly = i;
                            }
                        }
                        if (ly > 0) {
                            T += kt;
                            for (int i = 1; i <= KY; i++) {
                                if (Y[2][i] != 0) {
                                    Y[3][i] -= kt;
                                    if (Y[3][i] == 0) {
                                        int iz = Y[2][i];
                                        int ip = Z[3][iz];
                                        Y[2][i] = 0;
                                        Z[1][iz] = 1;
                                        int isiz = Z[10 + 3 * ip][iz];
                                        ISSeg += isiz;
                                        if (rrSelected) {
                                            sb.append(String.format("Т= %5d; Закончен процесс %d задания %d\n", T, ip, iz));
                                            sb.append(String.format("          Свободная память = %d\n", ISSeg));
                                        }
                                        if (Z[2][iz] <= Z[3][iz]) {
                                            Z[1][iz] = 9;
                                            if (rrSelected) {
                                                sb.append(String.format("Т= %5d; Закончилось задание %2d (Код \"%1s\")\n", T, iz, IntToChar(iz)));
                                                sb.append(String.format("          Свободная память = %d\n", ISSeg));
                                            }
                                        }
                                    }
                                }
                            }
                            KZC = 0;
                            for (int i = 1; i <= KZ; i++) {
                                if (Z[1][i] == 9) KZC++;
                            }
//                if (KZC != KZ) break;
                        } else {
                            if (rrSelected) {
                                sb.append("--------------------------------------------------\n");
                                sb.append(String.format("Т= %5d; KZ=%3d; KY=%3d;\n", T, KZ, KY));
                                sb.append(String.format("Всего решено заданий %3d\n", KZC));
                            }

                            int TC = 0;
                            if (KZC > 0) TC = Math.round((float) T / KZC);
                            if (rrSelected) sb.append(String.format("Среднее время решения одного задания ТС=%6d\n", TC));
                            else {
                                sb.append(String.format("id=%3d, КУ=%3d, KZ=%3d, KPC=%3d, TPC=%3d, VPC=%3d, KSSeg=%3d, ЗЦП=%3d, ЗМД=%3d\n", id4, KY, KZ, KPC,TPC,VPC,KSSeg, TOS1, TOS2));
                                sb.append(String.format("          Результат: Ср. время: 3%d, Сумм. время: %d\n", TC, T));
                                sb.append("--------------------------------------------------\n");
                            }
                            tab4Data.add(new Tab4Liner(id4, KPC, TPC, KZ, KY, KSSeg, VPC, T, TC, TOS1, TOS2));
                            id4++;
                            break;
                        }
                    }
                }
            }
        }

        jurText4.setText(sb.toString());
        generateChart4();
        disableFields(false);
    }

    @FXML void runButton5Click(){
        int  jz;

        int KY = win5_quality_device.getValue();
        int KZ = win5_quality_tests.getValue();
        int KPC = win5_max_process.getValue();
        int TPC=  win5_maxTime.getValue();
        int VPC= win5_max_volume_process.getValue();
        int KSStr =  win5_volume_storage.getValue();
        int TOS1 = win5_load_cpu.getValue();
        int TOS2 = win5_load_md.getValue();
        disableFields(true);
        StringBuilder sb = new StringBuilder();

        boolean rrSelected = rr5.isSelected();
        if (!rrSelected) clickClear5();
        for (int aaa = 2; aaa<=8;aaa+=3) {
            if (aaa==8) aaa--;
            if (rrSelected) aaa = 8;
            else KPC = aaa;
            for (int kzp=1;kzp<=30;kzp++) {
                if (rrSelected) kzp = 30;
                else KZ=kzp;
                for (int prod = 25; prod <=85; prod+=30) {
                    if (rrSelected) prod = 85;
                    else TPC = prod;

                    for (int i = 1; i < 51; i++)
                        for (int j = 1; j < 31; j++) Z[i][j] = 0;
                    for (int i = 1; i < 4; i++)
                        for (int j = 1; j < 21; j++) Y[i][j] = 0;

                    int T = 0, KZC;

                    if (rrSelected) {
                        sb.append("--------------------------------------------------\n");
                        sb.append("Результаты моделирования SSTR\n");
                        sb.append("--------------------------------------------------\n");
                    }
                    // Задание конфигурации системы и потока заданий
                    for (int i = 1; i <= KZ; i++) {
                        zADS(T, i, KY, TPC, KPC, VPC);
                        if (rrSelected) sb.append(WZS(i));
                    }
                    if (rrSelected) sb.append("--------------------------------------------------\n");
                    // Загрузка заданий, помещаемых в разделы памяти
                    if (rrSelected) sb.append(String.format("Т= %5d\n", T));
                    for (int i = 1; i <= KZ; i++) {
                        Z[1][i] = 1;
                        if (rrSelected)sb.append(String.format("Задание № %2d загружено и ожидает\n", i));
                    }
                    if (rrSelected)sb.append("--------------------------------------------------\n");
                    int ISStr = KSStr; // Сначала свободна вся память
                    //me7
                    for (int k = 0; k < 15000; k++) {
                        if (k == 14999) System.out.println("ERROR5");
                        int k1 = 0, k2 = 0;
                        for (int i = 1; i <= KY; i++) {
                            if (Y[2][i] == 0) {
                                for (int j = 1; j <= KZ; j++) {
                                    if (Z[1][j] == 1) {
                                        int ip = Z[3][j] + 1;
                                        int ij = Z[8 + 3 * ip][j];
                                        if (i == ij) {
                                            int isiz = Z[10 + 3 * ip][j];
                                            int ksvp = 0;
                                            ksvp = SVP(Z[7][j], isiz, Z[9][j], ksvp);
                                            Z[10][j] = ksvp;
                                            int iss = RandomRange(1, isiz);
                                            if (iss > ksvp) {
                                                //mm
                                                int gg = 0;
                                                while (true) {
                                                    int bb = 0;
                                                    int z9iz = Z[9][j];
                                                    int z10iz = Z[10][j];
                                                    if (z9iz <= z10iz) {
                                                        if (ISStr <= 0) {
                                                            // Выбор задания для удаления одной страницы
                                                            jz = 0;
                                                            for (int lz = 1; lz <= KZ; lz++) {
                                                                if (Z[9][lz] > Z[10][lz]) jz = lz;
                                                            }
                                                            if (jz == 0) {
                                                                //me15
                                                                int jt = 0;
                                                                // Выбор самого древнего задания
                                                                for (int lz = 0; lz <= KZ; lz++) {
                                                                    if (lz != j && jt >= Z[6][lz]) {
                                                                        jz = lz;
                                                                        jt = Z[6][j];
                                                                    }
                                                                }
                                                                if (jz == 0) {
                                                                    gg = 1;
                                                                    break;
                                                                }
                                                                Z[10][jz]--;
                                                            }
                                                            //me18
                                                            Z[9][jz] -= 1;
                                                            if (win5_dynamic_checkbox.isSelected() && rrSelected) {
                                                                sb.append(String.format("Т=%6d;  Откачана страница задания %2d\n", T, jz));
                                                            }
                                                            bb = 1;
                                                        }
                                                        if (bb == 0) ISStr--;
                                                        //me16
                                                        Z[9][j]++;
                                                    }
                                                    Z[10][j]++;
                                                    k1 += TOS1;
                                                    k2 += TOS2;
                                                    ksvp = Z[10][j];
                                                    if (win5_dynamic_checkbox.isSelected() && rrSelected) {
                                                        sb.append(String.format("Т=%6d; Подкачана страница задания %2d\n", T, j));
                                                    }
                                                    if (ksvp >= iss) break;//
                                                }
                                                if (gg == 1) continue;
//                                    int buf = (mm(i, ip, j, k1, TOS1, k2, TOS2, ksvp, T, iss, jz, ISStr, KZ));
                                            }
                                            Y[2][i] = j;
                                            Y[3][i] = Z[9 + 3 * ip][j];
                                            Z[1][j] = 2;
                                            Z[3][j] = ip;
                                            Z[6][j] = T;
                                            break;
                                        }
                                    }
                                }
                            }
                        }
                        if (Y[2][1] != 0) Y[3][1] += k1;
                        if (Y[2][2] != 0) Y[3][2] += k2;
                        T++;
                        for (int i = 1; i <= KY; i++) {
                            if (Y[2][i] != 0) {
                                Y[3][i]--;
                                int iz = Y[2][i];
                                if (Y[3][i] == 0) {
                                    Y[2][i] = 0;
                                    Z[1][iz] = 1;
                                    if (Z[2][iz] == Z[3][iz]) {
                                        Z[1][iz] = 9;
                                        ISStr += Z[9][iz];
                                        if (rrSelected) sb.append(String.format("Т=%6d; Закончилось задание %2d; Свободно страниц %4d\n", T, iz, ISStr));
                                    }
                                }
                            }
                        }
                        KZC = 0;
                        for (int i = 1; i <= KZ; i++) {
                            if (Z[1][i] == 9) KZC++;
                        }
                        if (KZC == KZ) {
                            if (rrSelected) {
                                sb.append("--------------------------------------------------\n");
                                sb.append(String.format("Т= %5d; KZ=%3d; KY=%3d;\n", T, KZ, KY));
                                sb.append(String.format("Всего решено заданий %3d\n", KZC));
                            }
                            int TC = 0;
                            if (KZC > 0) TC = Math.round((float) T / KZC);
                            if (rrSelected) sb.append(String.format("Среднее время решения одного задания ТС=%6d\n", TC));
                            else {
                                sb.append(String.format("id=%3d, КУ=%3d, KZ=%3d, KPC=%3d, TPC=%3d, VPC=%3d, KSStr=%3d, ЗЦП=%3d, ЗМД=%3d\n", id5, KY, KZ, KPC,TPC,VPC,KSStr, TOS1, TOS2));
                                sb.append(String.format("          Результат: Ср. время: 3%d, Сумм. время: %d\n", TC, T));
                                sb.append("--------------------------------------------------\n");
                            }
                            tab5Data.add(new Tab4Liner(id5, KPC, TPC, KZ, KY, KSStr, VPC, T, TC, TOS1, TOS2));
                            id5++;
                            break;
                        }
                    }
                }
            }
        }

        jurText5.setText(sb.toString());
        generateChart5();
        disableFields(false);
    }



    private int SVP(int SZ, int SP, int SZR, int SPR){
        int SZT;
        for (int i = 1; i<SZ;i++){
            SZT=RandomRange(1, SZ);
            if (SZT<=SZR){
                SZT=RandomRange(1, SZ);
                if (SZT <=SP)SPR++;
            }
        }
        return SPR;
    }

    private String SMap (int T, int KSd, int [] Sd){
        StringBuilder _sb = new StringBuilder();
        _sb.append(String.format("Т= %5d; Карта памяти:\n", T));
        int k = 1;
        for (int i = 1; i<= Math.round(KSd/50.0);i++){
            for(int j = 1; j<=50; j++) {
                _sb.append(IntToChar(Sd[k]));
//                jurText.appendText(IntToChar(Sd[k]) + "");
                k++;
            }
            _sb.append('\n');
//            jurText.appendText("\n");
        }
        return _sb.toString();
    }

    private char IntToChar(int in){
        final char[] mChars = {'0','1','2','3','4','5','6','7','8','9'
                ,'A','B','C','D','E','F','G','H','I','J'
                ,'K','L','M','N','P','Q','R','S','T','U'
                ,'V','W','X','Y','Z','Д','Ё','Ж','И','Л'
                ,'П','W','Ф','Ц','Ч','Ш','Щ','Ъ','Ы','Ь'
                ,'Э','Ю','Я','@','#','&','*','+','^','$'
        };
        return mChars[in];
    }

    private char getCode(int iz){
        char c = (char) 48;
        if (iz <= 9) {
            c = (char) (48 + iz);
        } else if (iz <= 30) {
            c = (char) (65 + (iz - 10));
        }
        return c;
    }

    private boolean me80(int i, int js, int KSd, int[] Sd){
//        js = js + 1;
        if (i+js < KSd){
            return Sd[i + js] != 0;
        }
        return true;
    }

    private void zADS(int T, int IZ, int KY, int TPC, int KPC, int VPC){
//        int[][] m50x30 = new int[50][30];
        for (int i = 1; i<51;i++ ) Z[i][IZ] = 0;
        Z[4][IZ] = T;
        int kp = RandomRange(KPCMin, KPC);
        Z[2][IZ] = kp;
        int SZ = 0;
        for (int i = 1; i<=kp;i++){
            Z[ 8+3*i] [IZ] = RandomRange(1, KY);
            Z[ 9+3*i] [IZ] = RandomRange(TPCMin,TPC);
            int sp = RandomRange(VPCMin, VPC);
            SZ+=sp;
            Z[10+3*i] [IZ] = sp;
        }
        Z[7][IZ] = SZ;
        Z[8][IZ] = RandomRange(FSMin, FS);
    }


    private String WZS(int IZ){
        int T = Z[4][IZ];
        int SZ = Z[7][IZ];
        int kp = Z[2][IZ];
        StringBuilder _sb = new StringBuilder();
        _sb.append(String.format("Задача%3d (Код \"%1s\"); T=%5d; ОЗУ=%d; KP=%3d;\n", IZ, getCode(IZ), T, SZ, kp));

        for (int i = 1; i<=kp;i++)
            _sb.append(String.format("           Процесс %2d: Y=%2d; TY=%4d; ОЗУ=%d;\n", i,  Z[8+3*i][IZ],Z[9+3*i][IZ], Z[10+3*i][IZ]));
        return _sb.toString();
    }

    public static int RandomRange(int min, int max)
    {
        max -= min;
        return (int) (Math.random() * ++max) + min;
    }

    private void generateChart1(){
        chart1.getData().clear();
        ArrayList<Integer> x = new ArrayList<>();
        ArrayList<Integer> y = new ArrayList<>();
        Set<Integer> argSet = new HashSet<>();

        String nameSeries = "";
        switch (x1.getValue()){
            case "id":
                for (Tab1Liner tab1Datum : tab1Data) {x.add(tab1Datum.getId());}
                break;
            case "Макс. КП":
                for (Tab1Liner tab1Datum : tab1Data) {x.add(tab1Datum.getKp());}
                break;
            case "Макс. прод.":
                for (Tab1Liner tab1Datum : tab1Data) {x.add(tab1Datum.getProd());}
                break;
            case "КЗ":
                for (Tab1Liner tab1Datum : tab1Data) {x.add(tab1Datum.getKz());}
                break;
            case "Макс. КУ":
                for (Tab1Liner tab1Datum : tab1Data) {x.add(tab1Datum.getKy());}
                break;
            case "Общ. об. пам.":
                for (Tab1Liner tab1Datum : tab1Data) {x.add(tab1Datum.getOb());}
                break;
            case "Сумм. время":
                for (Tab1Liner tab1Datum : tab1Data) {x.add(tab1Datum.getSumTime());}
                break;
            case "Ср. время":
                for (Tab1Liner tab1Datum : tab1Data) {x.add(tab1Datum.getSrTime());}
                break;
        }
        switch (y1.getValue()){
            case "id":
                for (Tab1Liner tab1Datum : tab1Data) {y.add(tab1Datum.getId());}
                break;
            case "Макс. КП":
                for (Tab1Liner tab1Datum : tab1Data) {y.add(tab1Datum.getKp());}
                break;
            case "Макс. прод.":
                for (Tab1Liner tab1Datum : tab1Data) {y.add(tab1Datum.getProd());}
                break;
            case "КЗ":
                for (Tab1Liner tab1Datum : tab1Data) {y.add(tab1Datum.getKz());}
                break;
            case "Макс. КУ":
                for (Tab1Liner tab1Datum : tab1Data) {y.add(tab1Datum.getKy());}
                break;
            case "Общ. об. пам.":
                for (Tab1Liner tab1Datum : tab1Data) {y.add(tab1Datum.getOb());}
                break;
            case "Сумм. время":
                for (Tab1Liner tab1Datum : tab1Data) {y.add(tab1Datum.getSumTime());}
                break;
            case "Ср. время":
                for (Tab1Liner tab1Datum : tab1Data) {y.add(tab1Datum.getSrTime());}
                break;
        }
        switch (arg1.getValue()){
            case "id":
                for (Tab1Liner tab1Datum : tab1Data) {argSet.add(tab1Datum.getId());}
                nameSeries="id";
                break;
            case "Макс. КП":
                for (Tab1Liner tab1Datum : tab1Data) {argSet.add(tab1Datum.getKp());}
                nameSeries="Макс. КП";
                break;
            case "Макс. прод.":
                for (Tab1Liner tab1Datum : tab1Data) {argSet.add(tab1Datum.getProd());}
                nameSeries="Макс. прод.";
                break;
            case "КЗ":
                for (Tab1Liner tab1Datum : tab1Data) {argSet.add(tab1Datum.getKz());}
                nameSeries="КЗ";
                break;
            case "Макс. КУ":
                for (Tab1Liner tab1Datum : tab1Data) {argSet.add(tab1Datum.getKy());}
                nameSeries="Макс. КУ";
                break;
            case "Общ. об. пам.":
                for (Tab1Liner tab1Datum : tab1Data) {argSet.add(tab1Datum.getOb());}
                nameSeries="Общ. об. пам.";
                break;
            case "Сумм. время":
                for (Tab1Liner tab1Datum : tab1Data) {argSet.add(tab1Datum.getSumTime());}
                nameSeries="Сумм. время";
                break;
            case "Ср. время":
                for (Tab1Liner tab1Datum : tab1Data) {argSet.add(tab1Datum.getSrTime());}
                nameSeries="Ср. время";
                break;
        }

        ArrayList<Integer> arg = new ArrayList<>(argSet);
        for (Integer integer : arg) {
            XYChart.Series<Number, Number> series = new XYChart.Series<>();
            series.setName(nameSeries + " = " + integer);
            for (int i = 0;i<tab1Data.size();i++){
                int comp = 0;
                switch (nameSeries){
                    case "id": comp = tab1Data.get(i).getId(); break;
                    case "Макс. КП": comp = tab1Data.get(i).getKp(); break;
                    case "Макс. прод.": comp = tab1Data.get(i).getProd(); break;
                    case "КЗ": comp = tab1Data.get(i).getKz(); break;
                    case "Макс. КУ": comp = tab1Data.get(i).getKy(); break;
                    case "Общ. об. пам.": comp = tab1Data.get(i).getOb(); break;
                    case "Сумм. время": comp = tab1Data.get(i).getSumTime(); break;
                    case "Ср. время": comp = tab1Data.get(i).getSrTime(); break;
                }
                if (comp == integer)
                    series.getData().add(new XYChart.Data<>(x.get(i), y.get(i)));
            }
            chart1.getData().add(series);
        }

    }

    private void generateChart2(){
        chart2.getData().clear();
        ArrayList<Integer> x = new ArrayList<>();
        ArrayList<Integer> y = new ArrayList<>();
        Set<Integer> argSet = new HashSet<>();

        String nameSeries = "";
        switch (x2.getValue()){
            case "id":
                for (Tab2Liner tab2Datum : tab2Data) {x.add(tab2Datum.getId());}
                break;
            case "Макс. КП":
                for (Tab2Liner tab2Datum : tab2Data) {x.add(tab2Datum.getKp());}
                break;
            case "Макс. прод.":
                for (Tab2Liner tab2Datum : tab2Data) {x.add(tab2Datum.getProd());}
                break;
            case "КЗ":
                for (Tab2Liner tab2Datum : tab2Data) {x.add(tab2Datum.getKz());}
                break;
            case "Макс. КУ":
                for (Tab2Liner tab2Datum : tab2Data) {x.add(tab2Datum.getKy());}
                break;
            case "Общ. об. пам.":
                for (Tab2Liner tab2Datum : tab2Data) {x.add(tab2Datum.getOb());}
                break;
            case "Затраты ЦП":
                for (Tab2Liner tab2Datum : tab2Data) {x.add(tab2Datum.getCp());}
                nameSeries="Затраты ЦП";
                break;
            case "Сумм. время":
                for (Tab2Liner tab2Datum : tab2Data) {x.add(tab2Datum.getSumTime());}
                break;
            case "Ср. время":
                for (Tab2Liner tab2Datum : tab2Data) {x.add(tab2Datum.getSrTime());}
                break;
        }
        switch (y2.getValue()){
            case "id":
                for (Tab2Liner tab2Datum : tab2Data) {y.add(tab2Datum.getId());}
                break;
            case "Макс. КП":
                for (Tab2Liner tab2Datum : tab2Data) {y.add(tab2Datum.getKp());}
                break;
            case "Макс. прод.":
                for (Tab2Liner tab2Datum : tab2Data) {y.add(tab2Datum.getProd());}
                break;
            case "КЗ":
                for (Tab2Liner tab2Datum : tab2Data) {y.add(tab2Datum.getKz());}
                break;
            case "Макс. КУ":
                for (Tab2Liner tab2Datum : tab2Data) {y.add(tab2Datum.getKy());}
                break;
            case "Общ. об. пам.":
                for (Tab2Liner tab2Datum : tab2Data) {y.add(tab2Datum.getOb());}
                break;
            case "Затраты ЦП":
                for (Tab2Liner tab2Datum : tab2Data) {y.add(tab2Datum.getCp());}
                nameSeries="Затраты ЦП";
                break;
            case "Сумм. время":
                for (Tab2Liner tab2Datum : tab2Data) {y.add(tab2Datum.getSumTime());}
                break;
            case "Ср. время":
                for (Tab2Liner tab2Datum : tab2Data) {y.add(tab2Datum.getSrTime());}
                break;
        }
        switch (arg2.getValue()){
            case "id":
                for (Tab2Liner tab2Datum : tab2Data) {argSet.add(tab2Datum.getId());}
                nameSeries="id";
                break;
            case "Макс. КП":
                for (Tab2Liner tab2Datum : tab2Data) {argSet.add(tab2Datum.getKp());}
                nameSeries="Макс. КП";
                break;
            case "Макс. прод.":
                for (Tab2Liner tab2Datum : tab2Data) {argSet.add(tab2Datum.getProd());}
                nameSeries="Макс. прод.";
                break;
            case "КЗ":
                for (Tab2Liner tab2Datum : tab2Data) {argSet.add(tab2Datum.getKz());}
                nameSeries="КЗ";
                break;
            case "Макс. КУ":
                for (Tab2Liner tab2Datum : tab2Data) {argSet.add(tab2Datum.getKy());}
                nameSeries="Макс. КУ";
                break;
            case "Общ. об. пам.":
                for (Tab2Liner tab2Datum : tab2Data) {argSet.add(tab2Datum.getOb());}
                nameSeries="Общ. об. пам.";
                break;
            case "Затраты ЦП":
                for (Tab2Liner tab2Datum : tab2Data) {argSet.add(tab2Datum.getCp());}
                nameSeries="Затраты ЦП";
                break;
            case "Сумм. время":
                for (Tab2Liner tab2Datum : tab2Data) {argSet.add(tab2Datum.getSumTime());}
                nameSeries="Сумм. время";
                break;
            case "Ср. время":
                for (Tab2Liner tab2Datum : tab2Data) {argSet.add(tab2Datum.getSrTime());}
                nameSeries="Ср. время";
                break;
        }

        ArrayList<Integer> arg = new ArrayList<>(argSet);
        for (Integer integer : arg) {
            XYChart.Series<Number, Number> series = new XYChart.Series<>();
            series.setName(nameSeries + " = " + integer);
            for (int i = 0;i<tab2Data.size();i++){
                int comp = 0;
                switch (nameSeries){
                    case "id": comp = tab2Data.get(i).getId(); break;
                    case "Макс. КП": comp = tab2Data.get(i).getKp(); break;
                    case "Макс. прод.": comp = tab2Data.get(i).getProd(); break;
                    case "КЗ": comp = tab2Data.get(i).getKz(); break;
                    case "Макс. КУ": comp = tab2Data.get(i).getKy(); break;
                    case "Общ. об. пам.": comp = tab2Data.get(i).getOb(); break;
                    case "Затраты ЦП": comp = tab2Data.get(i).getCp(); break;
                    case "Сумм. время": comp = tab2Data.get(i).getSumTime(); break;
                    case "Ср. время": comp = tab2Data.get(i).getSrTime(); break;
                }
                if (comp == integer)
                    series.getData().add(new XYChart.Data<>(x.get(i), y.get(i)));
            }
            chart2.getData().add(series);
        }
    }


    private void generateChart3(){
        chart3.getData().clear();
        ArrayList<Integer> x = new ArrayList<>();
        ArrayList<Integer> y = new ArrayList<>();
        Set<Integer> argSet = new HashSet<>();

        String nameSeries = "";
        switch (x3.getValue()){
            case "id":
                for (Tab3Liner tab3Datum : tab3Data) {x.add(tab3Datum.getId());}
                break;
            case "Макс. КП":
                for (Tab3Liner tab3Datum : tab3Data) {x.add(tab3Datum.getKp());}
                break;
            case "Макс. прод.":
                for (Tab3Liner tab3Datum : tab3Data) {x.add(tab3Datum.getProd());}
                break;
            case "КЗ":
                for (Tab3Liner tab3Datum : tab3Data) {x.add(tab3Datum.getKz());}
                break;
            case "Макс. КУ":
                for (Tab3Liner tab3Datum : tab3Data) {x.add(tab3Datum.getKy());}
                break;
            case "КР":
                for (Tab3Liner tab3Datum : tab3Data) {x.add(tab3Datum.getKr());}
                break;
            case "Сумм. время":
                for (Tab3Liner tab3Datum : tab3Data) {x.add(tab3Datum.getSumTime());}
                break;
            case "Ср. время":
                for (Tab3Liner tab3Datum : tab3Data) {x.add(tab3Datum.getSrTime());}
                break;
        }
        switch (y3.getValue()){
            case "id":
                for (Tab3Liner tab3Datum : tab3Data) {y.add(tab3Datum.getId());}
                break;
            case "Макс. КП":
                for (Tab3Liner tab3Datum : tab3Data) {y.add(tab3Datum.getKp());}
                break;
            case "Макс. прод.":
                for (Tab3Liner tab3Datum : tab3Data) {y.add(tab3Datum.getProd());}
                break;
            case "КЗ":
                for (Tab3Liner tab3Datum : tab3Data) {y.add(tab3Datum.getKz());}
                break;
            case "Макс. КУ":
                for (Tab3Liner tab3Datum : tab3Data) {y.add(tab3Datum.getKy());}
                break;
            case "КР":
                for (Tab3Liner tab3Datum : tab3Data) {y.add(tab3Datum.getKr());}
                break;
            case "Сумм. время":
                for (Tab3Liner tab3Datum : tab3Data) {y.add(tab3Datum.getSumTime());}
                break;
            case "Ср. время":
                for (Tab3Liner tab3Datum : tab3Data) {y.add(tab3Datum.getSrTime());}
                break;
        }
        switch (arg3.getValue()){
            case "id":
                for (Tab3Liner tab3Datum : tab3Data) {argSet.add(tab3Datum.getId());}
                nameSeries="id";
                break;
            case "Макс. КП":
                for (Tab3Liner tab3Datum : tab3Data) {argSet.add(tab3Datum.getKp());}
                nameSeries="Макс. КП";
                break;
            case "Макс. прод.":
                for (Tab3Liner tab3Datum : tab3Data) {argSet.add(tab3Datum.getProd());}
                nameSeries="Макс. прод.";
                break;
            case "КЗ":
                for (Tab3Liner tab3Datum : tab3Data) {argSet.add(tab3Datum.getKz());}
                nameSeries="КЗ";
                break;
            case "Макс. КУ":
                for (Tab3Liner tab3Datum : tab3Data) {argSet.add(tab3Datum.getKy());}
                nameSeries="Макс. КУ";
                break;
            case "КР":
                for (Tab3Liner tab3Datum : tab3Data) {argSet.add(tab3Datum.getKr());}
                nameSeries="КР";
                break;
            case "Сумм. время":
                for (Tab3Liner tab3Datum : tab3Data) {argSet.add(tab3Datum.getSumTime());}
                nameSeries="Сумм. время";
                break;
            case "Ср. время":
                for (Tab3Liner tab3Datum : tab3Data) {argSet.add(tab3Datum.getSrTime());}
                nameSeries="Ср. время";
                break;
        }

        ArrayList<Integer> arg = new ArrayList<>(argSet);
        for (Integer integer : arg) {
            XYChart.Series<Number, Number> series = new XYChart.Series<>();
            series.setName(nameSeries + " = " + integer);
            for (int i = 0;i<tab3Data.size();i++){
                int comp = 0;
                switch (nameSeries){
                    case "id": comp = tab3Data.get(i).getId(); break;
                    case "Макс. КП": comp = tab3Data.get(i).getKp(); break;
                    case "Макс. прод.": comp = tab3Data.get(i).getProd(); break;
                    case "КЗ": comp = tab3Data.get(i).getKz(); break;
                    case "Макс. КУ": comp = tab3Data.get(i).getKy(); break;
                    case "КР": comp = tab3Data.get(i).getKr(); break;
                    case "Сумм. время": comp = tab3Data.get(i).getSumTime(); break;
                    case "Ср. время": comp = tab3Data.get(i).getSrTime(); break;
                }
                if (comp == integer)
                    series.getData().add(new XYChart.Data<>(x.get(i), y.get(i)));
            }
            chart3.getData().add(series);
        }

    }

    private void generateChart4(){
        chart4.getData().clear();
        ArrayList<Integer> x = new ArrayList<>();
        ArrayList<Integer> y = new ArrayList<>();
        Set<Integer> argSet = new HashSet<>();

        String nameSeries = "";
        switch (x4.getValue()){
            case "id":
                for (Tab4Liner tab4Datum : tab4Data) {x.add(tab4Datum.getId());}
                break;
            case "Макс. КП":
                for (Tab4Liner tab4Datum : tab4Data) {x.add(tab4Datum.getKp());}
                break;
            case "Макс. прод.":
                for (Tab4Liner tab4Datum : tab4Data) {x.add(tab4Datum.getProd());}
                break;
            case "КЗ":
                for (Tab4Liner tab4Datum : tab4Data) {x.add(tab4Datum.getKz());}
                break;
            case "Макс. КУ":
                for (Tab4Liner tab4Datum : tab4Data) {x.add(tab4Datum.getKy());}
                break;
            case "Общ. об. пам.":
                for (Tab4Liner tab4Datum : tab4Data) {x.add(tab4Datum.getOb());}
                break;
            case "Затраты ЦП":
                for (Tab4Liner tab4Datum : tab4Data) {x.add(tab4Datum.getCp());}
                break;
            case "Затраты МД":
                for (Tab4Liner tab4Datum : tab4Data) {x.add(tab4Datum.getMd());}
                break;
            case "Сумм. время":
                for (Tab4Liner tab4Datum : tab4Data) {x.add(tab4Datum.getSumTime());}
                break;
            case "Ср. время":
                for (Tab4Liner tab4Datum : tab4Data) {x.add(tab4Datum.getSrTime());}
                break;
        }
        switch (y4.getValue()){
            case "id":
                for (Tab4Liner tab4Datum : tab4Data) {y.add(tab4Datum.getId());}
                break;
            case "Макс. КП":
                for (Tab4Liner tab4Datum : tab4Data) {y.add(tab4Datum.getKp());}
                break;
            case "Макс. прод.":
                for (Tab4Liner tab4Datum : tab4Data) {y.add(tab4Datum.getProd());}
                break;
            case "КЗ":
                for (Tab4Liner tab4Datum : tab4Data) {y.add(tab4Datum.getKz());}
                break;
            case "Макс. КУ":
                for (Tab4Liner tab4Datum : tab4Data) {y.add(tab4Datum.getKy());}
                break;
            case "Общ. об. пам.":
                for (Tab4Liner tab4Datum : tab4Data) {y.add(tab4Datum.getOb());}
                break;
            case "Затраты ЦП":
                for (Tab4Liner tab4Datum : tab4Data) {y.add(tab4Datum.getCp());}
                break;
            case "Затраты МД":
                for (Tab4Liner tab4Datum : tab4Data) {y.add(tab4Datum.getMd());}
                break;
            case "Сумм. время":
                for (Tab4Liner tab4Datum : tab4Data) {y.add(tab4Datum.getSumTime());}
                break;
            case "Ср. время":
                for (Tab4Liner tab4Datum : tab4Data) {y.add(tab4Datum.getSrTime());}
                break;
        }
        switch (arg4.getValue()){
            case "id":
                for (Tab4Liner tab4Datum : tab4Data) {argSet.add(tab4Datum.getId());}
                nameSeries="id";
                break;
            case "Макс. КП":
                for (Tab4Liner tab4Datum : tab4Data) {argSet.add(tab4Datum.getKp());}
                nameSeries="Макс. КП";
                break;
            case "Макс. прод.":
                for (Tab4Liner tab4Datum : tab4Data) {argSet.add(tab4Datum.getProd());}
                nameSeries="Макс. прод.";
                break;
            case "КЗ":
                for (Tab4Liner tab4Datum : tab4Data) {argSet.add(tab4Datum.getKz());}
                nameSeries="КЗ";
                break;
            case "Макс. КУ":
                for (Tab4Liner tab4Datum : tab4Data) {argSet.add(tab4Datum.getKy());}
                nameSeries="Макс. КУ";
                break;
            case "Общ. об. пам.":
                for (Tab4Liner tab4Datum : tab4Data) {argSet.add(tab4Datum.getOb());}
                nameSeries="Общ. об. пам.";
                break;
            case "Затраты ЦП":
                for (Tab4Liner tab4Datum : tab4Data) {argSet.add(tab4Datum.getCp());}
                nameSeries="Затраты ЦП";
                break;
            case "Затраты МД":
                for (Tab4Liner tab4Datum : tab4Data) {argSet.add(tab4Datum.getMd());}
                nameSeries="Затраты МД";
                break;
            case "Сумм. время":
                for (Tab4Liner tab4Datum : tab4Data) {argSet.add(tab4Datum.getSumTime());}
                nameSeries="Сумм. время";
                break;
            case "Ср. время":
                for (Tab4Liner tab4Datum : tab4Data) {argSet.add(tab4Datum.getSrTime());}
                nameSeries="Ср. время";
                break;
        }

        ArrayList<Integer> arg = new ArrayList<>(argSet);
        for (Integer integer : arg) {
            XYChart.Series<Number, Number> series = new XYChart.Series<>();
            series.setName(nameSeries + " = " + integer);
            for (int i = 0;i<tab4Data.size();i++){
                int comp = 0;
                switch (nameSeries){
                    case "id": comp = tab4Data.get(i).getId(); break;
                    case "Макс. КП": comp = tab4Data.get(i).getKp(); break;
                    case "Макс. прод.": comp = tab4Data.get(i).getProd(); break;
                    case "КЗ": comp = tab4Data.get(i).getKz(); break;
                    case "Макс. КУ": comp = tab4Data.get(i).getKy(); break;
                    case "Общ. об. пам.": comp = tab4Data.get(i).getOb(); break;
                    case "Затраты ЦП": comp = tab4Data.get(i).getCp(); break;
                    case "Затраты МД": comp = tab4Data.get(i).getMd(); break;
                    case "Сумм. время": comp = tab4Data.get(i).getSumTime(); break;
                    case "Ср. время": comp = tab4Data.get(i).getSrTime(); break;
                }
                if (comp == integer)
                    series.getData().add(new XYChart.Data<>(x.get(i), y.get(i)));
            }
            chart4.getData().add(series);
        }

    }

    private void generateChart5(){
        chart5.getData().clear();
        ArrayList<Integer> x = new ArrayList<>();
        ArrayList<Integer> y = new ArrayList<>();
        Set<Integer> argSet = new HashSet<>();

        String nameSeries = "";
        switch (x5.getValue()){
            case "id":
                for (Tab4Liner tab4Datum : tab5Data) {x.add(tab4Datum.getId());}
                break;
            case "Макс. КП":
                for (Tab4Liner tab4Datum : tab5Data) {x.add(tab4Datum.getKp());}
                break;
            case "Макс. прод.":
                for (Tab4Liner tab4Datum : tab5Data) {x.add(tab4Datum.getProd());}
                break;
            case "КЗ":
                for (Tab4Liner tab4Datum : tab5Data) {x.add(tab4Datum.getKz());}
                break;
            case "Макс. КУ":
                for (Tab4Liner tab4Datum : tab5Data) {x.add(tab4Datum.getKy());}
                break;
            case "Общ. об. пам.":
                for (Tab4Liner tab4Datum : tab5Data) {x.add(tab4Datum.getOb());}
                break;
            case "Затраты ЦП":
                for (Tab4Liner tab4Datum : tab5Data) {x.add(tab4Datum.getCp());}
                break;
            case "Затраты МД":
                for (Tab4Liner tab4Datum : tab5Data) {x.add(tab4Datum.getMd());}
                break;
            case "Сумм. время":
                for (Tab4Liner tab4Datum : tab5Data) {x.add(tab4Datum.getSumTime());}
                break;
            case "Ср. время":
                for (Tab4Liner tab4Datum : tab5Data) {x.add(tab4Datum.getSrTime());}
                break;
        }
        switch (y5.getValue()){
            case "id":
                for (Tab4Liner tab4Datum : tab5Data) {y.add(tab4Datum.getId());}
                break;
            case "Макс. КП":
                for (Tab4Liner tab4Datum : tab5Data) {y.add(tab4Datum.getKp());}
                break;
            case "Макс. прод.":
                for (Tab4Liner tab4Datum : tab5Data) {y.add(tab4Datum.getProd());}
                break;
            case "КЗ":
                for (Tab4Liner tab4Datum : tab5Data) {y.add(tab4Datum.getKz());}
                break;
            case "Макс. КУ":
                for (Tab4Liner tab4Datum : tab5Data) {y.add(tab4Datum.getKy());}
                break;
            case "Общ. об. пам.":
                for (Tab4Liner tab4Datum : tab5Data) {y.add(tab4Datum.getOb());}
                break;
            case "Затраты ЦП":
                for (Tab4Liner tab4Datum : tab5Data) {y.add(tab4Datum.getCp());}
                break;
            case "Затраты МД":
                for (Tab4Liner tab4Datum : tab5Data) {y.add(tab4Datum.getMd());}
                break;
            case "Сумм. время":
                for (Tab4Liner tab4Datum : tab5Data) {y.add(tab4Datum.getSumTime());}
                break;
            case "Ср. время":
                for (Tab4Liner tab4Datum : tab5Data) {y.add(tab4Datum.getSrTime());}
                break;
        }
        switch (arg5.getValue()){
            case "id":
                for (Tab4Liner tab4Datum : tab5Data) {argSet.add(tab4Datum.getId());}
                nameSeries="id";
                break;
            case "Макс. КП":
                for (Tab4Liner tab4Datum : tab5Data) {argSet.add(tab4Datum.getKp());}
                nameSeries="Макс. КП";
                break;
            case "Макс. прод.":
                for (Tab4Liner tab4Datum : tab5Data) {argSet.add(tab4Datum.getProd());}
                nameSeries="Макс. прод.";
                break;
            case "КЗ":
                for (Tab4Liner tab4Datum : tab5Data) {argSet.add(tab4Datum.getKz());}
                nameSeries="КЗ";
                break;
            case "Макс. КУ":
                for (Tab4Liner tab4Datum : tab5Data) {argSet.add(tab4Datum.getKy());}
                nameSeries="Макс. КУ";
                break;
            case "Общ. об. пам.":
                for (Tab4Liner tab4Datum : tab5Data) {argSet.add(tab4Datum.getOb());}
                nameSeries="Общ. об. пам.";
                break;
            case "Затраты ЦП":
                for (Tab4Liner tab4Datum : tab5Data) {argSet.add(tab4Datum.getCp());}
                nameSeries="Затраты ЦП";
                break;
            case "Затраты МД":
                for (Tab4Liner tab4Datum : tab5Data) {argSet.add(tab4Datum.getMd());}
                nameSeries="Затраты МД";
                break;
            case "Сумм. время":
                for (Tab4Liner tab4Datum : tab5Data) {argSet.add(tab4Datum.getSumTime());}
                nameSeries="Сумм. время";
                break;
            case "Ср. время":
                for (Tab4Liner tab4Datum : tab5Data) {argSet.add(tab4Datum.getSrTime());}
                nameSeries="Ср. время";
                break;
        }

        ArrayList<Integer> arg = new ArrayList<>(argSet);
        for (Integer integer : arg) {
            XYChart.Series<Number, Number> series = new XYChart.Series<>();
            series.setName(nameSeries + " = " + integer);
            for (int i = 0;i<tab5Data.size();i++){
                int comp = 0;
                switch (nameSeries){
                    case "id": comp = tab5Data.get(i).getId(); break;
                    case "Макс. КП": comp = tab5Data.get(i).getKp(); break;
                    case "Макс. прод.": comp = tab5Data.get(i).getProd(); break;
                    case "КЗ": comp = tab5Data.get(i).getKz(); break;
                    case "Макс. КУ": comp = tab5Data.get(i).getKy(); break;
                    case "Общ. об. пам.": comp = tab5Data.get(i).getOb(); break;
                    case "Затраты ЦП": comp = tab5Data.get(i).getCp(); break;
                    case "Затраты МД": comp = tab5Data.get(i).getMd(); break;
                    case "Сумм. время": comp = tab5Data.get(i).getSumTime(); break;
                    case "Ср. время": comp = tab5Data.get(i).getSrTime(); break;
                }
                if (comp == integer)
                    series.getData().add(new XYChart.Data<>(x.get(i), y.get(i)));
            }
            chart5.getData().add(series);
        }

    }

    private void disableFields(boolean disable){
        if (disable) {
            win1_run_button.setDisable(true);
            win2_run_button.setDisable(true);
            win3_run_button.setDisable(true);
            win4_run_button.setDisable(true);
            win5_run_button.setDisable(true);
        } else {
            win1_run_button.setDisable(false);
            win2_run_button.setDisable(false);
            win3_run_button.setDisable(false);
            win4_run_button.setDisable(false);
            win5_run_button.setDisable(false);
        }
    }

    @FXML void clickClear1(){
        id1=1;
        jurText1.clear();
        tab1Data.clear();
        chart1.getData().clear();
    }
    @FXML void clickClear2(){
        id2=1;
        jurText2.clear();
        tab2Data.clear();
        chart2.getData().clear();
    }
    @FXML void clickClear3(){
        id3=1;
        jurText3.clear();
        tab3Data.clear();
        chart3.getData().clear();
    }
    @FXML void clickClear4(){
        id4=1;
        jurText4.clear();
        tab4Data.clear();
        chart4.getData().clear();
    }
    @FXML void clickClear5(){
        id5=1;
        jurText5.clear();
        tab5Data.clear();
        chart5.getData().clear();
    }


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        win1_quality_device.setValueFactory(new SpinnerValueFactory.IntegerSpinnerValueFactory(2, 9, 2));
        win1_volume_storage.setValueFactory(new SpinnerValueFactory.IntegerSpinnerValueFactory(100, 2000, 100, 100));
        win1_quality_tests.setValueFactory(new SpinnerValueFactory.IntegerSpinnerValueFactory(1, 30, 1));
        win1_max_process.setValueFactory(new SpinnerValueFactory.IntegerSpinnerValueFactory(2, 8, 2));
        win1_maxTime.setValueFactory(new SpinnerValueFactory.IntegerSpinnerValueFactory(10, 98, 10,5));
        win1_max_volume_process.setValueFactory(new SpinnerValueFactory.IntegerSpinnerValueFactory(10, 250, 10,10));
        tab1_id.setCellValueFactory(new PropertyValueFactory<>("id"));
        tab1_kp.setCellValueFactory(new PropertyValueFactory<>("kp"));
        tab1_prod.setCellValueFactory(new PropertyValueFactory<>("prod"));
        tab1_kz.setCellValueFactory(new PropertyValueFactory<>("kz"));
        tab1_ky.setCellValueFactory(new PropertyValueFactory<>("ky"));
        tab1_ob.setCellValueFactory(new PropertyValueFactory<>("ob"));
        tab1_max_raz.setCellValueFactory(new PropertyValueFactory<>("maxRaz"));
        tab1_sumTime.setCellValueFactory(new PropertyValueFactory<>("sumTime"));
        tab1_srTime.setCellValueFactory(new PropertyValueFactory<>("srTime"));
        table1.setItems(tab1Data);
        ObservableList<String> langs = FXCollections.observableArrayList("id", "Макс. КП", "Макс. прод.", "КЗ", "Макс. КУ", "Общ. об. пам.", "Сумм. время", "Ср. время");
        x1.setItems(langs);
        y1.setItems(langs);
        arg1.setItems(langs);
        x1.setValue("КЗ");
        y1.setValue("Ср. время");
        arg1.setValue("Макс. прод.");
        x1.setOnAction(event -> generateChart1());
        y1.setOnAction(event -> generateChart1());
        arg1.setOnAction(event -> generateChart1());
        accord1.setExpandedPane(tt1);
        table1.setColumnResizePolicy(TableView.UNCONSTRAINED_RESIZE_POLICY);
        rr1.selectedProperty().addListener(
                (ObservableValue<? extends Boolean> ov, Boolean old_val, Boolean new_val) -> {
                    win1_max_process.setDisable(!new_val);
                    win1_quality_tests.setDisable(!new_val);
                    win1_maxTime.setDisable(!new_val);
                });


        win2_quality_device.setValueFactory(new SpinnerValueFactory.IntegerSpinnerValueFactory(2, 9, 2));
        win2_volume_storage.setValueFactory(new SpinnerValueFactory.IntegerSpinnerValueFactory(100, 2000, 100, 100));
        win2_load_cpu.setValueFactory(new SpinnerValueFactory.IntegerSpinnerValueFactory(1, 10, 1));
        win2_quality_tests.setValueFactory(new SpinnerValueFactory.IntegerSpinnerValueFactory(1, 30, 1));
        win2_max_process.setValueFactory(new SpinnerValueFactory.IntegerSpinnerValueFactory(2, 8, 2));
        win2_maxTime.setValueFactory(new SpinnerValueFactory.IntegerSpinnerValueFactory(10, 98, 10,5));
        win2_max_volume_process.setValueFactory(new SpinnerValueFactory.IntegerSpinnerValueFactory(10, 250, 10,10));
        tab2_id.setCellValueFactory(new PropertyValueFactory<>("id"));
        tab2_kp.setCellValueFactory(new PropertyValueFactory<>("kp"));
        tab2_prod.setCellValueFactory(new PropertyValueFactory<>("prod"));
        tab2_kz.setCellValueFactory(new PropertyValueFactory<>("kz"));
        tab2_ky.setCellValueFactory(new PropertyValueFactory<>("ky"));
        tab2_ob.setCellValueFactory(new PropertyValueFactory<>("ob"));
        tab2_CP.setCellValueFactory(new PropertyValueFactory<>("cp"));
        tab2_max_raz.setCellValueFactory(new PropertyValueFactory<>("maxRaz"));
        tab2_sumTime.setCellValueFactory(new PropertyValueFactory<>("sumTime"));
        tab2_srTime.setCellValueFactory(new PropertyValueFactory<>("srTime"));
        table2.setItems(tab2Data);
        ObservableList<String> langs2 = FXCollections.observableArrayList("id", "Макс. КП", "Макс. прод.", "КЗ", "Макс. КУ", "Общ. об. пам.", "Затраты ЦП", "Сумм. время", "Ср. время");
        x2.setItems(langs2);
        y2.setItems(langs2);
        arg2.setItems(langs2);
        x2.setValue("КЗ");
        y2.setValue("Ср. время");
        arg2.setValue("Макс. прод.");
        x2.setOnAction(event -> generateChart2());
        y2.setOnAction(event -> generateChart2());
        arg2.setOnAction(event -> generateChart2());
        accord2.setExpandedPane(tt2);
        table2.setColumnResizePolicy(TableView.UNCONSTRAINED_RESIZE_POLICY);
        rr2.selectedProperty().addListener(
                (ObservableValue<? extends Boolean> ov, Boolean old_val, Boolean new_val) -> {
                    win2_max_process.setDisable(!new_val);
                    win2_quality_tests.setDisable(!new_val);
                    win2_maxTime.setDisable(!new_val);
                });

        win3_quality_device.setValueFactory(new SpinnerValueFactory.IntegerSpinnerValueFactory(2, 9, 2));
        win3_number_sections.setValueFactory(new SpinnerValueFactory.IntegerSpinnerValueFactory(2, 8, 2));
        win3_quality_tests.setValueFactory(new SpinnerValueFactory.IntegerSpinnerValueFactory(1, 30, 1));
        win3_max_process.setValueFactory(new SpinnerValueFactory.IntegerSpinnerValueFactory(2, 8, 2));
        win3_maxTime.setValueFactory(new SpinnerValueFactory.IntegerSpinnerValueFactory(10, 98, 10,5));
        win3_max_volume_process.setValueFactory(new SpinnerValueFactory.IntegerSpinnerValueFactory(10, 500, 10,10));
        tabSpin1.setValueFactory(new SpinnerValueFactory.IntegerSpinnerValueFactory(20, 200, 20,10));
        tabSpin2.setValueFactory(new SpinnerValueFactory.IntegerSpinnerValueFactory(20, 200, 20,10));
        tabSpin3.setValueFactory(new SpinnerValueFactory.IntegerSpinnerValueFactory(20, 200, 20,10));
        tabSpin4.setValueFactory(new SpinnerValueFactory.IntegerSpinnerValueFactory(20, 200, 20,10));
        tabSpin5.setValueFactory(new SpinnerValueFactory.IntegerSpinnerValueFactory(20, 200, 20,10));
        tabSpin6.setValueFactory(new SpinnerValueFactory.IntegerSpinnerValueFactory(20, 200, 20,10));
        tabSpin7.setValueFactory(new SpinnerValueFactory.IntegerSpinnerValueFactory(20, 200, 20,10));
        tabSpin8.setValueFactory(new SpinnerValueFactory.IntegerSpinnerValueFactory(20, 200, 20,10));

        win3_number_sections.valueProperty().addListener((observableValue, integer, t1) -> {
            if (t1 == 8) {
                tabSpin3.setDisable(false);
                tabSpin4.setDisable(false);
                tabSpin5.setDisable(false);
                tabSpin6.setDisable(false);
                tabSpin7.setDisable(false);
                tabSpin8.setDisable(false);
            } else if (t1 == 7) {
                tabSpin3.setDisable(false);
                tabSpin4.setDisable(false);
                tabSpin5.setDisable(false);
                tabSpin6.setDisable(false);
                tabSpin7.setDisable(false);
                tabSpin8.setDisable(true);
            } else if (t1 == 6){
                tabSpin3.setDisable(false);
                tabSpin4.setDisable(false);
                tabSpin5.setDisable(false);
                tabSpin6.setDisable(false);
                tabSpin7.setDisable(true);
                tabSpin8.setDisable(true);
            } else if (t1==5){
                tabSpin3.setDisable(false);
                tabSpin4.setDisable(false);
                tabSpin5.setDisable(false);
                tabSpin6.setDisable(true);
                tabSpin7.setDisable(true);
                tabSpin8.setDisable(true);
            } else if (t1==4){
                tabSpin3.setDisable(false);
                tabSpin4.setDisable(false);
                tabSpin5.setDisable(true);
                tabSpin6.setDisable(true);
                tabSpin7.setDisable(true);
                tabSpin8.setDisable(true);
            } else if (t1==3){
                tabSpin3.setDisable(false);
                tabSpin4.setDisable(true);
                tabSpin5.setDisable(true);
                tabSpin6.setDisable(true);
                tabSpin7.setDisable(true);
                tabSpin8.setDisable(true);
            } else {
                tabSpin3.setDisable(true);
                tabSpin4.setDisable(true);
                tabSpin5.setDisable(true);
                tabSpin6.setDisable(true);
                tabSpin7.setDisable(true);
                tabSpin8.setDisable(true);
            }
        });
        tabSpin3.setDisable(true);
        tabSpin4.setDisable(true);
        tabSpin5.setDisable(true);
        tabSpin6.setDisable(true);
        tabSpin7.setDisable(true);
        tabSpin8.setDisable(true);
        tab3_id.setCellValueFactory(new PropertyValueFactory<>("id"));
        tab3_kp.setCellValueFactory(new PropertyValueFactory<>("kp"));
        tab3_prod.setCellValueFactory(new PropertyValueFactory<>("prod"));
        tab3_kz.setCellValueFactory(new PropertyValueFactory<>("kz"));
        tab3_ky.setCellValueFactory(new PropertyValueFactory<>("ky"));
        tab3_kr.setCellValueFactory(new PropertyValueFactory<>("kr"));
        tab3_max_raz.setCellValueFactory(new PropertyValueFactory<>("maxRaz"));
        tab3_sumTime.setCellValueFactory(new PropertyValueFactory<>("sumTime"));
        tab3_srTime.setCellValueFactory(new PropertyValueFactory<>("srTime"));
        table3.setItems(tab3Data);
        ObservableList<String> langs3 = FXCollections.observableArrayList("id", "Макс. КП", "Макс. прод.", "КЗ", "Макс. КУ", "КР", "Сумм. время", "Ср. время");
        x3.setItems(langs3);
        y3.setItems(langs3);
        arg3.setItems(langs3);
        x3.setValue("КЗ");
        y3.setValue("Ср. время");
        arg3.setValue("Макс. прод.");
        x3.setOnAction(event -> generateChart3());
        y3.setOnAction(event -> generateChart3());
        arg3.setOnAction(event -> generateChart3());
        accord3.setExpandedPane(tt3);
        table3.setColumnResizePolicy(TableView.UNCONSTRAINED_RESIZE_POLICY);
        rr3.selectedProperty().addListener(
                (ObservableValue<? extends Boolean> ov, Boolean old_val, Boolean new_val) -> {
                    win3_max_process.setDisable(!new_val);
                    win3_quality_tests.setDisable(!new_val);
                    win3_maxTime.setDisable(!new_val);
                });

        win4_quality_device.setValueFactory(new SpinnerValueFactory.IntegerSpinnerValueFactory(2, 9, 2));
        win4_volume_storage.setValueFactory(new SpinnerValueFactory.IntegerSpinnerValueFactory(100, 2000, 100, 100));
        win4_load_cpu.setValueFactory(new SpinnerValueFactory.IntegerSpinnerValueFactory(0, 10, 0));
        win4_load_md.setValueFactory(new SpinnerValueFactory.IntegerSpinnerValueFactory(0, 10, 0));
        win4_quality_tests.setValueFactory(new SpinnerValueFactory.IntegerSpinnerValueFactory(1, 30, 1));
        win4_max_process.setValueFactory(new SpinnerValueFactory.IntegerSpinnerValueFactory(2, 8, 2));
        win4_maxTime.setValueFactory(new SpinnerValueFactory.IntegerSpinnerValueFactory(10, 98, 10,5));
        win4_max_volume_process.setValueFactory(new SpinnerValueFactory.IntegerSpinnerValueFactory(10, 250, 10,10));
        tab4_id.setCellValueFactory(new PropertyValueFactory<>("id"));
        tab4_kp.setCellValueFactory(new PropertyValueFactory<>("kp"));
        tab4_prod.setCellValueFactory(new PropertyValueFactory<>("prod"));
        tab4_kz.setCellValueFactory(new PropertyValueFactory<>("kz"));
        tab4_ky.setCellValueFactory(new PropertyValueFactory<>("ky"));
        tab4_ob.setCellValueFactory(new PropertyValueFactory<>("ob"));
        tab4_cp.setCellValueFactory(new PropertyValueFactory<>("cp"));
        tab4_md.setCellValueFactory(new PropertyValueFactory<>("md"));
        tab4_max_raz.setCellValueFactory(new PropertyValueFactory<>("maxRaz"));
        tab4_sumTime.setCellValueFactory(new PropertyValueFactory<>("sumTime"));
        tab4_srTime.setCellValueFactory(new PropertyValueFactory<>("srTime"));
        table4.setItems(tab4Data);
        ObservableList<String> langs4 = FXCollections.observableArrayList("id", "Макс. КП", "Макс. прод.", "КЗ", "Макс. КУ", "Общ. об. пам.", "Затраты ЦП","Затраты МД", "Сумм. время", "Ср. время");
        x4.setItems(langs4);
        y4.setItems(langs4);
        arg4.setItems(langs4);
        x4.setValue("КЗ");
        y4.setValue("Ср. время");
        arg4.setValue("Макс. прод.");
        x4.setOnAction(event -> generateChart4());
        y4.setOnAction(event -> generateChart4());
        arg4.setOnAction(event -> generateChart4());
        accord4.setExpandedPane(tt4);
        table4.setColumnResizePolicy(TableView.UNCONSTRAINED_RESIZE_POLICY);
        rr4.selectedProperty().addListener(
                (ObservableValue<? extends Boolean> ov, Boolean old_val, Boolean new_val) -> {
                    win4_max_process.setDisable(!new_val);
                    win4_quality_tests.setDisable(!new_val);
                    win4_maxTime.setDisable(!new_val);
                });


        win5_quality_device.setValueFactory(new SpinnerValueFactory.IntegerSpinnerValueFactory(2, 9, 2));
        win5_volume_storage.setValueFactory(new SpinnerValueFactory.IntegerSpinnerValueFactory(100, 2000, 100, 100));
        win5_load_cpu.setValueFactory(new SpinnerValueFactory.IntegerSpinnerValueFactory(0, 10, 0));
        win5_load_md.setValueFactory(new SpinnerValueFactory.IntegerSpinnerValueFactory(0, 10, 0));
        win5_quality_tests.setValueFactory(new SpinnerValueFactory.IntegerSpinnerValueFactory(1, 30, 1));
        win5_max_process.setValueFactory(new SpinnerValueFactory.IntegerSpinnerValueFactory(2, 8, 2));
        win5_maxTime.setValueFactory(new SpinnerValueFactory.IntegerSpinnerValueFactory(10, 98, 10,5));
        win5_max_volume_process.setValueFactory(new SpinnerValueFactory.IntegerSpinnerValueFactory(10, 250, 10,10));
        tab5_id.setCellValueFactory(new PropertyValueFactory<>("id"));
        tab5_kp.setCellValueFactory(new PropertyValueFactory<>("kp"));
        tab5_prod.setCellValueFactory(new PropertyValueFactory<>("prod"));
        tab5_kz.setCellValueFactory(new PropertyValueFactory<>("kz"));
        tab5_ky.setCellValueFactory(new PropertyValueFactory<>("ky"));
        tab5_ob.setCellValueFactory(new PropertyValueFactory<>("ob"));
        tab5_cp.setCellValueFactory(new PropertyValueFactory<>("cp"));
        tab5_md.setCellValueFactory(new PropertyValueFactory<>("md"));
        tab5_max_raz.setCellValueFactory(new PropertyValueFactory<>("maxRaz"));
        tab5_sumTime.setCellValueFactory(new PropertyValueFactory<>("sumTime"));
        tab5_srTime.setCellValueFactory(new PropertyValueFactory<>("srTime"));
        table5.setItems(tab5Data);
        ObservableList<String> langs5 = FXCollections.observableArrayList("id", "Макс. КП", "Макс. прод.", "КЗ", "Макс. КУ", "Общ. об. пам.", "Затраты ЦП","Затраты МД", "Сумм. время", "Ср. время");
        x5.setItems(langs5);
        y5.setItems(langs5);
        arg5.setItems(langs5);
        x5.setValue("КЗ");
        y5.setValue("Ср. время");
        arg5.setValue("Макс. прод.");
        x5.setOnAction(event -> generateChart5());
        y5.setOnAction(event -> generateChart5());
        arg5.setOnAction(event -> generateChart5());
        accord5.setExpandedPane(tt5);
        table5.setColumnResizePolicy(TableView.UNCONSTRAINED_RESIZE_POLICY);
        rr5.selectedProperty().addListener(
                (ObservableValue<? extends Boolean> ov, Boolean old_val, Boolean new_val) -> {
                    win5_max_process.setDisable(!new_val);
                    win5_quality_tests.setDisable(!new_val);
                    win5_maxTime.setDisable(!new_val);
                    win5_dynamic_checkbox.setDisable(!new_val);
                });

    }

}