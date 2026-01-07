{
  "filepath": "/tmp/Math-76b/src/main/java/org/apache/commons/math/analysis/BinaryFunction.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "BinaryFunction",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.analysis.BivariateRealFunction"
      ],
      "begin_line": 29,
      "end_line": 110,
      "comment": "\n * Base class for {@link BivariateRealFunction} that can be composed with other functions.\n *\n * @version $Revision$ $Date$\n "
    },
    {
      "type": "field",
      "varNames": [
        "ADD"
      ],
      "begin_line": 32,
      "end_line": 37,
      "comment": " The + operator method wrapped as a {@link BinaryFunction}. "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.BinaryFunction.Anonymous-c56cd8ff-483b-497c-b84e-dd984d15d60f.value(double, double)",
      "begin_line": 34,
      "end_line": 36,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 35,col 13)-(line 35,col 25)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "SUBTRACT"
      ],
      "begin_line": 40,
      "end_line": 45,
      "comment": " The - operator method wrapped as a {@link BinaryFunction}. "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.BinaryFunction.Anonymous-44d9b542-51ec-403b-a531-0cf4b1f0e5bc.value(double, double)",
      "begin_line": 42,
      "end_line": 44,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 43,col 13)-(line 43,col 25)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "MULTIPLY"
      ],
      "begin_line": 48,
      "end_line": 53,
      "comment": " The * operator method wrapped as a {@link BinaryFunction}. "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.BinaryFunction.Anonymous-6e44dd45-be38-4172-b77c-e81cae61fb78.value(double, double)",
      "begin_line": 50,
      "end_line": 52,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 51,col 13)-(line 51,col 25)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "DIVIDE"
      ],
      "begin_line": 56,
      "end_line": 61,
      "comment": " The / operator method wrapped as a {@link BinaryFunction}. "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.BinaryFunction.Anonymous-3bedeff3-8e68-45ae-a098-5fbef939b964.value(double, double)",
      "begin_line": 58,
      "end_line": 60,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 59,col 13)-(line 59,col 25)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "POW"
      ],
      "begin_line": 64,
      "end_line": 69,
      "comment": " The {@code Math.pow} method wrapped as a {@link BinaryFunction}. "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.BinaryFunction.Anonymous-79520845-48d1-4cc7-9e62-875bd6ee6b0b.value(double, double)",
      "begin_line": 66,
      "end_line": 68,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 67,col 13)-(line 67,col 34)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "ATAN2"
      ],
      "begin_line": 72,
      "end_line": 77,
      "comment": " The {@code Math.atan2} method wrapped as a {@link BinaryFunction}. "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.BinaryFunction.Anonymous-f8958757-42a1-4787-a4f7-853a6026b648.value(double, double)",
      "begin_line": 74,
      "end_line": 76,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 75,col 13)-(line 75,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.BinaryFunction.value(double, double)",
      "begin_line": 80,
      "end_line": 80,
      "comment": " {@inheritDoc} ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.BinaryFunction.fix1stArgument(double)",
      "begin_line": 86,
      "end_line": 94,
      "comment": " Get a composable function by fixing the first argument of the instance.\n     * @param fixedX fixed value of the first argument\n     * @return a function such that {@code f.value(y) \u003d\u003d value(fixedX, y)}\n     ",
      "child_ranges": [
        "(line 87,col 9)-(line 93,col 10)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.BinaryFunction.Anonymous-3647be16-22eb-44a2-bc5d-6ad7221e683c.value(double)",
      "begin_line": 88,
      "end_line": 92,
      "comment": "",
      "child_ranges": [
        "(line 91,col 17)-(line 91,col 60)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.BinaryFunction.fix2ndArgument(double)",
      "begin_line": 100,
      "end_line": 108,
      "comment": " Get a composable function by fixing the second argument of the instance.\n     * @param fixedY fixed value of the second argument\n     * @return a function such that {@code f.value(x) \u003d\u003d value(x, fixedY)}\n     ",
      "child_ranges": [
        "(line 101,col 9)-(line 107,col 10)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.BinaryFunction.Anonymous-806dd0c2-fb42-4016-9913-51d1120ba473.value(double)",
      "begin_line": 102,
      "end_line": 106,
      "comment": "",
      "child_ranges": [
        "(line 105,col 17)-(line 105,col 60)"
      ]
    }
  ]
}