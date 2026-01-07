{
  "filepath": "/tmp/JxPath-19b/src/java/org/apache/commons/jxpath/ri/model/dynabeans/DynaBeanPointer.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "DynaBeanPointer",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.jxpath.ri.model.beans.PropertyOwnerPointer"
      ],
      "begin_line": 35,
      "end_line": 129,
      "comment": "\n * A Pointer that points to a {@link DynaBean}.  If the target DynaBean is Serializable,\n * so should this instance be.\n *\n * @author Dmitri Plotnikov\n * @version $Revision$ $Date$\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 36,
      "end_line": 36,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "name"
      ],
      "begin_line": 38,
      "end_line": 38,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "dynaBean"
      ],
      "begin_line": 39,
      "end_line": 39,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPointer.DynaBeanPointer(org.apache.commons.jxpath.ri.QName, org.apache.commons.beanutils.DynaBean, java.util.Locale)",
      "begin_line": 47,
      "end_line": 51,
      "comment": "\n     * Create a new DynaBeanPointer.\n     * @param name is the name given to the first node\n     * @param dynaBean pointed\n     * @param locale Locale\n     ",
      "child_ranges": [
        "(line 48,col 9)-(line 48,col 28)",
        "(line 49,col 9)-(line 49,col 25)",
        "(line 50,col 9)-(line 50,col 33)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPointer.DynaBeanPointer(org.apache.commons.jxpath.ri.model.NodePointer, org.apache.commons.jxpath.ri.QName, org.apache.commons.beanutils.DynaBean)",
      "begin_line": 59,
      "end_line": 63,
      "comment": "\n     * Create a new DynaBeanPointer.\n     * @param parent pointer\n     * @param name is the name given to the first node\n     * @param dynaBean pointed\n     ",
      "child_ranges": [
        "(line 60,col 9)-(line 60,col 22)",
        "(line 61,col 9)-(line 61,col 25)",
        "(line 62,col 9)-(line 62,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPointer.getPropertyPointer()",
      "begin_line": 65,
      "end_line": 67,
      "comment": "",
      "child_ranges": [
        "(line 66,col 9)-(line 66,col 59)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPointer.getName()",
      "begin_line": 69,
      "end_line": 71,
      "comment": "",
      "child_ranges": [
        "(line 70,col 9)-(line 70,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPointer.getBaseValue()",
      "begin_line": 73,
      "end_line": 75,
      "comment": "",
      "child_ranges": [
        "(line 74,col 9)-(line 74,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPointer.getImmediateNode()",
      "begin_line": 77,
      "end_line": 79,
      "comment": "",
      "child_ranges": [
        "(line 78,col 9)-(line 78,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPointer.isCollection()",
      "begin_line": 81,
      "end_line": 83,
      "comment": "",
      "child_ranges": [
        "(line 82,col 9)-(line 82,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPointer.getLength()",
      "begin_line": 85,
      "end_line": 87,
      "comment": "",
      "child_ranges": [
        "(line 86,col 9)-(line 86,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPointer.isLeaf()",
      "begin_line": 89,
      "end_line": 91,
      "comment": "",
      "child_ranges": [
        "(line 90,col 9)-(line 90,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPointer.hashCode()",
      "begin_line": 93,
      "end_line": 95,
      "comment": "",
      "child_ranges": [
        "(line 94,col 9)-(line 94,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPointer.equals(java.lang.Object)",
      "begin_line": 97,
      "end_line": 114,
      "comment": "",
      "child_ranges": [
        "(line 98,col 9)-(line 100,col 9)",
        "(line 102,col 9)-(line 104,col 9)",
        "(line 106,col 9)-(line 106,col 57)",
        "(line 107,col 9)-(line 109,col 9)",
        "(line 111,col 9)-(line 111,col 60)",
        "(line 112,col 9)-(line 112,col 73)",
        "(line 113,col 9)-(line 113,col 61)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPointer.asPath()",
      "begin_line": 116,
      "end_line": 118,
      "comment": "",
      "child_ranges": [
        "(line 117,col 9)-(line 117,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPointer.equalObjects(java.lang.Object, java.lang.Object)",
      "begin_line": 126,
      "end_line": 128,
      "comment": "\n     * Learn whether two objects are \u003d\u003d || .equals().\n     * @param o1 first object\n     * @param o2 second object\n     * @return boolean\n     ",
      "child_ranges": [
        "(line 127,col 9)-(line 127,col 55)"
      ]
    }
  ]
}