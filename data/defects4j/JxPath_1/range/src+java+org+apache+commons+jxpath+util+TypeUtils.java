{
  "filepath": "/tmp/JxPath-1b/src/java/org/apache/commons/jxpath/util/TypeUtils.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "TypeUtils",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 25,
      "end_line": 57,
      "comment": "\n * Global type conversion utilities.\n *\n * @author Dmitri Plotnikov\n * @version $Revision$ $Date$\n "
    },
    {
      "type": "field",
      "varNames": [
        "typeConverter"
      ],
      "begin_line": 26,
      "end_line": 26,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.util.TypeUtils.setTypeConverter(org.apache.commons.jxpath.util.TypeConverter)",
      "begin_line": 31,
      "end_line": 33,
      "comment": "\n     * Install an alternative type converter.\n     ",
      "child_ranges": [
        "(line 32,col 9)-(line 32,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.util.TypeUtils.getTypeConverter()",
      "begin_line": 38,
      "end_line": 40,
      "comment": "\n     * Returns the current type converter.\n     ",
      "child_ranges": [
        "(line 39,col 9)-(line 39,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.util.TypeUtils.canConvert(java.lang.Object, java.lang.Class)",
      "begin_line": 46,
      "end_line": 48,
      "comment": "\n     * Returns true if the global converter can convert the supplied\n     * object to the specified type.\n     ",
      "child_ranges": [
        "(line 47,col 9)-(line 47,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.util.TypeUtils.convert(java.lang.Object, java.lang.Class)",
      "begin_line": 54,
      "end_line": 56,
      "comment": "\n     * Converts the supplied object to the specified type. May\n     * throw a RuntimeException.\n     ",
      "child_ranges": [
        "(line 55,col 9)-(line 55,col 53)"
      ]
    }
  ]
}