package com.cenfotec.examen.pizzeria.enums;

public enum Queso {
	NORMAL {
        public float getCosto() {
            return 500;
        }
    },
	MIXTO {
    		public float getCosto() {
            return 1500;
        }
    },
	MOZZARELLA {
		public float getCosto() {
			return 2000;
		}
    };
    
    public abstract float getCosto();
}
