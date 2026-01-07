{
  "filepath": "/tmp/Math-4b/src/main/java/org/apache/commons/math3/ode/ExpandableStatefulODE.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "ExpandableStatefulODE",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 50,
      "end_line": 331,
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
      "end_line": 131,
      "comment": " Get the current time derivative of the complete state vector.\n     * @param t current value of the independent \u003cI\u003etime\u003c/I\u003e variable\n     * @param y array containing the current value of the complete state vector\n     * @param yDot placeholder array where to put the time derivative of the complete state vector\n     * @exception MaxCountExceededException if the number of functions evaluations is exceeded\n     * @exception DimensionMismatchException if arrays dimensions do not match equations settings\n     ",
      "child_ranges": [
        "(line 118,col 9)-(line 118,col 59)",
        "(line 119,col 9)-(line 119,col 69)",
        "(line 122,col 9)-(line 127,col 9)",
        "(line 129,col 9)-(line 129,col 64)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.ode.ExpandableStatefulODE.addSecondaryEquations(org.apache.commons.math3.ode.SecondaryEquations)",
      "begin_line": 137,
      "end_line": 153,
      "comment": " Add a set of secondary equations to be integrated along with the primary set.\n     * @param secondary secondary equations set\n     * @return index of the secondary equation in the expanded state\n     ",
      "child_ranges": [
        "(line 139,col 9)-(line 139,col 29)",
        "(line 140,col 9)-(line 147,col 9)",
        "(line 149,col 9)-(line 149,col 70)",
        "(line 151,col 9)-(line 151,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.ode.ExpandableStatefulODE.getPrimaryMapper()",
      "begin_line": 159,
      "end_line": 161,
      "comment": " Get an equations mapper for the primary equations set.\n     * @return mapper for the primary set\n     * @see #getSecondaryMappers()\n     ",
      "child_ranges": [
        "(line 160,col 9)-(line 160,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.ode.ExpandableStatefulODE.getSecondaryMappers()",
      "begin_line": 167,
      "end_line": 173,
      "comment": " Get the equations mappers for the secondary equations sets.\n     * @return equations mappers for the secondary equations sets\n     * @see #getPrimaryMapper()\n     ",
      "child_ranges": [
        "(line 168,col 9)-(line 168,col 81)",
        "(line 169,col 9)-(line 171,col 9)",
        "(line 172,col 9)-(line 172,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.ode.ExpandableStatefulODE.setTime(double)",
      "begin_line": 178,
      "end_line": 180,
      "comment": " Set current time.\n     * @param time current time\n     ",
      "child_ranges": [
        "(line 179,col 9)-(line 179,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.ode.ExpandableStatefulODE.getTime()",
      "begin_line": 185,
      "end_line": 187,
      "comment": " Get current time.\n     * @return current time\n     ",
      "child_ranges": [
        "(line 186,col 9)-(line 186,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.ode.ExpandableStatefulODE.setPrimaryState(double[])",
      "begin_line": 194,
      "end_line": 204,
      "comment": " Set primary part of the current state.\n     * @param primaryState primary part of the current state\n     * @throws DimensionMismatchException if the dimension of the array does not\n     * match the primary set\n     ",
      "child_ranges": [
        "(line 197,col 9)-(line 199,col 9)",
        "(line 202,col 9)-(line 202,col 85)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.ode.ExpandableStatefulODE.getPrimaryState()",
      "begin_line": 209,
      "end_line": 211,
      "comment": " Get primary part of the current state.\n     * @return primary part of the current state\n     ",
      "child_ranges": [
        "(line 210,col 9)-(line 210,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.ode.ExpandableStatefulODE.getPrimaryStateDot()",
      "begin_line": 216,
      "end_line": 218,
      "comment": " Get primary part of the current state derivative.\n     * @return primary part of the current state derivative\n     ",
      "child_ranges": [
        "(line 217,col 9)-(line 217,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.ode.ExpandableStatefulODE.setSecondaryState(int, double[])",
      "begin_line": 227,
      "end_line": 241,
      "comment": " Set secondary part of the current state.\n     * @param index index of the part to set as returned by {@link\n     * #addSecondaryEquations(SecondaryEquations)}\n     * @param secondaryState secondary part of the current state\n     * @throws DimensionMismatchException if the dimension of the partial state does not\n     * match the selected equations set dimension\n     ",
      "child_ranges": [
        "(line 231,col 9)-(line 231,col 58)",
        "(line 234,col 9)-(line 236,col 9)",
        "(line 239,col 9)-(line 239,col 82)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.ode.ExpandableStatefulODE.getSecondaryState(int)",
      "begin_line": 248,
      "end_line": 250,
      "comment": " Get secondary part of the current state.\n     * @param index index of the part to set as returned by {@link\n     * #addSecondaryEquations(SecondaryEquations)}\n     * @return secondary part of the current state\n     ",
      "child_ranges": [
        "(line 249,col 9)-(line 249,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.ode.ExpandableStatefulODE.getSecondaryStateDot(int)",
      "begin_line": 257,
      "end_line": 259,
      "comment": " Get secondary part of the current state derivative.\n     * @param index index of the part to set as returned by {@link\n     * #addSecondaryEquations(SecondaryEquations)}\n     * @return secondary part of the current state derivative\n     ",
      "child_ranges": [
        "(line 258,col 9)-(line 258,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.ode.ExpandableStatefulODE.setCompleteState(double[])",
      "begin_line": 266,
      "end_line": 280,
      "comment": " Set the complete current state.\n     * @param completeState complete current state to copy data from\n     * @throws DimensionMismatchException if the dimension of the complete state does not\n     * match the complete equations sets dimension\n     ",
      "child_ranges": [
        "(line 270,col 9)-(line 272,col 9)",
        "(line 275,col 9)-(line 275,col 71)",
        "(line 276,col 9)-(line 278,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.ode.ExpandableStatefulODE.getCompleteState()",
      "begin_line": 287,
      "end_line": 300,
      "comment": " Get the complete current state.\n     * @return complete current state\n     * @throws DimensionMismatchException if the dimension of the complete state does not\n     * match the complete equations sets dimension\n     ",
      "child_ranges": [
        "(line 290,col 9)-(line 290,col 65)",
        "(line 293,col 9)-(line 293,col 70)",
        "(line 294,col 9)-(line 296,col 9)",
        "(line 298,col 9)-(line 298,col 29)"
      ]
    },
    {
      "type": "class_interface",
      "name": "SecondaryComponent",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 303,
      "end_line": 329,
      "comment": " Components of the compound stateful ODE. "
    },
    {
      "type": "field",
      "varNames": [
        "equation"
      ],
      "begin_line": 306,
      "end_line": 306,
      "comment": " Secondary differential equation. "
    },
    {
      "type": "field",
      "varNames": [
        "mapper"
      ],
      "begin_line": 309,
      "end_line": 309,
      "comment": " Mapper between local and complete arrays. "
    },
    {
      "type": "field",
      "varNames": [
        "state"
      ],
      "begin_line": 312,
      "end_line": 312,
      "comment": " State. "
    },
    {
      "type": "field",
      "varNames": [
        "stateDot"
      ],
      "begin_line": 315,
      "end_line": 315,
      "comment": " State derivative. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.ode.ExpandableStatefulODE.SecondaryComponent.SecondaryComponent(org.apache.commons.math3.ode.SecondaryEquations, int)",
      "begin_line": 321,
      "end_line": 327,
      "comment": " Simple constructor.\n         * @param equation secondary differential equation\n         * @param firstIndex index to use for the first element in the complete arrays\n         ",
      "child_ranges": [
        "(line 322,col 13)-(line 322,col 52)",
        "(line 323,col 13)-(line 323,col 37)",
        "(line 324,col 13)-(line 324,col 63)",
        "(line 325,col 13)-(line 325,col 42)",
        "(line 326,col 13)-(line 326,col 42)"
      ]
    }
  ]
}