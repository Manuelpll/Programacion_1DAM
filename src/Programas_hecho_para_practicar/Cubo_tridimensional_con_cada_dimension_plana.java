package Programas_hecho_para_practicar;

public class Cubo_tridimensional_con_cada_dimension_plana {
        private int[][][] cube;

        public Cubo_tridimensional_con_cada_dimension_plana(int size) {
            this.cube = new int[size][size][size];
        }

        public void fillCube() {
            for (int x = 0; x < cube.length; x++) {
                for (int y = 0; y < cube[0].length; y++) {
                    for (int z = 0; z < cube[0][0].length; z++) {
                        cube[x][y][z] = 1;
                    }
                }
            }
        }

        public void displayCube() {
            for (int x = 0; x < cube.length; x++) {
                for (int y = 0; y < cube[0].length; y++) {
                    for (int z = 0; z < cube[0][0].length; z++) {
                        System.out.print(cube[x][y][z] + " ");
                    }
                    System.out.println();
                }
                System.out.println();
            }
        }

        public static void main(String[] args) {
            Cubo_tridimensional_con_cada_dimension_plana cube = new Cubo_tridimensional_con_cada_dimension_plana(3);
            cube.fillCube();
            cube.displayCube();
        }
    }

