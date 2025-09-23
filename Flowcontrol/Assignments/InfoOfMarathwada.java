package Flowcontrol.Assignments;

import java.util.Scanner;

public class InfoOfMarathwada {

    /*void sambhajinagar(){
        String district="Sambhajinagar";
        int num;
        Scanner sc=new Scanner(System.in);
        System.out.println("\nEnter the district no from serial : ");
        num= sc.nextInt();
        if(num==1){
            //System.out.println(district);
            System.out.println("Below talukas in "+district);
            System.out.println("Kannad: MLA Sanjana Jadhav\nSoyangoan\nSillod\nPhulambri\nAurangabad\nKhuldabad\nVaijapur\nGangapur\nPaithan");
        }
    }

    void jalna(){
        String district="Jalna";
        int num;
        Scanner sc=new Scanner(System.in);
        System.out.println("\nEnter the district no from serial : ");
        num= sc.nextInt();
        if(num==2){
            //System.out.println(district);
            System.out.println("Below talukas in "+district);
            System.out.println("Ambad\nMantha\nJalna\nPartur\nBhokardan\nJafrabad\nBadnapur\nGhansavangi ");
        }
    }


    public static void main(String[] args) {
        InfoOfMarathwada obj = new InfoOfMarathwada();
        obj.sambhajinagar();
        obj.jalna();
    }*/

    //Serial of district of marathwada
    //1.sambhajinagar
    //2.jalna
    //3.beed
    //4.parbhani
    //5.nanded
    //6.Latur
    //7.dharashiv
    //8.hingoli

    public static void main(String[] args) {
        int district;
        String districtName;
        String talukaName="";

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter district number : ");
        district=sc.nextInt();

        switch (district){
            case 1:
                districtName="Sambhajinagar";
                talukaName="Kannad\nSoyangoan\nSillod\nPhulambri\nAurangabad\nKhuldabad\nVaijapur\nGangapur\nPaithan";
                break;

            case 2:
                districtName="Jalna";
                talukaName="Ambad\nMantha\nJalna\nPartur\nBhokardan\nJafrabad\nBadnapur\nGhansavangi ";
                break;

            case 3:
                districtName="Beed";
                talukaName="Georai\nBeed\nMajalgaon\nDharur\nPatoda\nAshti\nParali\nAmbajogai\nKaij\nWadavani\nShirur";
                break;

            case 4:
                districtName="Parbhani";
                talukaName="Jintur\nSelu\nGangakhed\nParbhani\nPurna\nManwat\nPalam\nSonpeth\nPathri";
                break;

            case 5:
                districtName="Nanded";
                talukaName="Hadgaon\nNanded\nKinwat\nBhokar\nBiloli\nDeglur\nMukhed\nKandhar\nLoha";
                break;

            case 6:
                districtName="Latur";
                talukaName="Ausa\nLatur\nNilanga\nRenapur\nChakur\nDevni\nJalkot\nShirur A\nAmhadpur\nUdgir";
                break;

            case 7:
                districtName="Dharashiv";
                talukaName="Tuljapur\nUmarga\nDharashiv\nParanda\nBhoom\nLohara\nWashi\nKalamb";
                break;

            case 8:
                districtName="Hingoli";
                talukaName="Basmat\nHingoli\nAundha-Nagnath\nSengaon\nKalambnuri";
                break;

            default:
                districtName="Not found..!";
                break;
        }
        System.out.println("District name => "+districtName+"\nBelow talukas in "+districtName+"\n"+talukaName);
    }
}
