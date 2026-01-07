{
  "filepath": "/tmp/JxPath-2b/src/java/org/apache/commons/jxpath/ri/model/dynamic/DynamicPropertyPointer.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "DynamicPropertyPointer",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.jxpath.ri.model.beans.PropertyPointer"
      ],
      "begin_line": 38,
      "end_line": 323,
      "comment": "\n * Pointer pointing to a property of an object with dynamic properties.\n *\n * @author Dmitri Plotnikov\n * @version $Revision$ $Date$\n "
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
      "type": "field",
      "varNames": [
        "handler"
      ],
      "begin_line": 42,
      "end_line": 42,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "name"
      ],
      "begin_line": 43,
      "end_line": 43,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "names"
      ],
      "begin_line": 44,
      "end_line": 44,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "requiredPropertyName"
      ],
      "begin_line": 45,
      "end_line": 45,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.jxpath.ri.model.dynamic.DynamicPropertyPointer.DynamicPropertyPointer(org.apache.commons.jxpath.ri.model.NodePointer, org.apache.commons.jxpath.DynamicPropertyHandler)",
      "begin_line": 47,
      "end_line": 53,
      "comment": "",
      "child_ranges": [
        "(line 51,col 9)-(line 51,col 22)",
        "(line 52,col 9)-(line 52,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.dynamic.DynamicPropertyPointer.isContainer()",
      "begin_line": 57,
      "end_line": 59,
      "comment": "\n     * This type of node is auxiliary.\n     ",
      "child_ranges": [
        "(line 58,col 9)-(line 58,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.dynamic.DynamicPropertyPointer.getPropertyCount()",
      "begin_line": 64,
      "end_line": 66,
      "comment": "\n     * Number of the DP object\u0027s properties.\n     ",
      "child_ranges": [
        "(line 65,col 9)-(line 65,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.dynamic.DynamicPropertyPointer.getPropertyNames()",
      "begin_line": 71,
      "end_line": 91,
      "comment": "\n     * Names of all properties, sorted alphabetically\n     ",
      "child_ranges": [
        "(line 72,col 9)-(line 89,col 9)",
        "(line 90,col 9)-(line 90,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.dynamic.DynamicPropertyPointer.getPropertyName()",
      "begin_line": 97,
      "end_line": 108,
      "comment": "\n     * Returns the name of the currently selected property or \"*\"\n     * if none has been selected.\n     ",
      "child_ranges": [
        "(line 98,col 9)-(line 106,col 9)",
        "(line 107,col 9)-(line 107,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.dynamic.DynamicPropertyPointer.setPropertyName(java.lang.String)",
      "begin_line": 117,
      "end_line": 124,
      "comment": "\n     * Select a property by name.  If the supplied name is\n     * not one of the object\u0027s existing properties, it implicitly\n     * adds this name to the object\u0027s property name list. It does not\n     * set the property value though. In order to set the property\n     * value, call setValue().\n     ",
      "child_ranges": [
        "(line 118,col 9)-(line 118,col 47)",
        "(line 119,col 9)-(line 119,col 33)",
        "(line 120,col 9)-(line 120,col 44)",
        "(line 121,col 9)-(line 123,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.dynamic.DynamicPropertyPointer.getPropertyIndex()",
      "begin_line": 130,
      "end_line": 141,
      "comment": "\n     * Index of the currently selected property in the list of all\n     * properties sorted alphabetically.\n     ",
      "child_ranges": [
        "(line 131,col 9)-(line 139,col 9)",
        "(line 140,col 9)-(line 140,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.dynamic.DynamicPropertyPointer.setPropertyIndex(int)",
      "begin_line": 147,
      "end_line": 152,
      "comment": "\n     * Index a property by its index in the list of all\n     * properties sorted alphabetically.\n     ",
      "child_ranges": [
        "(line 148,col 9)-(line 151,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.dynamic.DynamicPropertyPointer.getBaseValue()",
      "begin_line": 158,
      "end_line": 160,
      "comment": "\n     * Returns the value of the property, not an element of the collection\n     * represented by the property, if any.\n     ",
      "child_ranges": [
        "(line 159,col 9)-(line 159,col 65)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.dynamic.DynamicPropertyPointer.getImmediateNode()",
      "begin_line": 168,
      "end_line": 181,
      "comment": "\n     * If index \u003d\u003d WHOLE_COLLECTION, the value of the property, otherwise\n     * the value of the index\u0027th element of the collection represented by the\n     * property. If the property is not a collection, index should be zero\n     * and the value will be the property itself.\n     ",
      "child_ranges": [
        "(line 169,col 9)-(line 169,col 21)",
        "(line 170,col 9)-(line 179,col 9)",
        "(line 180,col 9)-(line 180,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.dynamic.DynamicPropertyPointer.isActualProperty()",
      "begin_line": 187,
      "end_line": 189,
      "comment": "\n     * A dynamic property is always considered actual - all keys are apparently\n     * existing with possibly the value of null.\n     ",
      "child_ranges": [
        "(line 188,col 9)-(line 188,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.dynamic.DynamicPropertyPointer.setValue(java.lang.Object)",
      "begin_line": 196,
      "end_line": 206,
      "comment": "\n     * If index \u003d\u003d WHOLE_COLLECTION, change the value of the property, otherwise\n     * change the value of the index\u0027th element of the collection\n     * represented by the property.\n     ",
      "child_ranges": [
        "(line 197,col 9)-(line 205,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.dynamic.DynamicPropertyPointer.createPath(org.apache.commons.jxpath.JXPathContext)",
      "begin_line": 208,
      "end_line": 240,
      "comment": "",
      "child_ranges": [
        "(line 210,col 9)-(line 210,col 43)",
        "(line 211,col 9)-(line 225,col 9)",
        "(line 227,col 9)-(line 237,col 9)",
        "(line 239,col 9)-(line 239,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.dynamic.DynamicPropertyPointer.createPath(org.apache.commons.jxpath.JXPathContext, java.lang.Object)",
      "begin_line": 242,
      "end_line": 251,
      "comment": "",
      "child_ranges": [
        "(line 243,col 9)-(line 249,col 9)",
        "(line 250,col 9)-(line 250,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.dynamic.DynamicPropertyPointer.remove()",
      "begin_line": 253,
      "end_line": 264,
      "comment": "",
      "child_ranges": [
        "(line 254,col 9)-(line 263,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.dynamic.DynamicPropertyPointer.removeKey()",
      "begin_line": 266,
      "end_line": 274,
      "comment": "",
      "child_ranges": [
        "(line 267,col 9)-(line 267,col 32)",
        "(line 268,col 9)-(line 273,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.dynamic.DynamicPropertyPointer.asPath()",
      "begin_line": 276,
      "end_line": 292,
      "comment": "",
      "child_ranges": [
        "(line 277,col 9)-(line 277,col 49)",
        "(line 278,col 9)-(line 278,col 60)",
        "(line 279,col 9)-(line 284,col 9)",
        "(line 285,col 9)-(line 285,col 34)",
        "(line 286,col 9)-(line 286,col 49)",
        "(line 287,col 9)-(line 287,col 28)",
        "(line 288,col 9)-(line 290,col 9)",
        "(line 291,col 9)-(line 291,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.dynamic.DynamicPropertyPointer.escape(java.lang.String)",
      "begin_line": 294,
      "end_line": 312,
      "comment": "",
      "child_ranges": [
        "(line 295,col 9)-(line 295,col 41)",
        "(line 296,col 9)-(line 302,col 9)",
        "(line 303,col 9)-(line 303,col 37)",
        "(line 304,col 9)-(line 310,col 9)",
        "(line 311,col 9)-(line 311,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.dynamic.DynamicPropertyPointer.getAbstractFactory(org.apache.commons.jxpath.JXPathContext)",
      "begin_line": 314,
      "end_line": 322,
      "comment": "",
      "child_ranges": [
        "(line 315,col 9)-(line 315,col 55)",
        "(line 316,col 9)-(line 320,col 9)",
        "(line 321,col 9)-(line 321,col 23)"
      ]
    }
  ]
}