{
  "filepath": "/tmp/JxPath-22b/src/java/org/apache/commons/jxpath/ri/model/beans/BeanPointer.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "BeanPointer",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.jxpath.ri.model.beans.PropertyOwnerPointer"
      ],
      "begin_line": 35,
      "end_line": 172,
      "comment": "\n * A Pointer that points to a JavaBean or a collection. It is either\n * the first element of a path or a pointer for a property value.\n * Typically there is a {@link BeanPropertyPointer} between two BeanPointers\n * in the chain.\n *\n * @author Dmitri Plotnikov\n * @version $Revision$ $Date$\n "
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
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 40,
      "end_line": 40,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.jxpath.ri.model.beans.BeanPointer.BeanPointer(org.apache.commons.jxpath.ri.QName, java.lang.Object, org.apache.commons.jxpath.JXPathBeanInfo, java.util.Locale)",
      "begin_line": 49,
      "end_line": 55,
      "comment": "\n     * Create a new BeanPointer.\n     * @param name is the name given to the first node\n     * @param bean pointed\n     * @param beanInfo JXPathBeanInfo\n     * @param locale Locale\n     ",
      "child_ranges": [
        "(line 51,col 9)-(line 51,col 28)",
        "(line 52,col 9)-(line 52,col 25)",
        "(line 53,col 9)-(line 53,col 25)",
        "(line 54,col 9)-(line 54,col 33)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.jxpath.ri.model.beans.BeanPointer.BeanPointer(org.apache.commons.jxpath.ri.model.NodePointer, org.apache.commons.jxpath.ri.QName, java.lang.Object, org.apache.commons.jxpath.JXPathBeanInfo)",
      "begin_line": 64,
      "end_line": 70,
      "comment": "\n     * Create a new BeanPointer.\n     * @param parent pointer\n     * @param name is the name given to the first node\n     * @param bean pointed\n     * @param beanInfo JXPathBeanInfo\n     ",
      "child_ranges": [
        "(line 66,col 9)-(line 66,col 22)",
        "(line 67,col 9)-(line 67,col 25)",
        "(line 68,col 9)-(line 68,col 25)",
        "(line 69,col 9)-(line 69,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.beans.BeanPointer.getPropertyPointer()",
      "begin_line": 72,
      "end_line": 74,
      "comment": "",
      "child_ranges": [
        "(line 73,col 9)-(line 73,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.beans.BeanPointer.getName()",
      "begin_line": 76,
      "end_line": 78,
      "comment": "",
      "child_ranges": [
        "(line 77,col 9)-(line 77,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.beans.BeanPointer.getBaseValue()",
      "begin_line": 80,
      "end_line": 82,
      "comment": "",
      "child_ranges": [
        "(line 81,col 9)-(line 81,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.beans.BeanPointer.isCollection()",
      "begin_line": 88,
      "end_line": 90,
      "comment": "\n     * {@inheritDoc}\n     * @return false\n     ",
      "child_ranges": [
        "(line 89,col 9)-(line 89,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.beans.BeanPointer.getLength()",
      "begin_line": 96,
      "end_line": 98,
      "comment": "\n     * {@inheritDoc}\n     * @return 1\n     ",
      "child_ranges": [
        "(line 97,col 9)-(line 97,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.beans.BeanPointer.isLeaf()",
      "begin_line": 100,
      "end_line": 104,
      "comment": "",
      "child_ranges": [
        "(line 101,col 9)-(line 101,col 33)",
        "(line 102,col 9)-(line 103,col 75)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.beans.BeanPointer.hashCode()",
      "begin_line": 106,
      "end_line": 108,
      "comment": "",
      "child_ranges": [
        "(line 107,col 9)-(line 107,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.beans.BeanPointer.equals(java.lang.Object)",
      "begin_line": 110,
      "end_line": 141,
      "comment": "",
      "child_ranges": [
        "(line 111,col 9)-(line 113,col 9)",
        "(line 115,col 9)-(line 117,col 9)",
        "(line 119,col 9)-(line 119,col 49)",
        "(line 120,col 9)-(line 122,col 9)",
        "(line 124,col 9)-(line 127,col 9)",
        "(line 129,col 9)-(line 129,col 60)",
        "(line 130,col 9)-(line 130,col 73)",
        "(line 131,col 9)-(line 133,col 9)",
        "(line 135,col 9)-(line 139,col 9)",
        "(line 140,col 9)-(line 140,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.beans.BeanPointer.asPath()",
      "begin_line": 150,
      "end_line": 171,
      "comment": "\n     * {@inheritDoc}\n     * If the pointer has a parent, then parent\u0027s path.\n     * If the bean is null, \"null()\".\n     * If the bean is a primitive value, the value itself.\n     * Otherwise - an empty string.\n     ",
      "child_ranges": [
        "(line 151,col 9)-(line 153,col 9)",
        "(line 154,col 9)-(line 156,col 9)",
        "(line 157,col 9)-(line 163,col 9)",
        "(line 164,col 9)-(line 166,col 9)",
        "(line 167,col 9)-(line 169,col 9)",
        "(line 170,col 9)-(line 170,col 19)"
      ]
    }
  ]
}