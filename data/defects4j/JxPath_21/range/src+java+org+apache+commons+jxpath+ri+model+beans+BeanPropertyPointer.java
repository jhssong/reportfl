{
  "filepath": "/tmp/JxPath-21b/src/java/org/apache/commons/jxpath/ri/model/beans/BeanPropertyPointer.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "BeanPropertyPointer",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.jxpath.ri.model.beans.PropertyPointer"
      ],
      "begin_line": 34,
      "end_line": 312,
      "comment": "\n * Pointer pointing to a property of a JavaBean.\n *\n * @author Dmitri Plotnikov\n * @version $Revision$ $Date$\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 35,
      "end_line": 35,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "UNINITIALIZED"
      ],
      "begin_line": 37,
      "end_line": 37,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "propertyName"
      ],
      "begin_line": 39,
      "end_line": 39,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "beanInfo"
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
        "propertyDescriptors"
      ],
      "begin_line": 44,
      "end_line": 44,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "propertyDescriptor"
      ],
      "begin_line": 45,
      "end_line": 45,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.jxpath.ri.model.beans.BeanPropertyPointer.BeanPropertyPointer(org.apache.commons.jxpath.ri.model.NodePointer, org.apache.commons.jxpath.JXPathBeanInfo)",
      "begin_line": 52,
      "end_line": 55,
      "comment": "\n     * Create a new BeanPropertyPointer.\n     * @param parent parent pointer\n     * @param beanInfo describes the target property/ies.\n     ",
      "child_ranges": [
        "(line 53,col 9)-(line 53,col 22)",
        "(line 54,col 9)-(line 54,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.beans.BeanPropertyPointer.isContainer()",
      "begin_line": 61,
      "end_line": 63,
      "comment": "\n     * This type of node is auxiliary.\n     * @return true\n     ",
      "child_ranges": [
        "(line 62,col 9)-(line 62,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.beans.BeanPropertyPointer.getPropertyCount()",
      "begin_line": 65,
      "end_line": 70,
      "comment": "",
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
      "begin_line": 125,
      "end_line": 137,
      "comment": "",
      "child_ranges": [
        "(line 126,col 9)-(line 128,col 9)",
        "(line 131,col 9)-(line 136,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.beans.BeanPropertyPointer.getImmediateNode()",
      "begin_line": 146,
      "end_line": 162,
      "comment": "\n     * If index \u003d\u003d WHOLE_COLLECTION, the value of the property, otherwise\n     * the value of the index\u0027th element of the collection represented by the\n     * property. If the property is not a collection, index should be zero\n     * and the value will be the property itself.\n     * @return Object\n     ",
      "child_ranges": [
        "(line 147,col 9)-(line 160,col 9)",
        "(line 161,col 9)-(line 161,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.beans.BeanPropertyPointer.isActualProperty()",
      "begin_line": 164,
      "end_line": 166,
      "comment": "",
      "child_ranges": [
        "(line 165,col 9)-(line 165,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.beans.BeanPropertyPointer.isCollection()",
      "begin_line": 168,
      "end_line": 188,
      "comment": "",
      "child_ranges": [
        "(line 169,col 9)-(line 169,col 56)",
        "(line 170,col 9)-(line 172,col 9)",
        "(line 174,col 9)-(line 176,col 9)",
        "(line 178,col 9)-(line 178,col 70)",
        "(line 179,col 9)-(line 181,col 9)",
        "(line 182,col 9)-(line 184,col 9)",
        "(line 186,col 9)-(line 186,col 38)",
        "(line 187,col 9)-(line 187,col 63)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.beans.BeanPropertyPointer.getLength()",
      "begin_line": 195,
      "end_line": 212,
      "comment": "\n     * If the property contains a collection, then the length of that\n     * collection, otherwise - 1.\n     * @return int length\n     ",
      "child_ranges": [
        "(line 196,col 9)-(line 196,col 56)",
        "(line 197,col 9)-(line 199,col 9)",
        "(line 201,col 9)-(line 205,col 9)",
        "(line 207,col 9)-(line 207,col 70)",
        "(line 208,col 9)-(line 210,col 9)",
        "(line 211,col 9)-(line 211,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.beans.BeanPropertyPointer.setValue(java.lang.Object)",
      "begin_line": 220,
      "end_line": 234,
      "comment": "\n     * If index \u003d\u003d WHOLE_COLLECTION, change the value of the property, otherwise\n     * change the value of the index\u0027th element of the collection\n     * represented by the property.\n     * @param value value to set\n     ",
      "child_ranges": [
        "(line 221,col 9)-(line 221,col 56)",
        "(line 222,col 9)-(line 225,col 9)",
        "(line 227,col 9)-(line 232,col 9)",
        "(line 233,col 9)-(line 233,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.beans.BeanPropertyPointer.createPath(org.apache.commons.jxpath.JXPathContext)",
      "begin_line": 236,
      "end_line": 243,
      "comment": "",
      "child_ranges": [
        "(line 237,col 9)-(line 241,col 9)",
        "(line 242,col 9)-(line 242,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.beans.BeanPropertyPointer.remove()",
      "begin_line": 245,
      "end_line": 260,
      "comment": "",
      "child_ranges": [
        "(line 246,col 9)-(line 259,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.beans.BeanPropertyPointer.getPropertyName()",
      "begin_line": 266,
      "end_line": 274,
      "comment": "\n     * Get the name of the currently selected property.\n     * @return String property name\n     ",
      "child_ranges": [
        "(line 267,col 9)-(line 272,col 9)",
        "(line 273,col 9)-(line 273,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.beans.BeanPropertyPointer.getPropertyDescriptor()",
      "begin_line": 281,
      "end_line": 300,
      "comment": "\n     * Finds the property descriptor corresponding to the current property\n     * index.\n     * @return PropertyDescriptor\n     ",
      "child_ranges": [
        "(line 282,col 9)-(line 298,col 9)",
        "(line 299,col 9)-(line 299,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.beans.BeanPropertyPointer.getPropertyDescriptors()",
      "begin_line": 306,
      "end_line": 311,
      "comment": "\n     * Get all PropertyDescriptors.\n     * @return PropertyDescriptor[]\n     ",
      "child_ranges": [
        "(line 307,col 9)-(line 309,col 9)",
        "(line 310,col 9)-(line 310,col 35)"
      ]
    }
  ]
}