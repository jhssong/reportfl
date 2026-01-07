{
  "filepath": "/tmp/Math-4b/src/main/java/org/apache/commons/math3/ode/EquationsMapper.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "EquationsMapper",
      "is_interface": false,
      "parent_types": [
        "java.io.Serializable"
      ],
      "begin_line": 34,
      "end_line": 98,
      "comment": "\n * Class mapping the part of a complete state or derivative that pertains\n * to a specific differential equation.\n * \u003cp\u003e\n * Instances of this class are guaranteed to be immutable.\n * \u003c/p\u003e\n * @see SecondaryEquations\n * @version $Id$\n * @since 3.0\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 37,
      "end_line": 37,
      "comment": " Serializable UID. "
    },
    {
      "type": "field",
      "varNames": [
        "firstIndex"
      ],
      "begin_line": 40,
      "end_line": 40,
      "comment": " Index of the first equation element in complete state arrays. "
    },
    {
      "type": "field",
      "varNames": [
        "dimension"
      ],
      "begin_line": 43,
      "end_line": 43,
      "comment": " Dimension of the secondary state parameters. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.ode.EquationsMapper.EquationsMapper(int, int)",
      "begin_line": 49,
      "end_line": 52,
      "comment": " simple constructor.\n     * @param firstIndex index of the first equation element in complete state arrays\n     * @param dimension dimension of the secondary state parameters\n     ",
      "child_ranges": [
        "(line 50,col 9)-(line 50,col 37)",
        "(line 51,col 9)-(line 51,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.ode.EquationsMapper.getFirstIndex()",
      "begin_line": 57,
      "end_line": 59,
      "comment": " Get the index of the first equation element in complete state arrays.\n     * @return index of the first equation element in complete state arrays\n     ",
      "child_ranges": [
        "(line 58,col 9)-(line 58,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.ode.EquationsMapper.getDimension()",
      "begin_line": 64,
      "end_line": 66,
      "comment": " Get the dimension of the secondary state parameters.\n     * @return dimension of the secondary state parameters\n     ",
      "child_ranges": [
        "(line 65,col 9)-(line 65,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.ode.EquationsMapper.extractEquationData(double[], double[])",
      "begin_line": 75,
      "end_line": 81,
      "comment": " Extract equation data from a complete state or derivative array.\n     * @param complete complete state or derivative array from which\n     * equation data should be retrieved\n     * @param equationData placeholder where to put equation data\n     * @throws DimensionMismatchException if the dimension of the equation data does not\n     * match the mapper dimension\n     ",
      "child_ranges": [
        "(line 77,col 9)-(line 79,col 9)",
        "(line 80,col 9)-(line 80,col 75)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.ode.EquationsMapper.insertEquationData(double[], double[])",
      "begin_line": 90,
      "end_line": 96,
      "comment": " Insert equation data into a complete state or derivative array.\n     * @param equationData equation data to be inserted into the complete array\n     * @param complete placeholder where to put equation data (only the\n     * part corresponding to the equation will be overwritten)\n     * @throws DimensionMismatchException if the dimension of the equation data does not\n     * match the mapper dimension\n     ",
      "child_ranges": [
        "(line 92,col 9)-(line 94,col 9)",
        "(line 95,col 9)-(line 95,col 75)"
      ]
    }
  ]
}