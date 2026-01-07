{
  "filepath": "/tmp/JxPath-21b/src/java/org/apache/commons/jxpath/ri/QName.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "QName",
      "is_interface": false,
      "parent_types": [
        "java.io.Serializable"
      ],
      "begin_line": 29,
      "end_line": 91,
      "comment": "\n * A qualified name: a combination of an optional namespace prefix\n * and an local name.\n *\n * @author Dmitri Plotnikov\n * @version $Revision$ $Date$\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 30,
      "end_line": 30,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "prefix"
      ],
      "begin_line": 32,
      "end_line": 32,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "name"
      ],
      "begin_line": 33,
      "end_line": 33,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "qualifiedName"
      ],
      "begin_line": 34,
      "end_line": 34,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.jxpath.ri.QName.QName(java.lang.String)",
      "begin_line": 40,
      "end_line": 45,
      "comment": "\n     * Create a new QName.\n     * @param qualifiedName value\n     ",
      "child_ranges": [
        "(line 41,col 9)-(line 41,col 43)",
        "(line 42,col 9)-(line 42,col 47)",
        "(line 43,col 9)-(line 43,col 70)",
        "(line 44,col 9)-(line 44,col 78)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.jxpath.ri.QName.QName(java.lang.String, java.lang.String)",
      "begin_line": 52,
      "end_line": 56,
      "comment": "\n     * Create a new QName.\n     * @param prefix ns\n     * @param localName String\n     ",
      "child_ranges": [
        "(line 53,col 9)-(line 53,col 29)",
        "(line 54,col 9)-(line 54,col 30)",
        "(line 55,col 9)-(line 55,col 83)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.QName.getPrefix()",
      "begin_line": 62,
      "end_line": 64,
      "comment": "\n     * Get the prefix of this QName.\n     * @return String\n     ",
      "child_ranges": [
        "(line 63,col 9)-(line 63,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.QName.getName()",
      "begin_line": 70,
      "end_line": 72,
      "comment": "\n     * Get the local name.\n     * @return String\n     ",
      "child_ranges": [
        "(line 71,col 9)-(line 71,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.QName.toString()",
      "begin_line": 74,
      "end_line": 76,
      "comment": "",
      "child_ranges": [
        "(line 75,col 9)-(line 75,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.QName.hashCode()",
      "begin_line": 78,
      "end_line": 80,
      "comment": "",
      "child_ranges": [
        "(line 79,col 9)-(line 79,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.QName.equals(java.lang.Object)",
      "begin_line": 82,
      "end_line": 90,
      "comment": "",
      "child_ranges": [
        "(line 83,col 9)-(line 85,col 9)",
        "(line 86,col 9)-(line 88,col 9)",
        "(line 89,col 9)-(line 89,col 68)"
      ]
    }
  ]
}