{
  "filepath": "/tmp/JxPath-20b/src/java/org/apache/commons/jxpath/ri/compiler/LocationPath.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "LocationPath",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.jxpath.ri.compiler.Path"
      ],
      "begin_line": 26,
      "end_line": 89,
      "comment": "\n * @author Dmitri Plotnikov\n * @version $Revision$ $Date$\n "
    },
    {
      "type": "field",
      "varNames": [
        "absolute"
      ],
      "begin_line": 28,
      "end_line": 28,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.jxpath.ri.compiler.LocationPath.LocationPath(boolean, org.apache.commons.jxpath.ri.compiler.Step[])",
      "begin_line": 35,
      "end_line": 38,
      "comment": "\n     * Create a new LocationPath.\n     * @param absolute whether this is an absolute path\n     * @param steps to evaluate\n     ",
      "child_ranges": [
        "(line 36,col 9)-(line 36,col 21)",
        "(line 37,col 9)-(line 37,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.compiler.LocationPath.isAbsolute()",
      "begin_line": 44,
      "end_line": 46,
      "comment": "\n     * Learn whether this LocationPath is absolute.\n     * @return boolean\n     ",
      "child_ranges": [
        "(line 45,col 9)-(line 45,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.compiler.LocationPath.computeContextDependent()",
      "begin_line": 48,
      "end_line": 50,
      "comment": "",
      "child_ranges": [
        "(line 49,col 9)-(line 49,col 60)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.compiler.LocationPath.toString()",
      "begin_line": 52,
      "end_line": 64,
      "comment": "",
      "child_ranges": [
        "(line 53,col 9)-(line 53,col 49)",
        "(line 54,col 9)-(line 54,col 34)",
        "(line 55,col 9)-(line 62,col 9)",
        "(line 63,col 9)-(line 63,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.compiler.LocationPath.compute(org.apache.commons.jxpath.ri.EvalContext)",
      "begin_line": 66,
      "end_line": 76,
      "comment": "",
      "child_ranges": [
        "(line 68,col 9)-(line 68,col 32)",
        "(line 69,col 9)-(line 74,col 9)",
        "(line 75,col 9)-(line 75,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.compiler.LocationPath.computeValue(org.apache.commons.jxpath.ri.EvalContext)",
      "begin_line": 78,
      "end_line": 88,
      "comment": "",
      "child_ranges": [
        "(line 80,col 9)-(line 80,col 32)",
        "(line 81,col 9)-(line 86,col 9)",
        "(line 87,col 9)-(line 87,col 57)"
      ]
    }
  ]
}