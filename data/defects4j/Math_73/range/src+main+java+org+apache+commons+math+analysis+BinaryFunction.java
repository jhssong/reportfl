{
  "filepath": "/tmp/Math-73b/src/main/java/org/apache/commons/math/analysis/BinaryFunction.java",
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
      "signature": "org.apache.commons.math.analysis.BinaryFunction.Anonymous-84267b9b-e5b2-4ebf-93a2-8dd16e977c76.value(double, double)",
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
      "signature": "org.apache.commons.math.analysis.BinaryFunction.Anonymous-39bcfd88-5d78-4aef-bb61-88e6f98d1a7c.value(double, double)",
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
      "signature": "org.apache.commons.math.analysis.BinaryFunction.Anonymous-4ef4268b-350a-412c-9583-73bdcfd886f2.value(double, double)",
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
      "signature": "org.apache.commons.math.analysis.BinaryFunction.Anonymous-d9e0da81-c2ac-46be-a60c-d377500bd848.value(double, double)",
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
      "signature": "org.apache.commons.math.analysis.BinaryFunction.Anonymous-0162b672-703e-489e-885c-7aa1fd1406e0.value(double, double)",
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
      "signature": "org.apache.commons.math.analysis.BinaryFunction.Anonymous-0e95ec22-ecb9-4b6c-8ab4-190c4045fcec.value(double, double)",
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
      "signature": "org.apache.commons.math.analysis.BinaryFunction.Anonymous-a26ea825-b7a1-4eb3-b50e-b231e87f3ce7.value(double)",
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
      "signature": "org.apache.commons.math.analysis.BinaryFunction.Anonymous-2a3da44e-bedf-4350-81d8-d2587fafcc98.value(double)",
      "begin_line": 108,
      "end_line": 112,
      "comment": "",
      "child_ranges": [
        "(line 111,col 17)-(line 111,col 60)"
      ]
    }
  ]
}