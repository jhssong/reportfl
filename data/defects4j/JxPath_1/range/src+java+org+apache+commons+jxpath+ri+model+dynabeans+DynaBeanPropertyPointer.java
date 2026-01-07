{
  "filepath": "/tmp/JxPath-1b/src/java/org/apache/commons/jxpath/ri/model/dynabeans/DynaBeanPropertyPointer.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "DynaBeanPropertyPointer",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.jxpath.ri.model.beans.PropertyPointer"
      ],
      "begin_line": 36,
      "end_line": 264,
      "comment": "\n * Pointer pointing to a property of a DynaBean.\n *\n * @author Dmitri Plotnikov\n * @version $Revision$ $Date$\n "
    },
    {
      "type": "field",
      "varNames": [
        "dynaBean"
      ],
      "begin_line": 37,
      "end_line": 37,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "name"
      ],
      "begin_line": 38,
      "end_line": 38,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "names"
      ],
      "begin_line": 39,
      "end_line": 39,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPropertyPointer.DynaBeanPropertyPointer(org.apache.commons.jxpath.ri.model.NodePointer, org.apache.commons.beanutils.DynaBean)",
      "begin_line": 41,
      "end_line": 44,
      "comment": "",
      "child_ranges": [
        "(line 42,col 9)-(line 42,col 22)",
        "(line 43,col 9)-(line 43,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPropertyPointer.getBaseValue()",
      "begin_line": 46,
      "end_line": 48,
      "comment": "",
      "child_ranges": [
        "(line 47,col 9)-(line 47,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPropertyPointer.isContainer()",
      "begin_line": 53,
      "end_line": 55,
      "comment": "\n     * This type of node is auxiliary.\n     ",
      "child_ranges": [
        "(line 54,col 9)-(line 54,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPropertyPointer.getPropertyCount()",
      "begin_line": 60,
      "end_line": 62,
      "comment": "\n     * Number of the DP object\u0027s properties.\n     ",
      "child_ranges": [
        "(line 61,col 9)-(line 61,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPropertyPointer.getPropertyNames()",
      "begin_line": 69,
      "end_line": 88,
      "comment": "\n     * Names of all properties, sorted alphabetically\n     *\n     * @todo do something about the sorting\n     ",
      "child_ranges": [
        "(line 70,col 9)-(line 86,col 9)",
        "(line 87,col 9)-(line 87,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPropertyPointer.getPropertyName()",
      "begin_line": 94,
      "end_line": 105,
      "comment": "\n     * Returns the name of the currently selected property or \"*\"\n     * if none has been selected.\n     ",
      "child_ranges": [
        "(line 95,col 9)-(line 103,col 9)",
        "(line 104,col 9)-(line 104,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPropertyPointer.setPropertyName(java.lang.String)",
      "begin_line": 110,
      "end_line": 113,
      "comment": "\n     * Select a property by name.\n     ",
      "child_ranges": [
        "(line 111,col 9)-(line 111,col 47)",
        "(line 112,col 9)-(line 112,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPropertyPointer.getPropertyIndex()",
      "begin_line": 119,
      "end_line": 131,
      "comment": "\n     * Index of the currently selected property in the list of all\n     * properties sorted alphabetically.\n     ",
      "child_ranges": [
        "(line 120,col 9)-(line 129,col 9)",
        "(line 130,col 9)-(line 130,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPropertyPointer.setPropertyIndex(int)",
      "begin_line": 137,
      "end_line": 142,
      "comment": "\n     * Index a property by its index in the list of all\n     * properties sorted alphabetically.\n     ",
      "child_ranges": [
        "(line 138,col 9)-(line 141,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPropertyPointer.getImmediateNode()",
      "begin_line": 150,
      "end_line": 186,
      "comment": "\n     * If index \u003d\u003d WHOLE_COLLECTION, the value of the property, otherwise\n     * the value of the index\u0027th element of the collection represented by the\n     * property. If the property is not a collection, index should be zero\n     * and the value will be the property itself.\n     ",
      "child_ranges": [
        "(line 151,col 9)-(line 151,col 40)",
        "(line 152,col 9)-(line 154,col 9)",
        "(line 156,col 9)-(line 156,col 21)",
        "(line 157,col 9)-(line 184,col 9)",
        "(line 185,col 9)-(line 185,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPropertyPointer.isActualProperty()",
      "begin_line": 191,
      "end_line": 194,
      "comment": "\n     * Returns true if the bean has the currently selected property\n     ",
      "child_ranges": [
        "(line 192,col 9)-(line 192,col 54)",
        "(line 193,col 9)-(line 193,col 68)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPropertyPointer.isIndexedProperty()",
      "begin_line": 196,
      "end_line": 200,
      "comment": "",
      "child_ranges": [
        "(line 197,col 9)-(line 197,col 54)",
        "(line 198,col 9)-(line 198,col 64)",
        "(line 199,col 9)-(line 199,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPropertyPointer.setValue(java.lang.Object)",
      "begin_line": 207,
      "end_line": 209,
      "comment": "\n     * If index \u003d\u003d WHOLE_COLLECTION, change the value of the property, otherwise\n     * change the value of the index\u0027th element of the collection\n     * represented by the property.\n     ",
      "child_ranges": [
        "(line 208,col 9)-(line 208,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPropertyPointer.remove()",
      "begin_line": 211,
      "end_line": 225,
      "comment": "",
      "child_ranges": [
        "(line 212,col 9)-(line 224,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPropertyPointer.setValue(int, java.lang.Object)",
      "begin_line": 227,
      "end_line": 238,
      "comment": "",
      "child_ranges": [
        "(line 228,col 9)-(line 237,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPropertyPointer.convert(java.lang.Object, boolean)",
      "begin_line": 241,
      "end_line": 263,
      "comment": "",
      "child_ranges": [
        "(line 242,col 9)-(line 242,col 66)",
        "(line 243,col 9)-(line 243,col 77)",
        "(line 244,col 9)-(line 244,col 40)",
        "(line 245,col 9)-(line 252,col 9)",
        "(line 254,col 9)-(line 262,col 9)"
      ]
    }
  ]
}