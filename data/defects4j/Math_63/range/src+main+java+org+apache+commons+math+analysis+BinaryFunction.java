{
  "filepath": "/tmp/Math-63b/src/main/java/org/apache/commons/math/analysis/BinaryFunction.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "BinaryFunction",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.analysis.BivariateRealFunction"
      ],
      "begin_line": 31,
      "end_line": 118,
      "comment": "\n * Base class for {@link BivariateRealFunction} that can be composed with other functions.\n *\n * @since 2.1\n * @version $Revision$ $Date$\n "
    },
    {
      "type": "field",
      "varNames": [
        "ADD"
      ],
      "begin_line": 34,
      "end_line": 40,
      "comment": " The + operator method wrapped as a {@link BinaryFunction}. "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.BinaryFunction.Anonymous-c8c16a8c-059d-4497-8de9-da23267d16e1.value(double, double)",
      "begin_line": 36,
      "end_line": 39,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 38,col 13)-(line 38,col 25)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "SUBTRACT"
      ],
      "begin_line": 43,
      "end_line": 49,
      "comment": " The - operator method wrapped as a {@link BinaryFunction}. "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.BinaryFunction.Anonymous-b2b926fc-65e1-4086-8971-9f2d470ccc54.value(double, double)",
      "begin_line": 45,
      "end_line": 48,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 47,col 13)-(line 47,col 25)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "MULTIPLY"
      ],
      "begin_line": 52,
      "end_line": 58,
      "comment": " The * operator method wrapped as a {@link BinaryFunction}. "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.BinaryFunction.Anonymous-f3f9c44e-d4cc-4c92-b37b-95cf06823b50.value(double, double)",
      "begin_line": 54,
      "end_line": 57,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 56,col 13)-(line 56,col 25)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "DIVIDE"
      ],
      "begin_line": 61,
      "end_line": 67,
      "comment": " The / operator method wrapped as a {@link BinaryFunction}. "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.BinaryFunction.Anonymous-7ad65ddc-642a-421b-a827-58eac2532e25.value(double, double)",
      "begin_line": 63,
      "end_line": 66,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 65,col 13)-(line 65,col 25)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "POW"
      ],
      "begin_line": 70,
      "end_line": 76,
      "comment": " The {@code FastMath.pow} method wrapped as a {@link BinaryFunction}. "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.BinaryFunction.Anonymous-0f7f35da-11c8-4ff6-9b12-4f26a9e5b5a5.value(double, double)",
      "begin_line": 72,
      "end_line": 75,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 74,col 13)-(line 74,col 38)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "ATAN2"
      ],
      "begin_line": 79,
      "end_line": 85,
      "comment": " The {@code FastMath.atan2} method wrapped as a {@link BinaryFunction}. "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.BinaryFunction.Anonymous-481dbc67-df38-4a5f-95e2-bf35bd8b3a86.value(double, double)",
      "begin_line": 81,
      "end_line": 84,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 83,col 13)-(line 83,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.BinaryFunction.value(double, double)",
      "begin_line": 88,
      "end_line": 88,
      "comment": " {@inheritDoc} ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.BinaryFunction.fix1stArgument(double)",
      "begin_line": 94,
      "end_line": 102,
      "comment": " Get a composable function by fixing the first argument of the instance.\n     * @param fixedX fixed value of the first argument\n     * @return a function such that {@code f.value(y) \u003d\u003d value(fixedX, y)}\n     ",
      "child_ranges": [
        "(line 95,col 9)-(line 101,col 10)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.BinaryFunction.Anonymous-3d6554dc-2067-4b3c-93dd-2efc3f7dc9ba.value(double)",
      "begin_line": 96,
      "end_line": 100,
      "comment": "",
      "child_ranges": [
        "(line 99,col 17)-(line 99,col 60)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.BinaryFunction.fix2ndArgument(double)",
      "begin_line": 108,
      "end_line": 116,
      "comment": " Get a composable function by fixing the second argument of the instance.\n     * @param fixedY fixed value of the second argument\n     * @return a function such that {@code f.value(x) \u003d\u003d value(x, fixedY)}\n     ",
      "child_ranges": [
        "(line 109,col 9)-(line 115,col 10)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.BinaryFunction.Anonymous-3d8607d6-96a6-49ff-b19b-63eb1c6a849a.value(double)",
      "begin_line": 110,
      "end_line": 114,
      "comment": "",
      "child_ranges": [
        "(line 113,col 17)-(line 113,col 60)"
      ]
    }
  ]
}