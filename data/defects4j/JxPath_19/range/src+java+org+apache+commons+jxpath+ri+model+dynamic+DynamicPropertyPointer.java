{
  "filepath": "/tmp/JxPath-19b/src/java/org/apache/commons/jxpath/ri/model/dynamic/DynamicPropertyPointer.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "DynamicPropertyPointer",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.jxpath.ri.model.beans.PropertyPointer"
      ],
      "begin_line": 37,
      "end_line": 306,
      "comment": "\n * Pointer pointing to a property of an object with dynamic properties.\n *\n * @author Dmitri Plotnikov\n * @version $Revision$ $Date$\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 39,
      "end_line": 39,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "handler"
      ],
      "begin_line": 41,
      "end_line": 41,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "name"
      ],
      "begin_line": 42,
      "end_line": 42,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "names"
      ],
      "begin_line": 43,
      "end_line": 43,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "requiredPropertyName"
      ],
      "begin_line": 44,
      "end_line": 44,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.jxpath.ri.model.dynamic.DynamicPropertyPointer.DynamicPropertyPointer(org.apache.commons.jxpath.ri.model.NodePointer, org.apache.commons.jxpath.DynamicPropertyHandler)",
      "begin_line": 51,
      "end_line": 55,
      "comment": "\n     * Create a new DynamicPropertyPointer.\n     * @param parent pointer\n     * @param handler DynamicPropertyHandler\n     ",
      "child_ranges": [
        "(line 53,col 9)-(line 53,col 22)",
        "(line 54,col 9)-(line 54,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.dynamic.DynamicPropertyPointer.isContainer()",
      "begin_line": 61,
      "end_line": 63,
      "comment": "\n     * This type of node is auxiliary.\n     * @return true\n     ",
      "child_ranges": [
        "(line 62,col 9)-(line 62,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.dynamic.DynamicPropertyPointer.getPropertyCount()",
      "begin_line": 69,
      "end_line": 71,
      "comment": "\n     * Number of the DP object\u0027s properties.\n     * @return int\n     ",
      "child_ranges": [
        "(line 70,col 9)-(line 70,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.dynamic.DynamicPropertyPointer.getPropertyNames()",
      "begin_line": 77,
      "end_line": 97,
      "comment": "\n     * Names of all properties, sorted alphabetically.\n     * @return String[]\n     ",
      "child_ranges": [
        "(line 78,col 9)-(line 95,col 9)",
        "(line 96,col 9)-(line 96,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.dynamic.DynamicPropertyPointer.getPropertyName()",
      "begin_line": 104,
      "end_line": 110,
      "comment": "\n     * Returns the name of the currently selected property or \"*\"\n     * if none has been selected.\n     * @return String\n     ",
      "child_ranges": [
        "(line 105,col 9)-(line 108,col 9)",
        "(line 109,col 9)-(line 109,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.dynamic.DynamicPropertyPointer.setPropertyName(java.lang.String)",
      "begin_line": 120,
      "end_line": 127,
      "comment": "\n     * Select a property by name.  If the supplied name is\n     * not one of the object\u0027s existing properties, it implicitly\n     * adds this name to the object\u0027s property name list. It does not\n     * set the property value though. In order to set the property\n     * value, call setValue().\n     * @param propertyName to set\n     ",
      "child_ranges": [
        "(line 121,col 9)-(line 121,col 47)",
        "(line 122,col 9)-(line 122,col 33)",
        "(line 123,col 9)-(line 123,col 44)",
        "(line 124,col 9)-(line 126,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.dynamic.DynamicPropertyPointer.getPropertyIndex()",
      "begin_line": 134,
      "end_line": 145,
      "comment": "\n     * Index of the currently selected property in the list of all\n     * properties sorted alphabetically.\n     * @return int\n     ",
      "child_ranges": [
        "(line 135,col 9)-(line 143,col 9)",
        "(line 144,col 9)-(line 144,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.dynamic.DynamicPropertyPointer.setPropertyIndex(int)",
      "begin_line": 152,
      "end_line": 157,
      "comment": "\n     * Index a property by its index in the list of all\n     * properties sorted alphabetically.\n     * @param index to set\n     ",
      "child_ranges": [
        "(line 153,col 9)-(line 156,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.dynamic.DynamicPropertyPointer.getBaseValue()",
      "begin_line": 164,
      "end_line": 166,
      "comment": "\n     * Returns the value of the property, not an element of the collection\n     * represented by the property, if any.\n     * @return Object\n     ",
      "child_ranges": [
        "(line 165,col 9)-(line 165,col 65)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.dynamic.DynamicPropertyPointer.getImmediateNode()",
      "begin_line": 175,
      "end_line": 188,
      "comment": "\n     * If index \u003d\u003d WHOLE_COLLECTION, the value of the property, otherwise\n     * the value of the index\u0027th element of the collection represented by the\n     * property. If the property is not a collection, index should be zero\n     * and the value will be the property itself.\n     * @return Object\n     ",
      "child_ranges": [
        "(line 176,col 9)-(line 176,col 21)",
        "(line 177,col 9)-(line 186,col 9)",
        "(line 187,col 9)-(line 187,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.dynamic.DynamicPropertyPointer.isActualProperty()",
      "begin_line": 195,
      "end_line": 197,
      "comment": "\n     * A dynamic property is always considered actual - all keys are apparently\n     * existing with possibly the value of null.\n     * @return boolean\n     ",
      "child_ranges": [
        "(line 196,col 9)-(line 196,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.dynamic.DynamicPropertyPointer.setValue(java.lang.Object)",
      "begin_line": 205,
      "end_line": 215,
      "comment": "\n     * If index \u003d\u003d WHOLE_COLLECTION, change the value of the property, otherwise\n     * change the value of the index\u0027th element of the collection\n     * represented by the property.\n     * @param value to set\n     ",
      "child_ranges": [
        "(line 206,col 9)-(line 214,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.dynamic.DynamicPropertyPointer.createPath(org.apache.commons.jxpath.JXPathContext)",
      "begin_line": 217,
      "end_line": 249,
      "comment": "",
      "child_ranges": [
        "(line 219,col 9)-(line 219,col 43)",
        "(line 220,col 9)-(line 234,col 9)",
        "(line 236,col 9)-(line 246,col 9)",
        "(line 248,col 9)-(line 248,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.dynamic.DynamicPropertyPointer.createPath(org.apache.commons.jxpath.JXPathContext, java.lang.Object)",
      "begin_line": 251,
      "end_line": 260,
      "comment": "",
      "child_ranges": [
        "(line 252,col 9)-(line 258,col 9)",
        "(line 259,col 9)-(line 259,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.dynamic.DynamicPropertyPointer.remove()",
      "begin_line": 262,
      "end_line": 273,
      "comment": "",
      "child_ranges": [
        "(line 263,col 9)-(line 272,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.dynamic.DynamicPropertyPointer.removeKey()",
      "begin_line": 278,
      "end_line": 286,
      "comment": "\n     * Remove the current property.\n     ",
      "child_ranges": [
        "(line 279,col 9)-(line 279,col 32)",
        "(line 280,col 9)-(line 285,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.dynamic.DynamicPropertyPointer.asPath()",
      "begin_line": 288,
      "end_line": 304,
      "comment": "",
      "child_ranges": [
        "(line 289,col 9)-(line 289,col 49)",
        "(line 290,col 9)-(line 290,col 60)",
        "(line 291,col 9)-(line 296,col 9)",
        "(line 297,col 9)-(line 297,col 34)",
        "(line 298,col 9)-(line 298,col 49)",
        "(line 299,col 9)-(line 299,col 28)",
        "(line 300,col 9)-(line 302,col 9)",
        "(line 303,col 9)-(line 303,col 33)"
      ]
    }
  ]
}