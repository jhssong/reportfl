{
  "filepath": "/tmp/Math-62b/src/main/java/org/apache/commons/math/analysis/BinaryFunction.java",
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
      "signature": "org.apache.commons.math.analysis.BinaryFunction.Anonymous-2b6628ae-3155-47ac-b50e-1c5a4d9f0398.value(double, double)",
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
      "signature": "org.apache.commons.math.analysis.BinaryFunction.Anonymous-ddf287a0-b289-44b6-ab7f-a4adcbabe578.value(double, double)",
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
      "signature": "org.apache.commons.math.analysis.BinaryFunction.Anonymous-4f7b28a0-8cd3-4c62-a778-97dac54826d1.value(double, double)",
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
      "signature": "org.apache.commons.math.analysis.BinaryFunction.Anonymous-753ffa03-2e2d-45eb-85c5-30d5f9c3d97c.value(double, double)",
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
      "signature": "org.apache.commons.math.analysis.BinaryFunction.Anonymous-9a1460e1-8572-4464-b282-d50c2b978cee.value(double, double)",
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
      "signature": "org.apache.commons.math.analysis.BinaryFunction.Anonymous-b636f823-559a-4e4f-a20a-a68e83dde6f7.value(double, double)",
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
      "signature": "org.apache.commons.math.analysis.BinaryFunction.Anonymous-ff38ad20-f029-4534-9aae-5b77ac2dfa98.value(double)",
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
      "signature": "org.apache.commons.math.analysis.BinaryFunction.Anonymous-3f09396c-9628-4f46-b369-427477bcf83d.value(double)",
      "begin_line": 110,
      "end_line": 114,
      "comment": "",
      "child_ranges": [
        "(line 113,col 17)-(line 113,col 60)"
      ]
    }
  ]
}