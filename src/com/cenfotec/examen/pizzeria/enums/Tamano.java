package com.cenfotec.examen.pizzeria.enums;

public enum Tamano {
	PEQUENA {
    		public float getCosto() {
            return 2000;
        }
    },
	MEDIANA {
    		public float getCosto() {
            return 5000;
        }
    },
	GRANDE {
    		public float getCosto() {
            return 8000;
        }
    };
    
    public abstract float getCosto();
}
