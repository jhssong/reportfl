{
  "filepath": "/tmp/JxPath-22b/src/java/org/apache/commons/jxpath/ri/model/beans/PropertyPointer.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "PropertyPointer",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.jxpath.ri.model.NodePointer"
      ],
      "begin_line": 34,
      "end_line": 255,
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
      "end_line": 154,
      "comment": "\n     * If the property contains a collection, then the length of that\n     * collection, otherwise - 1.\n     * @return int length\n     ",
      "child_ranges": [
        "(line 152,col 9)-(line 152,col 42)",
        "(line 153,col 9)-(line 153,col 71)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.beans.PropertyPointer.getImmediateValuePointer()",
      "begin_line": 161,
      "end_line": 166,
      "comment": "\n     * Returns a NodePointer that can be used to access the currently\n     * selected property value.\n     * @return NodePointer\n     ",
      "child_ranges": [
        "(line 162,col 9)-(line 165,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.beans.PropertyPointer.createPath(org.apache.commons.jxpath.JXPathContext)",
      "begin_line": 168,
      "end_line": 185,
      "comment": "",
      "child_ranges": [
        "(line 169,col 9)-(line 183,col 9)",
        "(line 184,col 9)-(line 184,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.beans.PropertyPointer.createPath(org.apache.commons.jxpath.JXPathContext, java.lang.Object)",
      "begin_line": 187,
      "end_line": 194,
      "comment": "",
      "child_ranges": [
        "(line 189,col 9)-(line 191,col 9)",
        "(line 192,col 9)-(line 192,col 24)",
        "(line 193,col 9)-(line 193,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.beans.PropertyPointer.createChild(org.apache.commons.jxpath.JXPathContext, org.apache.commons.jxpath.ri.QName, int, java.lang.Object)",
      "begin_line": 196,
      "end_line": 207,
      "comment": "",
      "child_ranges": [
        "(line 201,col 9)-(line 201,col 57)",
        "(line 202,col 9)-(line 204,col 9)",
        "(line 205,col 9)-(line 205,col 29)",
        "(line 206,col 9)-(line 206,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.beans.PropertyPointer.createChild(org.apache.commons.jxpath.JXPathContext, org.apache.commons.jxpath.ri.QName, int)",
      "begin_line": 209,
      "end_line": 219,
      "comment": "",
      "child_ranges": [
        "(line 213,col 9)-(line 213,col 57)",
        "(line 214,col 9)-(line 216,col 9)",
        "(line 217,col 9)-(line 217,col 29)",
        "(line 218,col 9)-(line 218,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.beans.PropertyPointer.hashCode()",
      "begin_line": 221,
      "end_line": 223,
      "comment": "",
      "child_ranges": [
        "(line 222,col 9)-(line 222,col 78)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.beans.PropertyPointer.equals(java.lang.Object)",
      "begin_line": 225,
      "end_line": 247,
      "comment": "",
      "child_ranges": [
        "(line 226,col 9)-(line 228,col 9)",
        "(line 230,col 9)-(line 232,col 9)",
        "(line 234,col 9)-(line 234,col 57)",
        "(line 235,col 9)-(line 237,col 9)",
        "(line 239,col 9)-(line 242,col 9)",
        "(line 244,col 9)-(line 244,col 60)",
        "(line 245,col 9)-(line 245,col 73)",
        "(line 246,col 9)-(line 246,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.beans.PropertyPointer.compareChildNodePointers(org.apache.commons.jxpath.ri.model.NodePointer, org.apache.commons.jxpath.ri.model.NodePointer)",
      "begin_line": 249,
      "end_line": 253,
      "comment": "",
      "child_ranges": [
        "(line 252,col 9)-(line 252,col 78)"
      ]
    }
  ]
}