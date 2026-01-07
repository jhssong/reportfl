{
  "filepath": "/tmp/JxPath-11b/src/java/org/apache/commons/jxpath/ri/model/dynabeans/DynaBeanPropertyPointer.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "DynaBeanPropertyPointer",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.jxpath.ri.model.beans.PropertyPointer"
      ],
      "begin_line": 36,
      "end_line": 259,
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
      "end_line": 100,
      "comment": "\n     * Returns the name of the currently selected property or \"*\"\n     * if none has been selected.\n     ",
      "child_ranges": [
        "(line 95,col 9)-(line 98,col 9)",
        "(line 99,col 9)-(line 99,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPropertyPointer.setPropertyName(java.lang.String)",
      "begin_line": 105,
      "end_line": 108,
      "comment": "\n     * Select a property by name.\n     ",
      "child_ranges": [
        "(line 106,col 9)-(line 106,col 47)",
        "(line 107,col 9)-(line 107,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPropertyPointer.getPropertyIndex()",
      "begin_line": 114,
      "end_line": 126,
      "comment": "\n     * Index of the currently selected property in the list of all\n     * properties sorted alphabetically.\n     ",
      "child_ranges": [
        "(line 115,col 9)-(line 124,col 9)",
        "(line 125,col 9)-(line 125,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPropertyPointer.setPropertyIndex(int)",
      "begin_line": 132,
      "end_line": 137,
      "comment": "\n     * Index a property by its index in the list of all\n     * properties sorted alphabetically.\n     ",
      "child_ranges": [
        "(line 133,col 9)-(line 136,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPropertyPointer.getImmediateNode()",
      "begin_line": 145,
      "end_line": 181,
      "comment": "\n     * If index \u003d\u003d WHOLE_COLLECTION, the value of the property, otherwise\n     * the value of the index\u0027th element of the collection represented by the\n     * property. If the property is not a collection, index should be zero\n     * and the value will be the property itself.\n     ",
      "child_ranges": [
        "(line 146,col 9)-(line 146,col 40)",
        "(line 147,col 9)-(line 149,col 9)",
        "(line 151,col 9)-(line 151,col 21)",
        "(line 152,col 9)-(line 179,col 9)",
        "(line 180,col 9)-(line 180,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPropertyPointer.isActualProperty()",
      "begin_line": 186,
      "end_line": 189,
      "comment": "\n     * Returns true if the bean has the currently selected property\n     ",
      "child_ranges": [
        "(line 187,col 9)-(line 187,col 54)",
        "(line 188,col 9)-(line 188,col 68)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPropertyPointer.isIndexedProperty()",
      "begin_line": 191,
      "end_line": 195,
      "comment": "",
      "child_ranges": [
        "(line 192,col 9)-(line 192,col 54)",
        "(line 193,col 9)-(line 193,col 64)",
        "(line 194,col 9)-(line 194,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPropertyPointer.setValue(java.lang.Object)",
      "begin_line": 202,
      "end_line": 204,
      "comment": "\n     * If index \u003d\u003d WHOLE_COLLECTION, change the value of the property, otherwise\n     * change the value of the index\u0027th element of the collection\n     * represented by the property.\n     ",
      "child_ranges": [
        "(line 203,col 9)-(line 203,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPropertyPointer.remove()",
      "begin_line": 206,
      "end_line": 220,
      "comment": "",
      "child_ranges": [
        "(line 207,col 9)-(line 219,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPropertyPointer.setValue(int, java.lang.Object)",
      "begin_line": 222,
      "end_line": 233,
      "comment": "",
      "child_ranges": [
        "(line 223,col 9)-(line 232,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPropertyPointer.convert(java.lang.Object, boolean)",
      "begin_line": 236,
      "end_line": 258,
      "comment": "",
      "child_ranges": [
        "(line 237,col 9)-(line 237,col 66)",
        "(line 238,col 9)-(line 238,col 77)",
        "(line 239,col 9)-(line 239,col 40)",
        "(line 240,col 9)-(line 247,col 9)",
        "(line 249,col 9)-(line 257,col 9)"
      ]
    }
  ]
}