{
  "filepath": "/tmp/Math-5b/src/main/java/org/apache/commons/math3/ode/ExpandableStatefulODE.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "ExpandableStatefulODE",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 50,
      "end_line": 330,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "primary"
      ],
      "begin_line": 53,
      "end_line": 53,
      "comment": " Primary differential equation. "
    },
    {
      "type": "field",
      "varNames": [
        "primaryMapper"
      ],
      "begin_line": 56,
      "end_line": 56,
      "comment": " Mapper for primary equation. "
    },
    {
      "type": "field",
      "varNames": [
        "time"
      ],
      "begin_line": 59,
      "end_line": 59,
      "comment": " Time. "
    },
    {
      "type": "field",
      "varNames": [
        "primaryState"
      ],
      "begin_line": 62,
      "end_line": 62,
      "comment": " State. "
    },
    {
      "type": "field",
      "varNames": [
        "primaryStateDot"
      ],
      "begin_line": 65,
      "end_line": 65,
      "comment": " State derivative. "
    },
    {
      "type": "field",
      "varNames": [
        "components"
      ],
      "begin_line": 68,
      "end_line": 68,
      "comment": " Components of the expandable ODE. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.ode.ExpandableStatefulODE.ExpandableStatefulODE(org.apache.commons.math3.ode.FirstOrderDifferentialEquations)",
      "begin_line": 73,
      "end_line": 81,
      "comment": " Build an expandable set from its primary ODE set.\n     * @param primary the primary set of differential equations to be integrated.\n     ",
      "child_ranges": [
        "(line 74,col 9)-(line 74,col 54)",
        "(line 75,col 9)-(line 75,col 39)",
        "(line 76,col 9)-(line 76,col 57)",
        "(line 77,col 9)-(line 77,col 42)",
        "(line 78,col 9)-(line 78,col 45)",
        "(line 79,col 9)-(line 79,col 45)",
        "(line 80,col 9)-(line 80,col 89)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.ode.ExpandableStatefulODE.getPrimary()",
      "begin_line": 86,
      "end_line": 88,
      "comment": " Get the primary set of differential equations.\n     * @return primary set of differential equations\n     ",
      "child_ranges": [
        "(line 87,col 9)-(line 87,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.ode.ExpandableStatefulODE.getTotalDimension()",
      "begin_line": 96,
      "end_line": 105,
      "comment": " Return the dimension of the complete set of equations.\n     * \u003cp\u003e\n     * The complete set of equations correspond to the primary set plus all secondary sets.\n     * \u003c/p\u003e\n     * @return dimension of the complete set of equations\n     ",
      "child_ranges": [
        "(line 97,col 9)-(line 104,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.ode.ExpandableStatefulODE.computeDerivatives(double, double[], double[])",
      "begin_line": 114,
      "end_line": 130,
      "comment": " Get the current time derivative of the complete state vector.\n     * @param t current value of the independent \u003cI\u003etime\u003c/I\u003e variable\n     * @param y array containing the current value of the complete state vector\n     * @param yDot placeholder array where to put the time derivative of the complete state vector\n     * @exception MaxCountExceededException if the number of functions evaluations is exceeded\n     * @exception DimensionMismatchException if arrays dimensions do not match equations settings\n     ",
      "child_ranges": [
        "(line 118,col 9)-(line 118,col 59)",
        "(line 119,col 9)-(line 119,col 69)",
        "(line 120,col 9)-(line 120,col 64)",
        "(line 123,col 9)-(line 128,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.ode.ExpandableStatefulODE.addSecondaryEquations(org.apache.commons.math3.ode.SecondaryEquations)",
      "begin_line": 136,
      "end_line": 152,
      "comment": " Add a set of secondary equations to be integrated along with the primary set.\n     * @param secondary secondary equations set\n     * @return index of the secondary equation in the expanded state\n     ",
      "child_ranges": [
        "(line 138,col 9)-(line 138,col 29)",
        "(line 139,col 9)-(line 146,col 9)",
        "(line 148,col 9)-(line 148,col 70)",
        "(line 150,col 9)-(line 150,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.ode.ExpandableStatefulODE.getPrimaryMapper()",
      "begin_line": 158,
      "end_line": 160,
      "comment": " Get an equations mapper for the primary equations set.\n     * @return mapper for the primary set\n     * @see #getSecondaryMappers()\n     ",
      "child_ranges": [
        "(line 159,col 9)-(line 159,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.ode.ExpandableStatefulODE.getSecondaryMappers()",
      "begin_line": 166,
      "end_line": 172,
      "comment": " Get the equations mappers for the secondary equations sets.\n     * @return equations mappers for the secondary equations sets\n     * @see #getPrimaryMapper()\n     ",
      "child_ranges": [
        "(line 167,col 9)-(line 167,col 81)",
        "(line 168,col 9)-(line 170,col 9)",
        "(line 171,col 9)-(line 171,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.ode.ExpandableStatefulODE.setTime(double)",
      "begin_line": 177,
      "end_line": 179,
      "comment": " Set current time.\n     * @param time current time\n     ",
      "child_ranges": [
        "(line 178,col 9)-(line 178,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.ode.ExpandableStatefulODE.getTime()",
      "begin_line": 184,
      "end_line": 186,
      "comment": " Get current time.\n     * @return current time\n     ",
      "child_ranges": [
        "(line 185,col 9)-(line 185,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.ode.ExpandableStatefulODE.setPrimaryState(double[])",
      "begin_line": 193,
      "end_line": 203,
      "comment": " Set primary part of the current state.\n     * @param primaryState primary part of the current state\n     * @throws DimensionMismatchException if the dimension of the array does not\n     * match the primary set\n     ",
      "child_ranges": [
        "(line 196,col 9)-(line 198,col 9)",
        "(line 201,col 9)-(line 201,col 85)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.ode.ExpandableStatefulODE.getPrimaryState()",
      "begin_line": 208,
      "end_line": 210,
      "comment": " Get primary part of the current state.\n     * @return primary part of the current state\n     ",
      "child_ranges": [
        "(line 209,col 9)-(line 209,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.ode.ExpandableStatefulODE.getPrimaryStateDot()",
      "begin_line": 215,
      "end_line": 217,
      "comment": " Get primary part of the current state derivative.\n     * @return primary part of the current state derivative\n     ",
      "child_ranges": [
        "(line 216,col 9)-(line 216,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.ode.ExpandableStatefulODE.setSecondaryState(int, double[])",
      "begin_line": 226,
      "end_line": 240,
      "comment": " Set secondary part of the current state.\n     * @param index index of the part to set as returned by {@link\n     * #addSecondaryEquations(SecondaryEquations)}\n     * @param secondaryState secondary part of the current state\n     * @throws DimensionMismatchException if the dimension of the partial state does not\n     * match the selected equations set dimension\n     ",
      "child_ranges": [
        "(line 230,col 9)-(line 230,col 58)",
        "(line 233,col 9)-(line 235,col 9)",
        "(line 238,col 9)-(line 238,col 82)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.ode.ExpandableStatefulODE.getSecondaryState(int)",
      "begin_line": 247,
      "end_line": 249,
      "comment": " Get secondary part of the current state.\n     * @param index index of the part to set as returned by {@link\n     * #addSecondaryEquations(SecondaryEquations)}\n     * @return secondary part of the current state\n     ",
      "child_ranges": [
        "(line 248,col 9)-(line 248,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.ode.ExpandableStatefulODE.getSecondaryStateDot(int)",
      "begin_line": 256,
      "end_line": 258,
      "comment": " Get secondary part of the current state derivative.\n     * @param index index of the part to set as returned by {@link\n     * #addSecondaryEquations(SecondaryEquations)}\n     * @return secondary part of the current state derivative\n     ",
      "child_ranges": [
        "(line 257,col 9)-(line 257,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.ode.ExpandableStatefulODE.setCompleteState(double[])",
      "begin_line": 265,
      "end_line": 279,
      "comment": " Set the complete current state.\n     * @param completeState complete current state to copy data from\n     * @throws DimensionMismatchException if the dimension of the complete state does not\n     * match the complete equations sets dimension\n     ",
      "child_ranges": [
        "(line 269,col 9)-(line 271,col 9)",
        "(line 274,col 9)-(line 274,col 71)",
        "(line 275,col 9)-(line 277,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.ode.ExpandableStatefulODE.getCompleteState()",
      "begin_line": 286,
      "end_line": 299,
      "comment": " Get the complete current state.\n     * @return complete current state\n     * @throws DimensionMismatchException if the dimension of the complete state does not\n     * match the complete equations sets dimension\n     ",
      "child_ranges": [
        "(line 289,col 9)-(line 289,col 65)",
        "(line 292,col 9)-(line 292,col 70)",
        "(line 293,col 9)-(line 295,col 9)",
        "(line 297,col 9)-(line 297,col 29)"
      ]
    },
    {
      "type": "class_interface",
      "name": "SecondaryComponent",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 302,
      "end_line": 328,
      "comment": " Components of the compound stateful ODE. "
    },
    {
      "type": "field",
      "varNames": [
        "equation"
      ],
      "begin_line": 305,
      "end_line": 305,
      "comment": " Secondary differential equation. "
    },
    {
      "type": "field",
      "varNames": [
        "mapper"
      ],
      "begin_line": 308,
      "end_line": 308,
      "comment": " Mapper between local and complete arrays. "
    },
    {
      "type": "field",
      "varNames": [
        "state"
      ],
      "begin_line": 311,
      "end_line": 311,
      "comment": " State. "
    },
    {
      "type": "field",
      "varNames": [
        "stateDot"
      ],
      "begin_line": 314,
      "end_line": 314,
      "comment": " State derivative. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.ode.ExpandableStatefulODE.SecondaryComponent.SecondaryComponent(org.apache.commons.math3.ode.SecondaryEquations, int)",
      "begin_line": 320,
      "end_line": 326,
      "comment": " Simple constructor.\n         * @param equation secondary differential equation\n         * @param firstIndex index to use for the first element in the complete arrays\n         ",
      "child_ranges": [
        "(line 321,col 13)-(line 321,col 52)",
        "(line 322,col 13)-(line 322,col 37)",
        "(line 323,col 13)-(line 323,col 63)",
        "(line 324,col 13)-(line 324,col 42)",
        "(line 325,col 13)-(line 325,col 42)"
      ]
    }
  ]
}