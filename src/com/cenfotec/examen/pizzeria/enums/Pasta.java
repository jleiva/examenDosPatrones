package com.cenfotec.examen.pizzeria.enums;

public enum Pasta {
	DELGADA {
        public float getCosto() {
            return 1000;
        }
    },
	NORMAL {
    		public float getCosto() {
            return 2000;
        }
    },
	GRUESA {
    		public float getCosto() {
            return 4000;
        }
    },
	GLUTEN_FREE {
    		public float getCosto() {
            return 4000;
        }
    };
    
    public abstract float getCosto();
}
