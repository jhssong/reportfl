{
  "filepath": "/tmp/JxPath-18b/src/java/org/apache/commons/jxpath/ri/model/beans/BeanPropertyPointer.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "BeanPropertyPointer",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.jxpath.ri.model.beans.PropertyPointer"
      ],
      "begin_line": 34,
      "end_line": 326,
      "comment": "\n * Pointer pointing to a property of a JavaBean.\n *\n * @author Dmitri Plotnikov\n * @version $Revision$ $Date$\n "
    },
    {
      "type": "field",
      "varNames": [
        "propertyName"
      ],
      "begin_line": 35,
      "end_line": 35,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "beanInfo"
      ],
      "begin_line": 36,
      "end_line": 36,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "propertyDescriptors"
      ],
      "begin_line": 37,
      "end_line": 37,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "propertyDescriptor"
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
      "type": "field",
      "varNames": [
        "UNINITIALIZED"
      ],
      "begin_line": 40,
      "end_line": 40,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "baseValue"
      ],
      "begin_line": 41,
      "end_line": 41,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "value"
      ],
      "begin_line": 42,
      "end_line": 42,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.jxpath.ri.model.beans.BeanPropertyPointer.BeanPropertyPointer(org.apache.commons.jxpath.ri.model.NodePointer, org.apache.commons.jxpath.JXPathBeanInfo)",
      "begin_line": 49,
      "end_line": 52,
      "comment": "\n     * Create a new BeanPropertyPointer.\n     * @param parent parent pointer\n     * @param beanInfo describes the target property/ies.\n     ",
      "child_ranges": [
        "(line 50,col 9)-(line 50,col 22)",
        "(line 51,col 9)-(line 51,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.beans.BeanPropertyPointer.isContainer()",
      "begin_line": 58,
      "end_line": 60,
      "comment": "\n     * This type of node is auxiliary.\n     * @return true\n     ",
      "child_ranges": [
        "(line 59,col 9)-(line 59,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.beans.BeanPropertyPointer.getPropertyCount()",
      "begin_line": 65,
      "end_line": 70,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 66,col 9)-(line 68,col 9)",
        "(line 69,col 9)-(line 69,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.beans.BeanPropertyPointer.getPropertyNames()",
      "begin_line": 76,
      "end_line": 85,
      "comment": "\n     * Get the names of all properties, sorted alphabetically\n     * @return String[]\n     ",
      "child_ranges": [
        "(line 77,col 9)-(line 83,col 9)",
        "(line 84,col 9)-(line 84,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.beans.BeanPropertyPointer.setPropertyName(java.lang.String)",
      "begin_line": 91,
      "end_line": 94,
      "comment": "\n     * Select a property by name.\n     * @param propertyName String name\n     ",
      "child_ranges": [
        "(line 92,col 9)-(line 92,col 47)",
        "(line 93,col 9)-(line 93,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.beans.BeanPropertyPointer.setPropertyIndex(int)",
      "begin_line": 100,
      "end_line": 108,
      "comment": "\n     * Selects a property by its offset in the alphabetically sorted list.\n     * @param index property index\n     ",
      "child_ranges": [
        "(line 101,col 9)-(line 107,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.beans.BeanPropertyPointer.getBaseValue()",
      "begin_line": 114,
      "end_line": 123,
      "comment": "\n     * Get the value of the currently selected property.\n     * @return Object value\n     ",
      "child_ranges": [
        "(line 115,col 9)-(line 121,col 9)",
        "(line 122,col 9)-(line 122,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.beans.BeanPropertyPointer.setIndex(int)",
      "begin_line": 128,
      "end_line": 139,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 129,col 9)-(line 138,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.beans.BeanPropertyPointer.getImmediateNode()",
      "begin_line": 148,
      "end_line": 164,
      "comment": "\n     * If index \u003d\u003d WHOLE_COLLECTION, the value of the property, otherwise\n     * the value of the index\u0027th element of the collection represented by the\n     * property. If the property is not a collection, index should be zero\n     * and the value will be the property itself.\n     * @return Object\n     ",
      "child_ranges": [
        "(line 149,col 9)-(line 162,col 9)",
        "(line 163,col 9)-(line 163,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.beans.BeanPropertyPointer.isActualProperty()",
      "begin_line": 169,
      "end_line": 171,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 170,col 9)-(line 170,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.beans.BeanPropertyPointer.isCollection()",
      "begin_line": 176,
      "end_line": 196,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 177,col 9)-(line 177,col 56)",
        "(line 178,col 9)-(line 180,col 9)",
        "(line 182,col 9)-(line 184,col 9)",
        "(line 186,col 9)-(line 186,col 70)",
        "(line 187,col 9)-(line 189,col 9)",
        "(line 190,col 9)-(line 192,col 9)",
        "(line 194,col 9)-(line 194,col 38)",
        "(line 195,col 9)-(line 195,col 63)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.beans.BeanPropertyPointer.getLength()",
      "begin_line": 203,
      "end_line": 220,
      "comment": "\n     * If the property contains a collection, then the length of that\n     * collection, otherwise - 1.\n     * @return int length\n     ",
      "child_ranges": [
        "(line 204,col 9)-(line 204,col 56)",
        "(line 205,col 9)-(line 207,col 9)",
        "(line 209,col 9)-(line 213,col 9)",
        "(line 215,col 9)-(line 215,col 70)",
        "(line 216,col 9)-(line 218,col 9)",
        "(line 219,col 9)-(line 219,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.beans.BeanPropertyPointer.setValue(java.lang.Object)",
      "begin_line": 228,
      "end_line": 242,
      "comment": "\n     * If index \u003d\u003d WHOLE_COLLECTION, change the value of the property, otherwise\n     * change the value of the index\u0027th element of the collection\n     * represented by the property.\n     * @param value value to set\n     ",
      "child_ranges": [
        "(line 229,col 9)-(line 229,col 56)",
        "(line 230,col 9)-(line 233,col 9)",
        "(line 235,col 9)-(line 240,col 9)",
        "(line 241,col 9)-(line 241,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.beans.BeanPropertyPointer.createPath(org.apache.commons.jxpath.JXPathContext)",
      "begin_line": 247,
      "end_line": 254,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 248,col 9)-(line 252,col 9)",
        "(line 253,col 9)-(line 253,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.beans.BeanPropertyPointer.remove()",
      "begin_line": 259,
      "end_line": 274,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 260,col 9)-(line 273,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.beans.BeanPropertyPointer.getPropertyName()",
      "begin_line": 280,
      "end_line": 288,
      "comment": "\n     * Get the name of the currently selected property.\n     * @return String property name\n     ",
      "child_ranges": [
        "(line 281,col 9)-(line 286,col 9)",
        "(line 287,col 9)-(line 287,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.beans.BeanPropertyPointer.getPropertyDescriptor()",
      "begin_line": 295,
      "end_line": 314,
      "comment": "\n     * Finds the property descriptor corresponding to the current property\n     * index.\n     * @return PropertyDescriptor\n     ",
      "child_ranges": [
        "(line 296,col 9)-(line 312,col 9)",
        "(line 313,col 9)-(line 313,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.beans.BeanPropertyPointer.getPropertyDescriptors()",
      "begin_line": 320,
      "end_line": 325,
      "comment": "\n     * Get all PropertyDescriptors.\n     * @return PropertyDescriptor[]\n     ",
      "child_ranges": [
        "(line 321,col 9)-(line 323,col 9)",
        "(line 324,col 9)-(line 324,col 35)"
      ]
    }
  ]
}