{
  "filepath": "/tmp/JxPath-18b/src/java/org/apache/commons/jxpath/ri/model/beans/PropertyPointer.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "PropertyPointer",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.jxpath.ri.model.NodePointer"
      ],
      "begin_line": 35,
      "end_line": 307,
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
      "begin_line": 39,
      "end_line": 39,
      "comment": " property index "
    },
    {
      "type": "field",
      "varNames": [
        "bean"
      ],
      "begin_line": 42,
      "end_line": 42,
      "comment": " owning object "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.jxpath.ri.model.beans.PropertyPointer.PropertyPointer(org.apache.commons.jxpath.ri.model.NodePointer)",
      "begin_line": 49,
      "end_line": 51,
      "comment": "\n     * Takes a javabean, a descriptor of a property of that object and\n     * an offset within that property (starting with 0).\n     * @param parent parent pointer\n     ",
      "child_ranges": [
        "(line 50,col 9)-(line 50,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.beans.PropertyPointer.getPropertyIndex()",
      "begin_line": 57,
      "end_line": 59,
      "comment": "\n     * Get the property index.\n     * @return int index\n     ",
      "child_ranges": [
        "(line 58,col 9)-(line 58,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.beans.PropertyPointer.setPropertyIndex(int)",
      "begin_line": 65,
      "end_line": 70,
      "comment": "\n     * Set the property index.\n     * @param index property index\n     ",
      "child_ranges": [
        "(line 66,col 9)-(line 69,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.beans.PropertyPointer.getBean()",
      "begin_line": 76,
      "end_line": 81,
      "comment": "\n     * Get the parent bean.\n     * @return Object\n     ",
      "child_ranges": [
        "(line 77,col 9)-(line 79,col 9)",
        "(line 80,col 9)-(line 80,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.beans.PropertyPointer.getName()",
      "begin_line": 86,
      "end_line": 88,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 87,col 9)-(line 87,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.beans.PropertyPointer.getPropertyName()",
      "begin_line": 94,
      "end_line": 94,
      "comment": "\n     * Get the property name.\n     * @return String property name.\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.beans.PropertyPointer.setPropertyName(java.lang.String)",
      "begin_line": 100,
      "end_line": 100,
      "comment": "\n     * Set the property name.\n     * @param propertyName property name to set.\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.beans.PropertyPointer.getPropertyCount()",
      "begin_line": 106,
      "end_line": 106,
      "comment": "\n     * Count the number of properties represented.\n     * @return int\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.beans.PropertyPointer.getPropertyNames()",
      "begin_line": 112,
      "end_line": 112,
      "comment": "\n     * Get the names of the included properties.\n     * @return String[]\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.beans.PropertyPointer.isActualProperty()",
      "begin_line": 118,
      "end_line": 118,
      "comment": "\n     * Learn whether this pointer references an actual property.\n     * @return true if actual\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.beans.PropertyPointer.isActual()",
      "begin_line": 123,
      "end_line": 129,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 124,col 9)-(line 126,col 9)",
        "(line 128,col 9)-(line 128,col 32)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "UNINITIALIZED"
      ],
      "begin_line": 131,
      "end_line": 131,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "value"
      ],
      "begin_line": 133,
      "end_line": 133,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.beans.PropertyPointer.getImmediateNode()",
      "begin_line": 138,
      "end_line": 144,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 139,col 9)-(line 142,col 9)",
        "(line 143,col 9)-(line 143,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.beans.PropertyPointer.isCollection()",
      "begin_line": 149,
      "end_line": 152,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 150,col 9)-(line 150,col 38)",
        "(line 151,col 9)-(line 151,col 63)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.beans.PropertyPointer.isLeaf()",
      "begin_line": 157,
      "end_line": 160,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 158,col 9)-(line 158,col 33)",
        "(line 159,col 9)-(line 159,col 92)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.beans.PropertyPointer.getLength()",
      "begin_line": 167,
      "end_line": 169,
      "comment": "\n     * If the property contains a collection, then the length of that\n     * collection, otherwise - 1.\n     * @return int length\n     ",
      "child_ranges": [
        "(line 168,col 9)-(line 168,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.beans.PropertyPointer.getImmediateValuePointer()",
      "begin_line": 176,
      "end_line": 181,
      "comment": "\n     * Returns a NodePointer that can be used to access the currently\n     * selected property value.\n     * @return NodePointer\n     ",
      "child_ranges": [
        "(line 177,col 9)-(line 180,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.beans.PropertyPointer.createPath(org.apache.commons.jxpath.JXPathContext)",
      "begin_line": 186,
      "end_line": 203,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 187,col 9)-(line 201,col 9)",
        "(line 202,col 9)-(line 202,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.beans.PropertyPointer.createPath(org.apache.commons.jxpath.JXPathContext, java.lang.Object)",
      "begin_line": 208,
      "end_line": 215,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 210,col 9)-(line 212,col 9)",
        "(line 213,col 9)-(line 213,col 24)",
        "(line 214,col 9)-(line 214,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.beans.PropertyPointer.createChild(org.apache.commons.jxpath.JXPathContext, org.apache.commons.jxpath.ri.QName, int, java.lang.Object)",
      "begin_line": 220,
      "end_line": 231,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 225,col 9)-(line 225,col 57)",
        "(line 226,col 9)-(line 228,col 9)",
        "(line 229,col 9)-(line 229,col 29)",
        "(line 230,col 9)-(line 230,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.beans.PropertyPointer.createChild(org.apache.commons.jxpath.JXPathContext, org.apache.commons.jxpath.ri.QName, int)",
      "begin_line": 236,
      "end_line": 246,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 240,col 9)-(line 240,col 57)",
        "(line 241,col 9)-(line 243,col 9)",
        "(line 244,col 9)-(line 244,col 29)",
        "(line 245,col 9)-(line 245,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.beans.PropertyPointer.hashCode()",
      "begin_line": 251,
      "end_line": 253,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 252,col 9)-(line 252,col 78)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.beans.PropertyPointer.equals(java.lang.Object)",
      "begin_line": 258,
      "end_line": 280,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 259,col 9)-(line 261,col 9)",
        "(line 263,col 9)-(line 265,col 9)",
        "(line 267,col 9)-(line 267,col 57)",
        "(line 268,col 9)-(line 270,col 9)",
        "(line 272,col 9)-(line 275,col 9)",
        "(line 277,col 9)-(line 277,col 60)",
        "(line 278,col 9)-(line 278,col 73)",
        "(line 279,col 9)-(line 279,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.beans.PropertyPointer.compareChildNodePointers(org.apache.commons.jxpath.ri.model.NodePointer, org.apache.commons.jxpath.ri.model.NodePointer)",
      "begin_line": 285,
      "end_line": 289,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 288,col 9)-(line 288,col 78)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.beans.PropertyPointer.getAbstractFactory(org.apache.commons.jxpath.JXPathContext)",
      "begin_line": 297,
      "end_line": 306,
      "comment": "\n     * Get the required AbstractFactory configured on the specified JXPathContext.\n     * @param context JXPathContext\n     * @return AbstractFactory\n     * @throws JXPathException if no factory configured.\n     ",
      "child_ranges": [
        "(line 298,col 9)-(line 298,col 55)",
        "(line 299,col 9)-(line 304,col 9)",
        "(line 305,col 9)-(line 305,col 23)"
      ]
    }
  ]
}