{
  "filepath": "/tmp/Math-32b/src/main/java/org/apache/commons/math3/geometry/partitioning/Characterization.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "Characterization",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 26,
      "end_line": 90,
      "comment": " Characterization of a sub-hyperplane.\n * @param \u003cS\u003e Type of the space.\n * @version $Id$\n * @since 3.0\n "
    },
    {
      "type": "field",
      "varNames": [
        "in"
      ],
      "begin_line": 29,
      "end_line": 29,
      "comment": " Parts of the sub-hyperplane that have inside cells on the tested side. "
    },
    {
      "type": "field",
      "varNames": [
        "out"
      ],
      "begin_line": 32,
      "end_line": 32,
      "comment": " Parts of the sub-hyperplane that have outside cells on the tested side. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.geometry.partitioning.Characterization.Characterization()",
      "begin_line": 36,
      "end_line": 39,
      "comment": " Create an empty characterization of a sub-hyperplane.\n     ",
      "child_ranges": [
        "(line 37,col 9)-(line 37,col 19)",
        "(line 38,col 9)-(line 38,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.geometry.partitioning.Characterization.hasIn()",
      "begin_line": 44,
      "end_line": 46,
      "comment": " Check if the sub-hyperplane that have inside cells on the tested side.\n     * @return true if the sub-hyperplane that have inside cells on the tested side\n     ",
      "child_ranges": [
        "(line 45,col 9)-(line 45,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.geometry.partitioning.Characterization.getIn()",
      "begin_line": 51,
      "end_line": 53,
      "comment": " Get the parts of the sub-hyperplane that have inside cells on the tested side.\n     * @return parts of the sub-hyperplane that have inside cells on the tested side\n     ",
      "child_ranges": [
        "(line 52,col 9)-(line 52,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.geometry.partitioning.Characterization.hasOut()",
      "begin_line": 58,
      "end_line": 60,
      "comment": " Check if the sub-hyperplane that have outside cells on the tested side.\n     * @return true if the sub-hyperplane that have outside cells on the tested side\n     ",
      "child_ranges": [
        "(line 59,col 9)-(line 59,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.geometry.partitioning.Characterization.getOut()",
      "begin_line": 65,
      "end_line": 67,
      "comment": " Get the parts of the sub-hyperplane that have outside cells on the tested side.\n     * @return parts of the sub-hyperplane that have outside cells on the tested side\n     ",
      "child_ranges": [
        "(line 66,col 9)-(line 66,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.geometry.partitioning.Characterization.add(org.apache.commons.math3.geometry.partitioning.SubHyperplane\u003cS\u003e, boolean)",
      "begin_line": 74,
      "end_line": 88,
      "comment": " Add a part of the sub-hyperplane known to have inside or outside cell on the tested side.\n     * @param sub part of the sub-hyperplane to add\n     * @param inside if true, the part added as an inside cell on the tested side, otherwise\n     * it has an outside cell on the tested side\n     ",
      "child_ranges": [
        "(line 75,col 9)-(line 87,col 9)"
      ]
    }
  ]
}