{
  "filepath": "/tmp/JxPath-21b/src/java/org/apache/commons/jxpath/ri/model/beans/BeanAttributeIterator.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "BeanAttributeIterator",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.jxpath.ri.model.beans.PropertyIterator"
      ],
      "begin_line": 29,
      "end_line": 70,
      "comment": "\n * An iterator of attributes of a JavaBean. Returns bean properties as\n * well as the \"xml:lang\" attribute.\n *\n * @author Dmitri Plotnikov\n * @version $Revision$ $Date$\n "
    },
    {
      "type": "field",
      "varNames": [
        "parent"
      ],
      "begin_line": 30,
      "end_line": 30,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "position"
      ],
      "begin_line": 31,
      "end_line": 31,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "includeXmlLang"
      ],
      "begin_line": 32,
      "end_line": 32,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.jxpath.ri.model.beans.BeanAttributeIterator.BeanAttributeIterator(org.apache.commons.jxpath.ri.model.beans.PropertyOwnerPointer, org.apache.commons.jxpath.ri.QName)",
      "begin_line": 39,
      "end_line": 53,
      "comment": "\n     * Create a new BeanAttributeIterator.\n     * @param parent parent pointer\n     * @param name name of this bean\n     ",
      "child_ranges": [
        "(line 40,col 9)-(line 47,col 18)",
        "(line 48,col 9)-(line 48,col 29)",
        "(line 49,col 9)-(line 52,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.beans.BeanAttributeIterator.getNodePointer()",
      "begin_line": 55,
      "end_line": 57,
      "comment": "",
      "child_ranges": [
        "(line 56,col 9)-(line 56,col 107)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.beans.BeanAttributeIterator.getPosition()",
      "begin_line": 59,
      "end_line": 61,
      "comment": "",
      "child_ranges": [
        "(line 60,col 9)-(line 60,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.beans.BeanAttributeIterator.setPosition(int)",
      "begin_line": 63,
      "end_line": 69,
      "comment": "",
      "child_ranges": [
        "(line 64,col 9)-(line 64,col 33)",
        "(line 65,col 9)-(line 67,col 9)",
        "(line 68,col 9)-(line 68,col 43)"
      ]
    }
  ]
}