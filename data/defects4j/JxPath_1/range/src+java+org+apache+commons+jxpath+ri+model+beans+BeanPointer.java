{
  "filepath": "/tmp/JxPath-1b/src/java/org/apache/commons/jxpath/ri/model/beans/BeanPointer.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "BeanPointer",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.jxpath.ri.model.beans.PropertyOwnerPointer"
      ],
      "begin_line": 35,
      "end_line": 169,
      "comment": "\n * A Pointer that points to a JavaBean or a collection. It is either\n * the first element of a path or a pointer for a property value.\n * Typically there is a BeanPropertyPointer between two BeanPointers\n * in the chain.\n *\n * @author Dmitri Plotnikov\n * @version $Revision$ $Date$\n "
    },
    {
      "type": "field",
      "varNames": [
        "name"
      ],
      "begin_line": 36,
      "end_line": 36,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "bean"
      ],
      "begin_line": 37,
      "end_line": 37,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "beanInfo"
      ],
      "begin_line": 38,
      "end_line": 38,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.jxpath.ri.model.beans.BeanPointer.BeanPointer(org.apache.commons.jxpath.ri.QName, java.lang.Object, org.apache.commons.jxpath.JXPathBeanInfo, java.util.Locale)",
      "begin_line": 40,
      "end_line": 50,
      "comment": "",
      "child_ranges": [
        "(line 46,col 9)-(line 46,col 28)",
        "(line 47,col 9)-(line 47,col 25)",
        "(line 48,col 9)-(line 48,col 25)",
        "(line 49,col 9)-(line 49,col 33)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.jxpath.ri.model.beans.BeanPointer.BeanPointer(org.apache.commons.jxpath.ri.model.NodePointer, org.apache.commons.jxpath.ri.QName, java.lang.Object, org.apache.commons.jxpath.JXPathBeanInfo)",
      "begin_line": 55,
      "end_line": 65,
      "comment": "\n     * @param name is the name given to the first node\n     ",
      "child_ranges": [
        "(line 61,col 9)-(line 61,col 22)",
        "(line 62,col 9)-(line 62,col 25)",
        "(line 63,col 9)-(line 63,col 25)",
        "(line 64,col 9)-(line 64,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.beans.BeanPointer.getPropertyPointer()",
      "begin_line": 67,
      "end_line": 69,
      "comment": "",
      "child_ranges": [
        "(line 68,col 9)-(line 68,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.beans.BeanPointer.getName()",
      "begin_line": 71,
      "end_line": 73,
      "comment": "",
      "child_ranges": [
        "(line 72,col 9)-(line 72,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.beans.BeanPointer.getBaseValue()",
      "begin_line": 78,
      "end_line": 80,
      "comment": "\n     * Returns the bean itself\n     ",
      "child_ranges": [
        "(line 79,col 9)-(line 79,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.beans.BeanPointer.isCollection()",
      "begin_line": 85,
      "end_line": 87,
      "comment": "\n     * Returns false\n     ",
      "child_ranges": [
        "(line 86,col 9)-(line 86,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.beans.BeanPointer.getLength()",
      "begin_line": 92,
      "end_line": 94,
      "comment": "\n     * Returns 1.\n     ",
      "child_ranges": [
        "(line 93,col 9)-(line 93,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.beans.BeanPointer.isLeaf()",
      "begin_line": 96,
      "end_line": 100,
      "comment": "",
      "child_ranges": [
        "(line 97,col 9)-(line 97,col 33)",
        "(line 98,col 9)-(line 99,col 75)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.beans.BeanPointer.hashCode()",
      "begin_line": 102,
      "end_line": 104,
      "comment": "",
      "child_ranges": [
        "(line 103,col 9)-(line 103,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.beans.BeanPointer.equals(java.lang.Object)",
      "begin_line": 106,
      "end_line": 139,
      "comment": "",
      "child_ranges": [
        "(line 107,col 9)-(line 109,col 9)",
        "(line 111,col 9)-(line 113,col 9)",
        "(line 115,col 9)-(line 115,col 49)",
        "(line 116,col 9)-(line 120,col 9)",
        "(line 122,col 9)-(line 125,col 9)",
        "(line 127,col 9)-(line 127,col 60)",
        "(line 128,col 9)-(line 128,col 73)",
        "(line 129,col 9)-(line 131,col 9)",
        "(line 133,col 9)-(line 137,col 9)",
        "(line 138,col 9)-(line 138,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.beans.BeanPointer.asPath()",
      "begin_line": 147,
      "end_line": 168,
      "comment": "\n     * If the pointer has a parent, then parent\u0027s path.\n     * If the bean is null, \"null()\".\n     * If the bean is a primitive value, the value itself.\n     * Otherwise - an empty string.\n     ",
      "child_ranges": [
        "(line 148,col 9)-(line 166,col 9)",
        "(line 167,col 9)-(line 167,col 19)"
      ]
    }
  ]
}