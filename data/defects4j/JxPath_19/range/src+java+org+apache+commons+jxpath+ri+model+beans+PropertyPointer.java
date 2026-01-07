{
  "filepath": "/tmp/JxPath-19b/src/java/org/apache/commons/jxpath/ri/model/beans/PropertyPointer.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "PropertyPointer",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.jxpath.ri.model.NodePointer"
      ],
      "begin_line": 34,
      "end_line": 254,
      "comment": "\n * A pointer allocated by a PropertyOwnerPointer to represent the value of\n * a property of the parent object.\n *\n * @author Dmitri Plotnikov\n * @version $Revision$ $Date$\n "
    },
    {
      "type": "field",
      "varNames": [
        "UNSPECIFIED_PROPERTY"
      ],
      "begin_line": 35,
      "end_line": 35,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "propertyIndex"
      ],
      "begin_line": 38,
      "end_line": 38,
      "comment": " property index "
    },
    {
      "type": "field",
      "varNames": [
        "bean"
      ],
      "begin_line": 41,
      "end_line": 41,
      "comment": " owning object "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.jxpath.ri.model.beans.PropertyPointer.PropertyPointer(org.apache.commons.jxpath.ri.model.NodePointer)",
      "begin_line": 48,
      "end_line": 50,
      "comment": "\n     * Takes a javabean, a descriptor of a property of that object and\n     * an offset within that property (starting with 0).\n     * @param parent parent pointer\n     ",
      "child_ranges": [
        "(line 49,col 9)-(line 49,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.beans.PropertyPointer.getPropertyIndex()",
      "begin_line": 56,
      "end_line": 58,
      "comment": "\n     * Get the property index.\n     * @return int index\n     ",
      "child_ranges": [
        "(line 57,col 9)-(line 57,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.beans.PropertyPointer.setPropertyIndex(int)",
      "begin_line": 64,
      "end_line": 69,
      "comment": "\n     * Set the property index.\n     * @param index property index\n     ",
      "child_ranges": [
        "(line 65,col 9)-(line 68,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.beans.PropertyPointer.getBean()",
      "begin_line": 75,
      "end_line": 80,
      "comment": "\n     * Get the parent bean.\n     * @return Object\n     ",
      "child_ranges": [
        "(line 76,col 9)-(line 78,col 9)",
        "(line 79,col 9)-(line 79,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.beans.PropertyPointer.getName()",
      "begin_line": 82,
      "end_line": 84,
      "comment": "",
      "child_ranges": [
        "(line 83,col 9)-(line 83,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.beans.PropertyPointer.getPropertyName()",
      "begin_line": 90,
      "end_line": 90,
      "comment": "\n     * Get the property name.\n     * @return String property name.\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.beans.PropertyPointer.setPropertyName(java.lang.String)",
      "begin_line": 96,
      "end_line": 96,
      "comment": "\n     * Set the property name.\n     * @param propertyName property name to set.\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.beans.PropertyPointer.getPropertyCount()",
      "begin_line": 102,
      "end_line": 102,
      "comment": "\n     * Count the number of properties represented.\n     * @return int\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.beans.PropertyPointer.getPropertyNames()",
      "begin_line": 108,
      "end_line": 108,
      "comment": "\n     * Get the names of the included properties.\n     * @return String[]\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.beans.PropertyPointer.isActualProperty()",
      "begin_line": 114,
      "end_line": 114,
      "comment": "\n     * Learn whether this pointer references an actual property.\n     * @return true if actual\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.beans.PropertyPointer.isActual()",
      "begin_line": 116,
      "end_line": 122,
      "comment": "",
      "child_ranges": [
        "(line 117,col 9)-(line 119,col 9)",
        "(line 121,col 9)-(line 121,col 32)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "UNINITIALIZED"
      ],
      "begin_line": 124,
      "end_line": 124,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "value"
      ],
      "begin_line": 126,
      "end_line": 126,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.beans.PropertyPointer.getImmediateNode()",
      "begin_line": 128,
      "end_line": 134,
      "comment": "",
      "child_ranges": [
        "(line 129,col 9)-(line 132,col 9)",
        "(line 133,col 9)-(line 133,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.beans.PropertyPointer.isCollection()",
      "begin_line": 136,
      "end_line": 139,
      "comment": "",
      "child_ranges": [
        "(line 137,col 9)-(line 137,col 38)",
        "(line 138,col 9)-(line 138,col 63)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.beans.PropertyPointer.isLeaf()",
      "begin_line": 141,
      "end_line": 144,
      "comment": "",
      "child_ranges": [
        "(line 142,col 9)-(line 142,col 33)",
        "(line 143,col 9)-(line 143,col 92)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.beans.PropertyPointer.getLength()",
      "begin_line": 151,
      "end_line": 153,
      "comment": "\n     * If the property contains a collection, then the length of that\n     * collection, otherwise - 1.\n     * @return int length\n     ",
      "child_ranges": [
        "(line 152,col 9)-(line 152,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.beans.PropertyPointer.getImmediateValuePointer()",
      "begin_line": 160,
      "end_line": 165,
      "comment": "\n     * Returns a NodePointer that can be used to access the currently\n     * selected property value.\n     * @return NodePointer\n     ",
      "child_ranges": [
        "(line 161,col 9)-(line 164,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.beans.PropertyPointer.createPath(org.apache.commons.jxpath.JXPathContext)",
      "begin_line": 167,
      "end_line": 184,
      "comment": "",
      "child_ranges": [
        "(line 168,col 9)-(line 182,col 9)",
        "(line 183,col 9)-(line 183,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.beans.PropertyPointer.createPath(org.apache.commons.jxpath.JXPathContext, java.lang.Object)",
      "begin_line": 186,
      "end_line": 193,
      "comment": "",
      "child_ranges": [
        "(line 188,col 9)-(line 190,col 9)",
        "(line 191,col 9)-(line 191,col 24)",
        "(line 192,col 9)-(line 192,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.beans.PropertyPointer.createChild(org.apache.commons.jxpath.JXPathContext, org.apache.commons.jxpath.ri.QName, int, java.lang.Object)",
      "begin_line": 195,
      "end_line": 206,
      "comment": "",
      "child_ranges": [
        "(line 200,col 9)-(line 200,col 57)",
        "(line 201,col 9)-(line 203,col 9)",
        "(line 204,col 9)-(line 204,col 29)",
        "(line 205,col 9)-(line 205,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.beans.PropertyPointer.createChild(org.apache.commons.jxpath.JXPathContext, org.apache.commons.jxpath.ri.QName, int)",
      "begin_line": 208,
      "end_line": 218,
      "comment": "",
      "child_ranges": [
        "(line 212,col 9)-(line 212,col 57)",
        "(line 213,col 9)-(line 215,col 9)",
        "(line 216,col 9)-(line 216,col 29)",
        "(line 217,col 9)-(line 217,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.beans.PropertyPointer.hashCode()",
      "begin_line": 220,
      "end_line": 222,
      "comment": "",
      "child_ranges": [
        "(line 221,col 9)-(line 221,col 78)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.beans.PropertyPointer.equals(java.lang.Object)",
      "begin_line": 224,
      "end_line": 246,
      "comment": "",
      "child_ranges": [
        "(line 225,col 9)-(line 227,col 9)",
        "(line 229,col 9)-(line 231,col 9)",
        "(line 233,col 9)-(line 233,col 57)",
        "(line 234,col 9)-(line 236,col 9)",
        "(line 238,col 9)-(line 241,col 9)",
        "(line 243,col 9)-(line 243,col 60)",
        "(line 244,col 9)-(line 244,col 73)",
        "(line 245,col 9)-(line 245,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.beans.PropertyPointer.compareChildNodePointers(org.apache.commons.jxpath.ri.model.NodePointer, org.apache.commons.jxpath.ri.model.NodePointer)",
      "begin_line": 248,
      "end_line": 252,
      "comment": "",
      "child_ranges": [
        "(line 251,col 9)-(line 251,col 78)"
      ]
    }
  ]
}