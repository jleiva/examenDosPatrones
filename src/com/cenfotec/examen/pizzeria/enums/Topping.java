package com.cenfotec.examen.pizzeria.enums;

public enum Topping {
	TOCINETA {
        public float getCosto() {
            return 500;
        }
    },
	PINA {
    		public float getCosto() {
            return 500;
        }
    },
	JAMON {
		public float getCosto() {
			return 1000;
		}
    },
	CARNE_ASADA {
    		public float getCosto() {
            return 1000;
        }
    },
	CARNE_MOLIDA {
    		public float getCosto() {
            return 1000;
        }
    };
    
    public abstract float getCosto();
}
