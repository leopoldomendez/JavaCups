package org.javahispano.javacup.tacticas.jvc2012.realvencedores.equipo;

import org.javahispano.javacup.model.util.Position;

public class Distribucion {

    Position alineacion1[] = new Position[] { new Position(0.2595419847328244, -50.41044776119403),
            new Position(-6.419580419580419, -32.54524886877828), new Position(9.272727272727272, -32.54524886877828),
            new Position(22.349650349650346, -23.755656108597286), new Position(-20.20979020979021, -27.08144796380091),
            new Position(4.9930069930069925, -10.690045248868778), new Position(-8.797202797202797, -12.828054298642533),
            new Position(-23.618320610687025, -0.7835820895522387), new Position(0.951048951048951, -0.7126696832579186),
            new Position(-1.902097902097902, -0.23755656108597287), new Position(22.580152671755727, -1.3059701492537314) };

    Position alineacion2[] = new Position[] { new Position(0.2595419847328244, -50.41044776119403),
            new Position(-6.419580419580419, -32.54524886877828), new Position(9.272727272727272, -32.54524886877828),
            new Position(22.349650349650346, -23.755656108597286), new Position(-20.20979020979021, -27.08144796380091),
            new Position(5.230769230769231, -8.552036199095022), new Position(-6.181818181818182, -8.552036199095022),
            new Position(-28.531468531468533, -1.900452488687783), new Position(11.888111888111888, -1.900452488687783),
            new Position(-11.65034965034965, -1.1877828054298643), new Position(27.81818181818182, -0.7126696832579186) };

    Position alineacion3[] = new Position[] { new Position(0.7132867132867133, -49.411764705882355),
            new Position(-5.944055944055944, -33.970588235294116), new Position(11.65034965034965, -34.20814479638009),
            new Position(25.916083916083913, -13.065610859728507), new Position(-24.48951048951049, -19.717194570135746),
            new Position(0.0, -8.552036199095022), new Position(11.412587412587413, 8.076923076923077),
            new Position(-9.034965034965035, 9.97737556561086), new Position(-0.23776223776223776, 37.05882352941177),
            new Position(-15.692307692307693, 29.457013574660635), new Position(18.06993006993007, 30.407239819004527) };

    Position alineacion4[] = new Position[] { new Position(0.2595419847328244, -50.41044776119403),
            new Position(-6.419580419580419, -32.54524886877828), new Position(9.272727272727272, -32.54524886877828),
            new Position(28.293706293706293, -33.49547511312217), new Position(-25.678321678321677, -34.20814479638009),
            new Position(0.0, -8.552036199095022), new Position(23.776223776223777, -6.889140271493213),
            new Position(-20.923076923076923, -2.3755656108597285), new Position(-10.6993006993007, 34.20814479638009),
            new Position(0.0, 15.203619909502263), new Position(9.510489510489512, 35.39592760180996) };

    Position alineacion5[] = new Position[] { new Position(0.2595419847328244, -50.41044776119403),
            new Position(-6.419580419580419, -32.54524886877828), new Position(9.272727272727272, -32.54524886877828),
            new Position(28.293706293706293, -33.49547511312217), new Position(-25.678321678321677, -34.20814479638009),
            new Position(0.7132867132867133, -16.628959276018097), new Position(24.251748251748253, 0.9502262443438915),
            new Position(-21.16083916083916, -0.23755656108597287), new Position(-12.125874125874127, 28.031674208144796),
            new Position(-0.4755244755244755, 12.828054298642533), new Position(13.79020979020979, 30.16968325791855) };

    Position alineacion6[] = new Position[] { new Position(0.2595419847328244, -50.41044776119403),
            new Position(-8.083916083916083, -27.08144796380091), new Position(13.076923076923078, -28.50678733031674),
            new Position(27.81818181818182, -12.352941176470589), new Position(-25.44055944055944, -12.115384615384617),
            new Position(1.4265734265734267, -7.364253393665159), new Position(14.503496503496503, 8.314479638009049),
            new Position(-19.97202797202797, 32.54524886877828), new Position(0.951048951048951, 32.30769230769231),
            new Position(-9.034965034965035, 11.165158371040723), new Position(24.251748251748253, 33.02036199095023) };
    
    public Position[] getInicioSacando() {
        return alineacion1;
    }
    
    public Position[] getInicioRecibiendo() {
        return alineacion2;
    }
    
    public Position[] getNormal() {
        return alineacion3;
    }

}