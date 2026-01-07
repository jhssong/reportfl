{
  "filepath": "/tmp/Math-67b/src/main/java/org/apache/commons/math/analysis/BinaryFunction.java",
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
      "signature": "org.apache.commons.math.analysis.BinaryFunction.Anonymous-995fbae9-fe1e-4d3e-8df0-32827ad351d9.value(double, double)",
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
      "signature": "org.apache.commons.math.analysis.BinaryFunction.Anonymous-73577be2-6673-4e70-b693-64971aae966e.value(double, double)",
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
      "signature": "org.apache.commons.math.analysis.BinaryFunction.Anonymous-4cb1cf6f-ee16-4469-ad99-20be249ea7c7.value(double, double)",
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
      "signature": "org.apache.commons.math.analysis.BinaryFunction.Anonymous-be9a2251-454f-453d-be63-f66ab1ee63e3.value(double, double)",
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
      "signature": "org.apache.commons.math.analysis.BinaryFunction.Anonymous-d628c044-9a37-4d92-ac19-20f557d473a5.value(double, double)",
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
      "signature": "org.apache.commons.math.analysis.BinaryFunction.Anonymous-fd468254-47cd-4712-968e-0e710274a648.value(double, double)",
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
      "signature": "org.apache.commons.math.analysis.BinaryFunction.Anonymous-016b339f-58a1-4a8e-b01e-ad7ec4282ea3.value(double)",
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
      "signature": "org.apache.commons.math.analysis.BinaryFunction.Anonymous-aa15009e-93cc-4da9-8a8a-ac02acb0d865.value(double)",
      "begin_line": 109,
      "end_line": 113,
      "comment": "",
      "child_ranges": [
        "(line 112,col 17)-(line 112,col 60)"
      ]
    }
  ]
}