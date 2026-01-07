{
  "filepath": "/tmp/Math-64b/src/main/java/org/apache/commons/math/analysis/BinaryFunction.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "BinaryFunction",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.analysis.BivariateRealFunction"
      ],
      "begin_line": 30,
      "end_line": 117,
      "comment": "\n * Base class for {@link BivariateRealFunction} that can be composed with other functions.\n *\n * @since 2.1\n * @version $Revision$ $Date$\n "
    },
    {
      "type": "field",
      "varNames": [
        "ADD"
      ],
      "begin_line": 33,
      "end_line": 39,
      "comment": " The + operator method wrapped as a {@link BinaryFunction}. "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.BinaryFunction.Anonymous-b1495131-a2e0-4620-b401-1fe1167201b0.value(double, double)",
      "begin_line": 35,
      "end_line": 38,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 37,col 13)-(line 37,col 25)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "SUBTRACT"
      ],
      "begin_line": 42,
      "end_line": 48,
      "comment": " The - operator method wrapped as a {@link BinaryFunction}. "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.BinaryFunction.Anonymous-1cbe0c15-1223-4769-bae5-54daff4b46d3.value(double, double)",
      "begin_line": 44,
      "end_line": 47,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 46,col 13)-(line 46,col 25)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "MULTIPLY"
      ],
      "begin_line": 51,
      "end_line": 57,
      "comment": " The * operator method wrapped as a {@link BinaryFunction}. "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.BinaryFunction.Anonymous-f7d37e14-9e81-4caa-90b1-454fe20149fb.value(double, double)",
      "begin_line": 53,
      "end_line": 56,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 55,col 13)-(line 55,col 25)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "DIVIDE"
      ],
      "begin_line": 60,
      "end_line": 66,
      "comment": " The / operator method wrapped as a {@link BinaryFunction}. "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.BinaryFunction.Anonymous-3af73f1e-be46-4da8-9c90-23e9c1d8953d.value(double, double)",
      "begin_line": 62,
      "end_line": 65,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 64,col 13)-(line 64,col 25)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "POW"
      ],
      "begin_line": 69,
      "end_line": 75,
      "comment": " The {@code Math.pow} method wrapped as a {@link BinaryFunction}. "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.BinaryFunction.Anonymous-f4649eb4-5c6d-49cc-b850-d7e849ac8d33.value(double, double)",
      "begin_line": 71,
      "end_line": 74,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 73,col 13)-(line 73,col 34)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "ATAN2"
      ],
      "begin_line": 78,
      "end_line": 84,
      "comment": " The {@code Math.atan2} method wrapped as a {@link BinaryFunction}. "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.BinaryFunction.Anonymous-a9304aa5-d69d-404c-8fb1-9c7c38becc1d.value(double, double)",
      "begin_line": 80,
      "end_line": 83,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 82,col 13)-(line 82,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.BinaryFunction.value(double, double)",
      "begin_line": 87,
      "end_line": 87,
      "comment": " {@inheritDoc} ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.BinaryFunction.fix1stArgument(double)",
      "begin_line": 93,
      "end_line": 101,
      "comment": " Get a composable function by fixing the first argument of the instance.\n     * @param fixedX fixed value of the first argument\n     * @return a function such that {@code f.value(y) \u003d\u003d value(fixedX, y)}\n     ",
      "child_ranges": [
        "(line 94,col 9)-(line 100,col 10)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.BinaryFunction.Anonymous-f4f1370a-7894-409e-aa8b-651105f5ecfa.value(double)",
      "begin_line": 95,
      "end_line": 99,
      "comment": "",
      "child_ranges": [
        "(line 98,col 17)-(line 98,col 60)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.BinaryFunction.fix2ndArgument(double)",
      "begin_line": 107,
      "end_line": 115,
      "comment": " Get a composable function by fixing the second argument of the instance.\n     * @param fixedY fixed value of the second argument\n     * @return a function such that {@code f.value(x) \u003d\u003d value(x, fixedY)}\n     ",
      "child_ranges": [
        "(line 108,col 9)-(line 114,col 10)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.BinaryFunction.Anonymous-05ac83c2-9e67-4bde-ad99-44b8940d8be8.value(double)",
      "begin_line": 109,
      "end_line": 113,
      "comment": "",
      "child_ranges": [
        "(line 112,col 17)-(line 112,col 60)"
      ]
    }
  ]
}