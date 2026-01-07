{
  "filepath": "/tmp/JxPath-21b/src/java/org/apache/commons/jxpath/ri/model/dynabeans/DynaBeanPropertyPointer.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "DynaBeanPropertyPointer",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.jxpath.ri.model.beans.PropertyPointer"
      ],
      "begin_line": 38,
      "end_line": 282,
      "comment": "\n * Pointer pointing to a property of a {@link DynaBean}. If the target DynaBean is\n * Serializable, so should this instance be.\n *\n * @author Dmitri Plotnikov\n * @version $Revision$ $Date$\n "
    },
    {
      "type": "field",
      "varNames": [
        "CLASS"
      ],
      "begin_line": 39,
      "end_line": 39,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "dynaBean"
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
        "serialVersionUID"
      ],
      "begin_line": 45,
      "end_line": 45,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPropertyPointer.DynaBeanPropertyPointer(org.apache.commons.jxpath.ri.model.NodePointer, org.apache.commons.beanutils.DynaBean)",
      "begin_line": 52,
      "end_line": 55,
      "comment": "\n     * Create a new DynaBeanPropertyPointer.\n     * @param parent pointer\n     * @param dynaBean pointed\n     ",
      "child_ranges": [
        "(line 53,col 9)-(line 53,col 22)",
        "(line 54,col 9)-(line 54,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPropertyPointer.getBaseValue()",
      "begin_line": 57,
      "end_line": 59,
      "comment": "",
      "child_ranges": [
        "(line 58,col 9)-(line 58,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPropertyPointer.isContainer()",
      "begin_line": 65,
      "end_line": 67,
      "comment": "\n     * This type of node is auxiliary.\n     * @return true\n     ",
      "child_ranges": [
        "(line 66,col 9)-(line 66,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPropertyPointer.getPropertyCount()",
      "begin_line": 69,
      "end_line": 71,
      "comment": "",
      "child_ranges": [
        "(line 70,col 9)-(line 70,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPropertyPointer.getPropertyNames()",
      "begin_line": 73,
      "end_line": 89,
      "comment": "",
      "child_ranges": [
        "(line 75,col 9)-(line 87,col 9)",
        "(line 88,col 9)-(line 88,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPropertyPointer.getPropertyName()",
      "begin_line": 96,
      "end_line": 102,
      "comment": "\n     * Returns the name of the currently selected property or \"*\"\n     * if none has been selected.\n     * @return String\n     ",
      "child_ranges": [
        "(line 97,col 9)-(line 100,col 9)",
        "(line 101,col 9)-(line 101,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPropertyPointer.setPropertyName(java.lang.String)",
      "begin_line": 108,
      "end_line": 111,
      "comment": "\n     * Select a property by name.\n     * @param propertyName to select\n     ",
      "child_ranges": [
        "(line 109,col 9)-(line 109,col 47)",
        "(line 110,col 9)-(line 110,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPropertyPointer.getPropertyIndex()",
      "begin_line": 118,
      "end_line": 130,
      "comment": "\n     * Index of the currently selected property in the list of all\n     * properties sorted alphabetically.\n     * @return int\n     ",
      "child_ranges": [
        "(line 119,col 9)-(line 128,col 9)",
        "(line 129,col 9)-(line 129,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPropertyPointer.setPropertyIndex(int)",
      "begin_line": 137,
      "end_line": 142,
      "comment": "\n     * Index a property by its index in the list of all\n     * properties sorted alphabetically.\n     * @param index to set\n     ",
      "child_ranges": [
        "(line 138,col 9)-(line 141,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPropertyPointer.getImmediateNode()",
      "begin_line": 151,
      "end_line": 187,
      "comment": "\n     * If index \u003d\u003d WHOLE_COLLECTION, the value of the property, otherwise\n     * the value of the index\u0027th element of the collection represented by the\n     * property. If the property is not a collection, index should be zero\n     * and the value will be the property itself.\n     * @return Object\n     ",
      "child_ranges": [
        "(line 152,col 9)-(line 152,col 40)",
        "(line 153,col 9)-(line 155,col 9)",
        "(line 157,col 9)-(line 157,col 21)",
        "(line 158,col 9)-(line 185,col 9)",
        "(line 186,col 9)-(line 186,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPropertyPointer.isActualProperty()",
      "begin_line": 193,
      "end_line": 196,
      "comment": "\n     * Returns true if the bean has the currently selected property.\n     * @return boolean\n     ",
      "child_ranges": [
        "(line 194,col 9)-(line 194,col 54)",
        "(line 195,col 9)-(line 195,col 68)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPropertyPointer.isIndexedProperty()",
      "begin_line": 202,
      "end_line": 206,
      "comment": "\n     * Learn whether the property referenced is an indexed property.\n     * @return boolean\n     ",
      "child_ranges": [
        "(line 203,col 9)-(line 203,col 54)",
        "(line 204,col 9)-(line 204,col 64)",
        "(line 205,col 9)-(line 205,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPropertyPointer.setValue(java.lang.Object)",
      "begin_line": 214,
      "end_line": 216,
      "comment": "\n     * If index \u003d\u003d WHOLE_COLLECTION, change the value of the property, otherwise\n     * change the value of the index\u0027th element of the collection\n     * represented by the property.\n     * @param value to set\n     ",
      "child_ranges": [
        "(line 215,col 9)-(line 215,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPropertyPointer.remove()",
      "begin_line": 218,
      "end_line": 232,
      "comment": "",
      "child_ranges": [
        "(line 219,col 9)-(line 231,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPropertyPointer.setValue(int, java.lang.Object)",
      "begin_line": 239,
      "end_line": 250,
      "comment": "\n     * Set an indexed value.\n     * @param index to change\n     * @param value to set\n     ",
      "child_ranges": [
        "(line 240,col 9)-(line 249,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPropertyPointer.convert(java.lang.Object, boolean)",
      "begin_line": 259,
      "end_line": 281,
      "comment": "\n     * Convert a value to the appropriate property type.\n     * @param value to convert\n     * @param element whether this should be a collection element.\n     * @return conversion result\n     ",
      "child_ranges": [
        "(line 260,col 9)-(line 260,col 66)",
        "(line 261,col 9)-(line 261,col 77)",
        "(line 262,col 9)-(line 262,col 40)",
        "(line 263,col 9)-(line 270,col 9)",
        "(line 272,col 9)-(line 280,col 9)"
      ]
    }
  ]
}