{
  "filepath": "/tmp/JxPath-8b/src/java/org/apache/commons/jxpath/ri/model/beans/PropertyPointer.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "PropertyPointer",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.jxpath.ri.model.NodePointer"
      ],
      "begin_line": 35,
      "end_line": 230,
      "comment": "\n * A pointer allocated by a PropertyOwnerPointer to represent the value of\n * a property of the parent object.\n *\n * @author Dmitri Plotnikov\n * @version $Revision$ $Date$\n "
    },
    {
      "type": "field",
      "varNames": [
        "UNSPECIFIED_PROPERTY"
      ],
      "begin_line": 36,
      "end_line": 36,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "propertyIndex"
      ],
      "begin_line": 38,
      "end_line": 38,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "bean"
      ],
      "begin_line": 39,
      "end_line": 39,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.jxpath.ri.model.beans.PropertyPointer.PropertyPointer(org.apache.commons.jxpath.ri.model.NodePointer)",
      "begin_line": 45,
      "end_line": 47,
      "comment": "\n     * Takes a javabean, a descriptor of a property of that object and\n     * an offset within that property (starting with 0).\n     ",
      "child_ranges": [
        "(line 46,col 9)-(line 46,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.beans.PropertyPointer.getPropertyIndex()",
      "begin_line": 49,
      "end_line": 51,
      "comment": "",
      "child_ranges": [
        "(line 50,col 9)-(line 50,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.beans.PropertyPointer.setPropertyIndex(int)",
      "begin_line": 53,
      "end_line": 58,
      "comment": "",
      "child_ranges": [
        "(line 54,col 9)-(line 57,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.beans.PropertyPointer.getBean()",
      "begin_line": 60,
      "end_line": 65,
      "comment": "",
      "child_ranges": [
        "(line 61,col 9)-(line 63,col 9)",
        "(line 64,col 9)-(line 64,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.beans.PropertyPointer.getName()",
      "begin_line": 67,
      "end_line": 69,
      "comment": "",
      "child_ranges": [
        "(line 68,col 9)-(line 68,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.beans.PropertyPointer.getPropertyName()",
      "begin_line": 71,
      "end_line": 71,
      "comment": "",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.beans.PropertyPointer.setPropertyName(java.lang.String)",
      "begin_line": 73,
      "end_line": 73,
      "comment": "",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.beans.PropertyPointer.getPropertyCount()",
      "begin_line": 75,
      "end_line": 75,
      "comment": "",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.beans.PropertyPointer.getPropertyNames()",
      "begin_line": 77,
      "end_line": 77,
      "comment": "",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.beans.PropertyPointer.isActualProperty()",
      "begin_line": 79,
      "end_line": 79,
      "comment": "",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.beans.PropertyPointer.isActual()",
      "begin_line": 81,
      "end_line": 87,
      "comment": "",
      "child_ranges": [
        "(line 82,col 9)-(line 84,col 9)",
        "(line 86,col 9)-(line 86,col 32)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "UNINITIALIZED"
      ],
      "begin_line": 89,
      "end_line": 89,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "value"
      ],
      "begin_line": 91,
      "end_line": 91,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.beans.PropertyPointer.getImmediateNode()",
      "begin_line": 92,
      "end_line": 98,
      "comment": "",
      "child_ranges": [
        "(line 93,col 9)-(line 96,col 9)",
        "(line 97,col 9)-(line 97,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.beans.PropertyPointer.isCollection()",
      "begin_line": 100,
      "end_line": 103,
      "comment": "",
      "child_ranges": [
        "(line 101,col 9)-(line 101,col 38)",
        "(line 102,col 9)-(line 102,col 63)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.beans.PropertyPointer.isLeaf()",
      "begin_line": 105,
      "end_line": 108,
      "comment": "",
      "child_ranges": [
        "(line 106,col 9)-(line 106,col 33)",
        "(line 107,col 9)-(line 107,col 92)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.beans.PropertyPointer.getLength()",
      "begin_line": 114,
      "end_line": 116,
      "comment": "\n     * If the property contains a collection, then the length of that\n     * collection, otherwise - 1.\n     ",
      "child_ranges": [
        "(line 115,col 9)-(line 115,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.beans.PropertyPointer.getImmediateValuePointer()",
      "begin_line": 123,
      "end_line": 128,
      "comment": "\n     * Returns a NodePointer that can be used to access the currently\n     * selected property value.\n     ",
      "child_ranges": [
        "(line 124,col 9)-(line 127,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.beans.PropertyPointer.createPath(org.apache.commons.jxpath.JXPathContext)",
      "begin_line": 130,
      "end_line": 147,
      "comment": "",
      "child_ranges": [
        "(line 131,col 9)-(line 145,col 9)",
        "(line 146,col 9)-(line 146,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.beans.PropertyPointer.createPath(org.apache.commons.jxpath.JXPathContext, java.lang.Object)",
      "begin_line": 149,
      "end_line": 156,
      "comment": "",
      "child_ranges": [
        "(line 151,col 9)-(line 153,col 9)",
        "(line 154,col 9)-(line 154,col 24)",
        "(line 155,col 9)-(line 155,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.beans.PropertyPointer.createChild(org.apache.commons.jxpath.JXPathContext, org.apache.commons.jxpath.ri.QName, int, java.lang.Object)",
      "begin_line": 158,
      "end_line": 170,
      "comment": "",
      "child_ranges": [
        "(line 164,col 9)-(line 164,col 57)",
        "(line 165,col 9)-(line 167,col 9)",
        "(line 168,col 9)-(line 168,col 29)",
        "(line 169,col 9)-(line 169,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.beans.PropertyPointer.createChild(org.apache.commons.jxpath.JXPathContext, org.apache.commons.jxpath.ri.QName, int)",
      "begin_line": 172,
      "end_line": 183,
      "comment": "",
      "child_ranges": [
        "(line 177,col 9)-(line 177,col 57)",
        "(line 178,col 9)-(line 180,col 9)",
        "(line 181,col 9)-(line 181,col 29)",
        "(line 182,col 9)-(line 182,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.beans.PropertyPointer.hashCode()",
      "begin_line": 185,
      "end_line": 187,
      "comment": "",
      "child_ranges": [
        "(line 186,col 9)-(line 186,col 78)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.beans.PropertyPointer.equals(java.lang.Object)",
      "begin_line": 189,
      "end_line": 211,
      "comment": "",
      "child_ranges": [
        "(line 190,col 9)-(line 192,col 9)",
        "(line 194,col 9)-(line 196,col 9)",
        "(line 198,col 9)-(line 198,col 57)",
        "(line 199,col 9)-(line 201,col 9)",
        "(line 203,col 9)-(line 206,col 9)",
        "(line 208,col 9)-(line 208,col 60)",
        "(line 209,col 9)-(line 209,col 73)",
        "(line 210,col 9)-(line 210,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.beans.PropertyPointer.compareChildNodePointers(org.apache.commons.jxpath.ri.model.NodePointer, org.apache.commons.jxpath.ri.model.NodePointer)",
      "begin_line": 213,
      "end_line": 218,
      "comment": "",
      "child_ranges": [
        "(line 217,col 9)-(line 217,col 78)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.beans.PropertyPointer.getAbstractFactory(org.apache.commons.jxpath.JXPathContext)",
      "begin_line": 220,
      "end_line": 229,
      "comment": "",
      "child_ranges": [
        "(line 221,col 9)-(line 221,col 55)",
        "(line 222,col 9)-(line 227,col 9)",
        "(line 228,col 9)-(line 228,col 23)"
      ]
    }
  ]
}