{
  "filepath": "/tmp/JxPath-20b/src/java/org/apache/commons/jxpath/util/ValueUtils.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "ValueUtils",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 43,
      "end_line": 661,
      "comment": "\n * Collection and property access utilities.\n *\n * @author Dmitri Plotnikov\n * @version $Revision$ $Date$\n "
    },
    {
      "type": "field",
      "varNames": [
        "dynamicPropertyHandlerMap"
      ],
      "begin_line": 44,
      "end_line": 44,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "UNKNOWN_LENGTH_MAX_COUNT"
      ],
      "begin_line": 45,
      "end_line": 45,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.util.ValueUtils.isCollection(java.lang.Object)",
      "begin_line": 52,
      "end_line": 64,
      "comment": "\n     * Returns true if the object is an array or a Collection.\n     * @param value to test\n     * @return boolean\n     ",
      "child_ranges": [
        "(line 53,col 9)-(line 53,col 32)",
        "(line 54,col 9)-(line 56,col 9)",
        "(line 57,col 9)-(line 59,col 9)",
        "(line 60,col 9)-(line 62,col 9)",
        "(line 63,col 9)-(line 63,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.util.ValueUtils.getCollectionHint(java.lang.Class)",
      "begin_line": 73,
      "end_line": 95,
      "comment": "\n     * Returns 1 if the type is a collection,\n     * -1 if it is definitely not\n     * and 0 if it may be a collection in some cases.\n     * @param clazz to test\n     * @return int\n     ",
      "child_ranges": [
        "(line 74,col 9)-(line 76,col 9)",
        "(line 78,col 9)-(line 80,col 9)",
        "(line 82,col 9)-(line 84,col 9)",
        "(line 86,col 9)-(line 88,col 9)",
        "(line 90,col 9)-(line 92,col 9)",
        "(line 94,col 9)-(line 94,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.util.ValueUtils.getIndexedPropertyLength(java.lang.Object, java.beans.IndexedPropertyDescriptor)",
      "begin_line": 108,
      "end_line": 132,
      "comment": "\n     * If there is a regular non-indexed read method for this property,\n     * uses this method to obtain the collection and then returns its\n     * length.\n     * Otherwise, attempts to guess the length of the collection by\n     * calling the indexed get method repeatedly.  The method is supposed\n     * to throw an exception if the index is out of bounds.\n     * @param object collection\n     * @param pd IndexedPropertyDescriptor\n     * @return int\n     ",
      "child_ranges": [
        "(line 110,col 9)-(line 112,col 9)",
        "(line 114,col 9)-(line 114,col 54)",
        "(line 115,col 9)-(line 118,col 9)",
        "(line 120,col 9)-(line 127,col 9)",
        "(line 129,col 9)-(line 131,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.util.ValueUtils.getLength(java.lang.Object)",
      "begin_line": 140,
      "end_line": 152,
      "comment": "\n     * Returns the length of the supplied collection. If the supplied object\n     * is not a collection, returns 1. If collection is null, returns 0.\n     * @param collection to check\n     * @return int\n     ",
      "child_ranges": [
        "(line 141,col 9)-(line 143,col 9)",
        "(line 144,col 9)-(line 144,col 42)",
        "(line 145,col 9)-(line 147,col 9)",
        "(line 148,col 9)-(line 150,col 9)",
        "(line 151,col 9)-(line 151,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.util.ValueUtils.iterate(java.lang.Object)",
      "begin_line": 161,
      "end_line": 180,
      "comment": "\n     * Returns an iterator for the supplied collection. If the argument\n     * is null, returns an empty iterator. If the argument is not\n     * a collection, returns an iterator that produces just that one object.\n     * @param collection to iterate\n     * @return Iterator\n     ",
      "child_ranges": [
        "(line 162,col 9)-(line 164,col 9)",
        "(line 165,col 9)-(line 175,col 9)",
        "(line 176,col 9)-(line 178,col 9)",
        "(line 179,col 9)-(line 179,col 64)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.util.ValueUtils.expandCollection(java.lang.Object, int)",
      "begin_line": 189,
      "end_line": 221,
      "comment": "\n     * Grows the collection if necessary to the specified size. Returns\n     * the new, expanded collection.\n     * @param collection to expand\n     * @param size desired size\n     * @return collection or array\n     ",
      "child_ranges": [
        "(line 190,col 9)-(line 192,col 9)",
        "(line 193,col 9)-(line 196,col 9)",
        "(line 197,col 9)-(line 209,col 9)",
        "(line 210,col 9)-(line 215,col 9)",
        "(line 216,col 9)-(line 220,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.util.ValueUtils.remove(java.lang.Object, int)",
      "begin_line": 229,
      "end_line": 283,
      "comment": "\n     * Remove the index\u0027th element from the supplied collection.\n     * @param collection to edit\n     * @param index int\n     * @return the resulting collection\n     ",
      "child_ranges": [
        "(line 230,col 9)-(line 230,col 42)",
        "(line 231,col 9)-(line 233,col 9)",
        "(line 234,col 9)-(line 236,col 9)",
        "(line 237,col 9)-(line 255,col 9)",
        "(line 256,col 9)-(line 262,col 9)",
        "(line 263,col 9)-(line 276,col 9)",
        "(line 277,col 9)-(line 282,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.util.ValueUtils.getValue(java.lang.Object, int)",
      "begin_line": 291,
      "end_line": 322,
      "comment": "\n     * Returns the index\u0027th element of the supplied collection.\n     * @param collection to read\n     * @param index int\n     * @return collection[index]\n     ",
      "child_ranges": [
        "(line 292,col 9)-(line 292,col 42)",
        "(line 293,col 9)-(line 293,col 34)",
        "(line 294,col 9)-(line 320,col 9)",
        "(line 321,col 9)-(line 321,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.util.ValueUtils.setValue(java.lang.Object, int, java.lang.Object)",
      "begin_line": 331,
      "end_line": 349,
      "comment": "\n     * Modifies the index\u0027th element of the supplied collection.\n     * Converts the value to the required type if necessary.\n     * @param collection to edit\n     * @param index to replace\n     * @param value new value\n     ",
      "child_ranges": [
        "(line 332,col 9)-(line 332,col 42)",
        "(line 333,col 9)-(line 348,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.util.ValueUtils.getValue(java.lang.Object, java.beans.PropertyDescriptor)",
      "begin_line": 358,
      "end_line": 378,
      "comment": "\n     * Returns the value of the bean\u0027s property represented by\n     * the supplied property descriptor.\n     * @param bean to read\n     * @param propertyDescriptor indicating what to read\n     * @return Object value\n     ",
      "child_ranges": [
        "(line 360,col 9)-(line 360,col 21)",
        "(line 361,col 9)-(line 376,col 9)",
        "(line 377,col 9)-(line 377,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.util.ValueUtils.setValue(java.lang.Object, java.beans.PropertyDescriptor, java.lang.Object)",
      "begin_line": 387,
      "end_line": 406,
      "comment": "\n     * Modifies the value of the bean\u0027s property represented by\n     * the supplied property descriptor.\n     * @param bean to read\n     * @param propertyDescriptor indicating what to read\n     * @param value to set\n     ",
      "child_ranges": [
        "(line 389,col 9)-(line 405,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.util.ValueUtils.convert(java.lang.Object, java.lang.Class)",
      "begin_line": 414,
      "end_line": 426,
      "comment": "\n     * Convert value to type.\n     * @param value Object\n     * @param type destination\n     * @return conversion result\n     ",
      "child_ranges": [
        "(line 415,col 9)-(line 425,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.util.ValueUtils.getValue(java.lang.Object, java.beans.PropertyDescriptor, int)",
      "begin_line": 436,
      "end_line": 468,
      "comment": "\n     * Returns the index\u0027th element of the bean\u0027s property represented by\n     * the supplied property descriptor.\n     * @param bean to read\n     * @param propertyDescriptor indicating what to read\n     * @param index int\n     * @return Object\n     ",
      "child_ranges": [
        "(line 438,col 9)-(line 463,col 9)",
        "(line 467,col 9)-(line 467,col 67)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.util.ValueUtils.setValue(java.lang.Object, java.beans.PropertyDescriptor, int, java.lang.Object)",
      "begin_line": 479,
      "end_line": 515,
      "comment": "\n     * Modifies the index\u0027th element of the bean\u0027s property represented by\n     * the supplied property descriptor. Converts the value to the required\n     * type if necessary.\n     * @param bean to edit\n     * @param propertyDescriptor indicating what to set\n     * @param index int\n     * @param value to set\n     ",
      "child_ranges": [
        "(line 481,col 9)-(line 502,col 9)",
        "(line 504,col 9)-(line 504,col 63)",
        "(line 505,col 9)-(line 514,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.util.ValueUtils.getValue(java.lang.Object)",
      "begin_line": 523,
      "end_line": 528,
      "comment": "\n     * If the parameter is a container, opens the container and\n     * return the contents.  The method is recursive.\n     * @param object to read\n     * @return Object\n     ",
      "child_ranges": [
        "(line 524,col 9)-(line 526,col 9)",
        "(line 527,col 9)-(line 527,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.util.ValueUtils.getDynamicPropertyHandler(java.lang.Class)",
      "begin_line": 536,
      "end_line": 552,
      "comment": "\n     * Returns a shared instance of the dynamic property handler class\n     * returned by \u003ccode\u003egetDynamicPropertyHandlerClass()\u003c/code\u003e.\n     * @param clazz to handle\n     * @return DynamicPropertyHandler\n     ",
      "child_ranges": [
        "(line 537,col 9)-(line 538,col 74)",
        "(line 539,col 9)-(line 550,col 9)",
        "(line 551,col 9)-(line 551,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.util.ValueUtils.getAccessibleMethod(java.lang.reflect.Method)",
      "begin_line": 569,
      "end_line": 608,
      "comment": "\n     * Return an accessible method (that is, one that can be invoked via\n     * reflection) that implements the specified Method.  If no such method\n     * can be found, return \u003ccode\u003enull\u003c/code\u003e.\n     *\n     * @param method The method that we wish to call\n     * @return Method\n     ",
      "child_ranges": [
        "(line 572,col 9)-(line 574,col 9)",
        "(line 577,col 9)-(line 579,col 9)",
        "(line 582,col 9)-(line 582,col 49)",
        "(line 583,col 9)-(line 585,col 9)",
        "(line 587,col 9)-(line 587,col 39)",
        "(line 588,col 9)-(line 588,col 60)",
        "(line 589,col 9)-(line 606,col 9)",
        "(line 607,col 9)-(line 607,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.util.ValueUtils.getAccessibleMethodFromInterfaceNest(java.lang.Class, java.lang.String, java.lang.Class[])",
      "begin_line": 621,
      "end_line": 660,
      "comment": "\n     * Return an accessible method (that is, one that can be invoked via\n     * reflection) that implements the specified method, by scanning through\n     * all implemented interfaces and subinterfaces.  If no such Method\n     * can be found, return \u003ccode\u003enull\u003c/code\u003e.\n     *\n     * @param clazz Parent class for the interfaces to be checked\n     * @param methodName Method name of the method we wish to call\n     * @param parameterTypes The parameter type signatures\n     * @return Method\n     ",
      "child_ranges": [
        "(line 624,col 9)-(line 624,col 29)",
        "(line 627,col 9)-(line 627,col 51)",
        "(line 628,col 9)-(line 656,col 9)",
        "(line 659,col 9)-(line 659,col 24)"
      ]
    }
  ]
}