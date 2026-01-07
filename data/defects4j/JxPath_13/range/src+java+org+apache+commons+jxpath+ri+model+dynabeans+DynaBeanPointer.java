{
  "filepath": "/tmp/JxPath-13b/src/java/org/apache/commons/jxpath/ri/model/dynabeans/DynaBeanPointer.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "DynaBeanPointer",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.jxpath.ri.model.beans.PropertyOwnerPointer"
      ],
      "begin_line": 34,
      "end_line": 120,
      "comment": "\n * A Pointer that points to a DynaBean.\n *\n * @author Dmitri Plotnikov\n * @version $Revision$ $Date$\n "
    },
    {
      "type": "field",
      "varNames": [
        "name"
      ],
      "begin_line": 35,
      "end_line": 35,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "dynaBean"
      ],
      "begin_line": 36,
      "end_line": 36,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPointer.DynaBeanPointer(org.apache.commons.jxpath.ri.QName, org.apache.commons.beanutils.DynaBean, java.util.Locale)",
      "begin_line": 38,
      "end_line": 42,
      "comment": "",
      "child_ranges": [
        "(line 39,col 9)-(line 39,col 28)",
        "(line 40,col 9)-(line 40,col 25)",
        "(line 41,col 9)-(line 41,col 33)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPointer.DynaBeanPointer(org.apache.commons.jxpath.ri.model.NodePointer, org.apache.commons.jxpath.ri.QName, org.apache.commons.beanutils.DynaBean)",
      "begin_line": 47,
      "end_line": 51,
      "comment": "\n     * @param name is the name given to the first node\n     ",
      "child_ranges": [
        "(line 48,col 9)-(line 48,col 22)",
        "(line 49,col 9)-(line 49,col 25)",
        "(line 50,col 9)-(line 50,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPointer.getPropertyPointer()",
      "begin_line": 53,
      "end_line": 55,
      "comment": "",
      "child_ranges": [
        "(line 54,col 9)-(line 54,col 59)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPointer.getName()",
      "begin_line": 57,
      "end_line": 59,
      "comment": "",
      "child_ranges": [
        "(line 58,col 9)-(line 58,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPointer.getBaseValue()",
      "begin_line": 64,
      "end_line": 66,
      "comment": "\n     * Returns the bean itself\n     ",
      "child_ranges": [
        "(line 65,col 9)-(line 65,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPointer.getImmediateNode()",
      "begin_line": 68,
      "end_line": 70,
      "comment": "",
      "child_ranges": [
        "(line 69,col 9)-(line 69,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPointer.isCollection()",
      "begin_line": 72,
      "end_line": 74,
      "comment": "",
      "child_ranges": [
        "(line 73,col 9)-(line 73,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPointer.getLength()",
      "begin_line": 79,
      "end_line": 81,
      "comment": "\n     * Returns 1.\n     ",
      "child_ranges": [
        "(line 80,col 9)-(line 80,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPointer.isLeaf()",
      "begin_line": 83,
      "end_line": 85,
      "comment": "",
      "child_ranges": [
        "(line 84,col 9)-(line 84,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPointer.hashCode()",
      "begin_line": 87,
      "end_line": 89,
      "comment": "",
      "child_ranges": [
        "(line 88,col 9)-(line 88,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPointer.equals(java.lang.Object)",
      "begin_line": 91,
      "end_line": 108,
      "comment": "",
      "child_ranges": [
        "(line 92,col 9)-(line 94,col 9)",
        "(line 96,col 9)-(line 98,col 9)",
        "(line 100,col 9)-(line 100,col 57)",
        "(line 101,col 9)-(line 103,col 9)",
        "(line 105,col 9)-(line 105,col 60)",
        "(line 106,col 9)-(line 106,col 73)",
        "(line 107,col 9)-(line 107,col 61)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPointer.asPath()",
      "begin_line": 113,
      "end_line": 115,
      "comment": "\n     * If there\u0027s a parent - parent\u0027s path, otherwise \"/\".\n     ",
      "child_ranges": [
        "(line 114,col 9)-(line 114,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPointer.equalObjects(java.lang.Object, java.lang.Object)",
      "begin_line": 117,
      "end_line": 119,
      "comment": "",
      "child_ranges": [
        "(line 118,col 9)-(line 118,col 55)"
      ]
    }
  ]
}