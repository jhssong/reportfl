{
  "filepath": "/tmp/Math-40b/src/main/java/org/apache/commons/math/ode/ExpandableStatefulODE.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "ExpandableStatefulODE",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 49,
      "end_line": 326,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "primary"
      ],
      "begin_line": 52,
      "end_line": 52,
      "comment": " Primary differential equation. "
    },
    {
      "type": "field",
      "varNames": [
        "primaryMapper"
      ],
      "begin_line": 55,
      "end_line": 55,
      "comment": " Mapper for primary equation. "
    },
    {
      "type": "field",
      "varNames": [
        "time"
      ],
      "begin_line": 58,
      "end_line": 58,
      "comment": " Time. "
    },
    {
      "type": "field",
      "varNames": [
        "primaryState"
      ],
      "begin_line": 61,
      "end_line": 61,
      "comment": " State. "
    },
    {
      "type": "field",
      "varNames": [
        "primaryStateDot"
      ],
      "begin_line": 64,
      "end_line": 64,
      "comment": " State derivative. "
    },
    {
      "type": "field",
      "varNames": [
        "components"
      ],
      "begin_line": 67,
      "end_line": 67,
      "comment": " Components of the expandable ODE. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.ode.ExpandableStatefulODE.ExpandableStatefulODE(org.apache.commons.math.ode.FirstOrderDifferentialEquations)",
      "begin_line": 72,
      "end_line": 80,
      "comment": " Build an expandable set from its primary ODE set.\n     * @param primary the primary set of differential equations to be integrated.\n     ",
      "child_ranges": [
        "(line 73,col 9)-(line 73,col 54)",
        "(line 74,col 9)-(line 74,col 39)",
        "(line 75,col 9)-(line 75,col 57)",
        "(line 76,col 9)-(line 76,col 42)",
        "(line 77,col 9)-(line 77,col 45)",
        "(line 78,col 9)-(line 78,col 45)",
        "(line 79,col 9)-(line 79,col 89)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.ExpandableStatefulODE.getPrimary()",
      "begin_line": 85,
      "end_line": 87,
      "comment": " Get the primary set of differential equations.\n     * @return primary set of differential equations\n     ",
      "child_ranges": [
        "(line 86,col 9)-(line 86,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.ExpandableStatefulODE.getTotalDimension()",
      "begin_line": 95,
      "end_line": 104,
      "comment": " Return the dimension of the complete set of equations.\n     * \u003cp\u003e\n     * The complete set of equations correspond to the primary set plus all secondary sets.\n     * \u003c/p\u003e\n     * @return dimension of the complete set of equations\n     ",
      "child_ranges": [
        "(line 96,col 9)-(line 103,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.ExpandableStatefulODE.computeDerivatives(double, double[], double[])",
      "begin_line": 111,
      "end_line": 126,
      "comment": " Get the current time derivative of the complete state vector.\n     * @param t current value of the independent \u003cI\u003etime\u003c/I\u003e variable\n     * @param y array containing the current value of the complete state vector\n     * @param yDot placeholder array where to put the time derivative of the complete state vector\n     ",
      "child_ranges": [
        "(line 114,col 9)-(line 114,col 59)",
        "(line 115,col 9)-(line 115,col 69)",
        "(line 116,col 9)-(line 116,col 64)",
        "(line 119,col 9)-(line 124,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.ExpandableStatefulODE.addSecondaryEquations(org.apache.commons.math.ode.SecondaryEquations)",
      "begin_line": 132,
      "end_line": 148,
      "comment": " Add a set of secondary equations to be integrated along with the primary set.\n     * @param secondary secondary equations set\n     * @return index of the secondary equation in the expanded state\n     ",
      "child_ranges": [
        "(line 134,col 9)-(line 134,col 29)",
        "(line 135,col 9)-(line 142,col 9)",
        "(line 144,col 9)-(line 144,col 70)",
        "(line 146,col 9)-(line 146,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.ExpandableStatefulODE.getPrimaryMapper()",
      "begin_line": 154,
      "end_line": 156,
      "comment": " Get an equations mapper for the primary equations set.\n     * @return mapper for the primary set\n     * @see #getSecondaryMappers()\n     ",
      "child_ranges": [
        "(line 155,col 9)-(line 155,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.ExpandableStatefulODE.getSecondaryMappers()",
      "begin_line": 162,
      "end_line": 168,
      "comment": " Get the equations mappers for the secondary equations sets.\n     * @return equations mappers for the secondary equations sets\n     * @see #getPrimaryMapper()\n     ",
      "child_ranges": [
        "(line 163,col 9)-(line 163,col 81)",
        "(line 164,col 9)-(line 166,col 9)",
        "(line 167,col 9)-(line 167,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.ExpandableStatefulODE.setTime(double)",
      "begin_line": 173,
      "end_line": 175,
      "comment": " Set current time.\n     * @param time current time\n     ",
      "child_ranges": [
        "(line 174,col 9)-(line 174,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.ExpandableStatefulODE.getTime()",
      "begin_line": 180,
      "end_line": 182,
      "comment": " Get current time.\n     * @return current time\n     ",
      "child_ranges": [
        "(line 181,col 9)-(line 181,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.ExpandableStatefulODE.setPrimaryState(double[])",
      "begin_line": 189,
      "end_line": 199,
      "comment": " Set primary part of the current state.\n     * @param primaryState primary part of the current state\n     * @throws DimensionMismatchException if the dimension of the array does not\n     * match the primary set\n     ",
      "child_ranges": [
        "(line 192,col 9)-(line 194,col 9)",
        "(line 197,col 9)-(line 197,col 85)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.ExpandableStatefulODE.getPrimaryState()",
      "begin_line": 204,
      "end_line": 206,
      "comment": " Get primary part of the current state.\n     * @return primary part of the current state\n     ",
      "child_ranges": [
        "(line 205,col 9)-(line 205,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.ExpandableStatefulODE.getPrimaryStateDot()",
      "begin_line": 211,
      "end_line": 213,
      "comment": " Get primary part of the current state derivative.\n     * @return primary part of the current state derivative\n     ",
      "child_ranges": [
        "(line 212,col 9)-(line 212,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.ExpandableStatefulODE.setSecondaryState(int, double[])",
      "begin_line": 222,
      "end_line": 236,
      "comment": " Set secondary part of the current state.\n     * @param index index of the part to set as returned by {@link\n     * #addSecondaryEquations(SecondaryEquations)}\n     * @param secondaryState secondary part of the current state\n     * @throws DimensionMismatchException if the dimension of the partial state does not\n     * match the selected equations set dimension\n     ",
      "child_ranges": [
        "(line 226,col 9)-(line 226,col 58)",
        "(line 229,col 9)-(line 231,col 9)",
        "(line 234,col 9)-(line 234,col 82)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.ExpandableStatefulODE.getSecondaryState(int)",
      "begin_line": 243,
      "end_line": 245,
      "comment": " Get secondary part of the current state.\n     * @param index index of the part to set as returned by {@link\n     * #addSecondaryEquations(SecondaryEquations)}\n     * @return secondary part of the current state\n     ",
      "child_ranges": [
        "(line 244,col 9)-(line 244,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.ExpandableStatefulODE.getSecondaryStateDot(int)",
      "begin_line": 252,
      "end_line": 254,
      "comment": " Get secondary part of the current state derivative.\n     * @param index index of the part to set as returned by {@link\n     * #addSecondaryEquations(SecondaryEquations)}\n     * @return secondary part of the current state derivative\n     ",
      "child_ranges": [
        "(line 253,col 9)-(line 253,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.ExpandableStatefulODE.setCompleteState(double[])",
      "begin_line": 261,
      "end_line": 275,
      "comment": " Set the complete current state.\n     * @param completeState complete current state to copy data from\n     * @throws DimensionMismatchException if the dimension of the complete state does not\n     * match the complete equations sets dimension\n     ",
      "child_ranges": [
        "(line 265,col 9)-(line 267,col 9)",
        "(line 270,col 9)-(line 270,col 71)",
        "(line 271,col 9)-(line 273,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.ExpandableStatefulODE.getCompleteState()",
      "begin_line": 282,
      "end_line": 295,
      "comment": " Get the complete current state.\n     * @return complete current state\n     * @throws DimensionMismatchException if the dimension of the complete state does not\n     * match the complete equations sets dimension\n     ",
      "child_ranges": [
        "(line 285,col 9)-(line 285,col 65)",
        "(line 288,col 9)-(line 288,col 70)",
        "(line 289,col 9)-(line 291,col 9)",
        "(line 293,col 9)-(line 293,col 29)"
      ]
    },
    {
      "type": "class_interface",
      "name": "SecondaryComponent",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 298,
      "end_line": 324,
      "comment": " Components of the compound stateful ODE. "
    },
    {
      "type": "field",
      "varNames": [
        "equation"
      ],
      "begin_line": 301,
      "end_line": 301,
      "comment": " Secondary differential equation. "
    },
    {
      "type": "field",
      "varNames": [
        "mapper"
      ],
      "begin_line": 304,
      "end_line": 304,
      "comment": " Mapper between local and complete arrays. "
    },
    {
      "type": "field",
      "varNames": [
        "state"
      ],
      "begin_line": 307,
      "end_line": 307,
      "comment": " State. "
    },
    {
      "type": "field",
      "varNames": [
        "stateDot"
      ],
      "begin_line": 310,
      "end_line": 310,
      "comment": " State derivative. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.ode.ExpandableStatefulODE.SecondaryComponent.SecondaryComponent(org.apache.commons.math.ode.SecondaryEquations, int)",
      "begin_line": 316,
      "end_line": 322,
      "comment": " Simple constructor.\n         * @param equation secondary differential equation\n         * @param firstIndex index to use for the first element in the complete arrays\n         ",
      "child_ranges": [
        "(line 317,col 13)-(line 317,col 52)",
        "(line 318,col 13)-(line 318,col 37)",
        "(line 319,col 13)-(line 319,col 63)",
        "(line 320,col 13)-(line 320,col 42)",
        "(line 321,col 13)-(line 321,col 42)"
      ]
    }
  ]
}