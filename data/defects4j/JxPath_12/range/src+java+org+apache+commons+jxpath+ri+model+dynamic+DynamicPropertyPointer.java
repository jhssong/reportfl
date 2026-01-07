{
  "filepath": "/tmp/JxPath-12b/src/java/org/apache/commons/jxpath/ri/model/dynamic/DynamicPropertyPointer.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "DynamicPropertyPointer",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.jxpath.ri.model.beans.PropertyPointer"
      ],
      "begin_line": 38,
      "end_line": 318,
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
      "end_line": 103,
      "comment": "\n     * Returns the name of the currently selected property or \"*\"\n     * if none has been selected.\n     ",
      "child_ranges": [
        "(line 98,col 9)-(line 101,col 9)",
        "(line 102,col 9)-(line 102,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.dynamic.DynamicPropertyPointer.setPropertyName(java.lang.String)",
      "begin_line": 112,
      "end_line": 119,
      "comment": "\n     * Select a property by name.  If the supplied name is\n     * not one of the object\u0027s existing properties, it implicitly\n     * adds this name to the object\u0027s property name list. It does not\n     * set the property value though. In order to set the property\n     * value, call setValue().\n     ",
      "child_ranges": [
        "(line 113,col 9)-(line 113,col 47)",
        "(line 114,col 9)-(line 114,col 33)",
        "(line 115,col 9)-(line 115,col 44)",
        "(line 116,col 9)-(line 118,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.dynamic.DynamicPropertyPointer.getPropertyIndex()",
      "begin_line": 125,
      "end_line": 136,
      "comment": "\n     * Index of the currently selected property in the list of all\n     * properties sorted alphabetically.\n     ",
      "child_ranges": [
        "(line 126,col 9)-(line 134,col 9)",
        "(line 135,col 9)-(line 135,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.dynamic.DynamicPropertyPointer.setPropertyIndex(int)",
      "begin_line": 142,
      "end_line": 147,
      "comment": "\n     * Index a property by its index in the list of all\n     * properties sorted alphabetically.\n     ",
      "child_ranges": [
        "(line 143,col 9)-(line 146,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.dynamic.DynamicPropertyPointer.getBaseValue()",
      "begin_line": 153,
      "end_line": 155,
      "comment": "\n     * Returns the value of the property, not an element of the collection\n     * represented by the property, if any.\n     ",
      "child_ranges": [
        "(line 154,col 9)-(line 154,col 65)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.dynamic.DynamicPropertyPointer.getImmediateNode()",
      "begin_line": 163,
      "end_line": 176,
      "comment": "\n     * If index \u003d\u003d WHOLE_COLLECTION, the value of the property, otherwise\n     * the value of the index\u0027th element of the collection represented by the\n     * property. If the property is not a collection, index should be zero\n     * and the value will be the property itself.\n     ",
      "child_ranges": [
        "(line 164,col 9)-(line 164,col 21)",
        "(line 165,col 9)-(line 174,col 9)",
        "(line 175,col 9)-(line 175,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.dynamic.DynamicPropertyPointer.isActualProperty()",
      "begin_line": 182,
      "end_line": 184,
      "comment": "\n     * A dynamic property is always considered actual - all keys are apparently\n     * existing with possibly the value of null.\n     ",
      "child_ranges": [
        "(line 183,col 9)-(line 183,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.dynamic.DynamicPropertyPointer.setValue(java.lang.Object)",
      "begin_line": 191,
      "end_line": 201,
      "comment": "\n     * If index \u003d\u003d WHOLE_COLLECTION, change the value of the property, otherwise\n     * change the value of the index\u0027th element of the collection\n     * represented by the property.\n     ",
      "child_ranges": [
        "(line 192,col 9)-(line 200,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.dynamic.DynamicPropertyPointer.createPath(org.apache.commons.jxpath.JXPathContext)",
      "begin_line": 203,
      "end_line": 235,
      "comment": "",
      "child_ranges": [
        "(line 205,col 9)-(line 205,col 43)",
        "(line 206,col 9)-(line 220,col 9)",
        "(line 222,col 9)-(line 232,col 9)",
        "(line 234,col 9)-(line 234,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.dynamic.DynamicPropertyPointer.createPath(org.apache.commons.jxpath.JXPathContext, java.lang.Object)",
      "begin_line": 237,
      "end_line": 246,
      "comment": "",
      "child_ranges": [
        "(line 238,col 9)-(line 244,col 9)",
        "(line 245,col 9)-(line 245,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.dynamic.DynamicPropertyPointer.remove()",
      "begin_line": 248,
      "end_line": 259,
      "comment": "",
      "child_ranges": [
        "(line 249,col 9)-(line 258,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.dynamic.DynamicPropertyPointer.removeKey()",
      "begin_line": 261,
      "end_line": 269,
      "comment": "",
      "child_ranges": [
        "(line 262,col 9)-(line 262,col 32)",
        "(line 263,col 9)-(line 268,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.dynamic.DynamicPropertyPointer.asPath()",
      "begin_line": 271,
      "end_line": 287,
      "comment": "",
      "child_ranges": [
        "(line 272,col 9)-(line 272,col 49)",
        "(line 273,col 9)-(line 273,col 60)",
        "(line 274,col 9)-(line 279,col 9)",
        "(line 280,col 9)-(line 280,col 34)",
        "(line 281,col 9)-(line 281,col 49)",
        "(line 282,col 9)-(line 282,col 28)",
        "(line 283,col 9)-(line 285,col 9)",
        "(line 286,col 9)-(line 286,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.dynamic.DynamicPropertyPointer.escape(java.lang.String)",
      "begin_line": 289,
      "end_line": 307,
      "comment": "",
      "child_ranges": [
        "(line 290,col 9)-(line 290,col 41)",
        "(line 291,col 9)-(line 297,col 9)",
        "(line 298,col 9)-(line 298,col 37)",
        "(line 299,col 9)-(line 305,col 9)",
        "(line 306,col 9)-(line 306,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.dynamic.DynamicPropertyPointer.getAbstractFactory(org.apache.commons.jxpath.JXPathContext)",
      "begin_line": 309,
      "end_line": 317,
      "comment": "",
      "child_ranges": [
        "(line 310,col 9)-(line 310,col 55)",
        "(line 311,col 9)-(line 315,col 9)",
        "(line 316,col 9)-(line 316,col 23)"
      ]
    }
  ]
}