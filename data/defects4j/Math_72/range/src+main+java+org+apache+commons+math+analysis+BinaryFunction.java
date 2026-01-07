{
  "filepath": "/tmp/Math-72b/src/main/java/org/apache/commons/math/analysis/BinaryFunction.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "BinaryFunction",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.analysis.BivariateRealFunction"
      ],
      "begin_line": 29,
      "end_line": 116,
      "comment": "\n * Base class for {@link BivariateRealFunction} that can be composed with other functions.\n *\n * @version $Revision$ $Date$\n "
    },
    {
      "type": "field",
      "varNames": [
        "ADD"
      ],
      "begin_line": 32,
      "end_line": 38,
      "comment": " The + operator method wrapped as a {@link BinaryFunction}. "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.BinaryFunction.Anonymous-06a616c5-f73d-46b7-9be9-001e9fe79123.value(double, double)",
      "begin_line": 34,
      "end_line": 37,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 36,col 13)-(line 36,col 25)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "SUBTRACT"
      ],
      "begin_line": 41,
      "end_line": 47,
      "comment": " The - operator method wrapped as a {@link BinaryFunction}. "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.BinaryFunction.Anonymous-93dbc6a4-5041-4b8b-a9b8-f379bc49960c.value(double, double)",
      "begin_line": 43,
      "end_line": 46,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 45,col 13)-(line 45,col 25)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "MULTIPLY"
      ],
      "begin_line": 50,
      "end_line": 56,
      "comment": " The * operator method wrapped as a {@link BinaryFunction}. "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.BinaryFunction.Anonymous-0fafb281-88ab-4a62-8e66-99913433693f.value(double, double)",
      "begin_line": 52,
      "end_line": 55,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 54,col 13)-(line 54,col 25)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "DIVIDE"
      ],
      "begin_line": 59,
      "end_line": 65,
      "comment": " The / operator method wrapped as a {@link BinaryFunction}. "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.BinaryFunction.Anonymous-b7207926-2805-479f-9800-4f9ca7279c33.value(double, double)",
      "begin_line": 61,
      "end_line": 64,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 63,col 13)-(line 63,col 25)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "POW"
      ],
      "begin_line": 68,
      "end_line": 74,
      "comment": " The {@code Math.pow} method wrapped as a {@link BinaryFunction}. "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.BinaryFunction.Anonymous-60e0cc90-85c4-4162-a33e-2238fb29b359.value(double, double)",
      "begin_line": 70,
      "end_line": 73,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 72,col 13)-(line 72,col 34)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "ATAN2"
      ],
      "begin_line": 77,
      "end_line": 83,
      "comment": " The {@code Math.atan2} method wrapped as a {@link BinaryFunction}. "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.BinaryFunction.Anonymous-0807655a-1b84-46c0-b764-d48b74b27631.value(double, double)",
      "begin_line": 79,
      "end_line": 82,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 81,col 13)-(line 81,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.BinaryFunction.value(double, double)",
      "begin_line": 86,
      "end_line": 86,
      "comment": " {@inheritDoc} ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.BinaryFunction.fix1stArgument(double)",
      "begin_line": 92,
      "end_line": 100,
      "comment": " Get a composable function by fixing the first argument of the instance.\n     * @param fixedX fixed value of the first argument\n     * @return a function such that {@code f.value(y) \u003d\u003d value(fixedX, y)}\n     ",
      "child_ranges": [
        "(line 93,col 9)-(line 99,col 10)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.BinaryFunction.Anonymous-fb986d61-44ff-4db3-8c36-76ef6cf6f022.value(double)",
      "begin_line": 94,
      "end_line": 98,
      "comment": "",
      "child_ranges": [
        "(line 97,col 17)-(line 97,col 60)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.BinaryFunction.fix2ndArgument(double)",
      "begin_line": 106,
      "end_line": 114,
      "comment": " Get a composable function by fixing the second argument of the instance.\n     * @param fixedY fixed value of the second argument\n     * @return a function such that {@code f.value(x) \u003d\u003d value(x, fixedY)}\n     ",
      "child_ranges": [
        "(line 107,col 9)-(line 113,col 10)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.BinaryFunction.Anonymous-2645116b-d9a5-4ac0-9f2e-a0ed9aaca2c8.value(double)",
      "begin_line": 108,
      "end_line": 112,
      "comment": "",
      "child_ranges": [
        "(line 111,col 17)-(line 111,col 60)"
      ]
    }
  ]
}