{
  "filepath": "/tmp/JxPath-17b/src/java/org/apache/commons/jxpath/util/ValueUtils.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "ValueUtils",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 43,
      "end_line": 624,
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
      "begin_line": 50,
      "end_line": 62,
      "comment": "\n     * Returns true if the object is an array or a Collection\n     ",
      "child_ranges": [
        "(line 51,col 9)-(line 53,col 9)",
        "(line 54,col 9)-(line 54,col 32)",
        "(line 55,col 9)-(line 57,col 9)",
        "(line 58,col 9)-(line 60,col 9)",
        "(line 61,col 9)-(line 61,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.util.ValueUtils.getCollectionHint(java.lang.Class)",
      "begin_line": 69,
      "end_line": 91,
      "comment": "\n     * Returns 1 if the type is a collection,\n     * -1 if it is definitely not\n     * and 0 if it may be a collection in some cases.\n     ",
      "child_ranges": [
        "(line 70,col 9)-(line 72,col 9)",
        "(line 74,col 9)-(line 76,col 9)",
        "(line 78,col 9)-(line 80,col 9)",
        "(line 82,col 9)-(line 84,col 9)",
        "(line 86,col 9)-(line 88,col 9)",
        "(line 90,col 9)-(line 90,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.util.ValueUtils.getIndexedPropertyLength(java.lang.Object, java.beans.IndexedPropertyDescriptor)",
      "begin_line": 101,
      "end_line": 127,
      "comment": "\n     * If there is a regular non-indexed read method for this property,\n     * uses this method to obtain the collection and then returns its\n     * length.\n     * Otherwise, attempts to guess the length of the collection by\n     * calling the indexed get method repeatedly.  The method is supposed\n     * to throw an exception if the index is out of bounds.\n     ",
      "child_ranges": [
        "(line 105,col 9)-(line 107,col 9)",
        "(line 109,col 9)-(line 109,col 54)",
        "(line 110,col 9)-(line 113,col 9)",
        "(line 115,col 9)-(line 122,col 9)",
        "(line 124,col 9)-(line 126,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.util.ValueUtils.getLength(java.lang.Object)",
      "begin_line": 133,
      "end_line": 145,
      "comment": "\n     * Returns the length of the supplied collection. If the supplied object\n     * is not a collection, returns 1. If collection is null, returns 0.\n     ",
      "child_ranges": [
        "(line 134,col 9)-(line 136,col 9)",
        "(line 137,col 9)-(line 137,col 42)",
        "(line 138,col 9)-(line 140,col 9)",
        "(line 141,col 9)-(line 143,col 9)",
        "(line 144,col 9)-(line 144,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.util.ValueUtils.iterate(java.lang.Object)",
      "begin_line": 152,
      "end_line": 171,
      "comment": "\n     * Returns an iterator for the supplied collection. If the argument\n     * is null, returns an empty iterator. If the argument is not\n     * a collection, returns an iterator that produces just that one object.\n     ",
      "child_ranges": [
        "(line 153,col 9)-(line 155,col 9)",
        "(line 156,col 9)-(line 166,col 9)",
        "(line 167,col 9)-(line 169,col 9)",
        "(line 170,col 9)-(line 170,col 64)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.util.ValueUtils.expandCollection(java.lang.Object, int)",
      "begin_line": 177,
      "end_line": 205,
      "comment": "\n     * Grows the collection if necessary to the specified size. Returns\n     * the new, expanded collection.\n     ",
      "child_ranges": [
        "(line 178,col 9)-(line 180,col 9)",
        "(line 181,col 9)-(line 193,col 9)",
        "(line 194,col 9)-(line 199,col 9)",
        "(line 200,col 9)-(line 204,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.util.ValueUtils.remove(java.lang.Object, int)",
      "begin_line": 210,
      "end_line": 261,
      "comment": "\n     * Returns the index\u0027th element from the supplied collection.\n     ",
      "child_ranges": [
        "(line 211,col 9)-(line 211,col 42)",
        "(line 212,col 9)-(line 214,col 9)",
        "(line 215,col 9)-(line 233,col 9)",
        "(line 234,col 9)-(line 240,col 9)",
        "(line 241,col 9)-(line 254,col 9)",
        "(line 255,col 9)-(line 260,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.util.ValueUtils.getValue(java.lang.Object, int)",
      "begin_line": 266,
      "end_line": 297,
      "comment": "\n     * Returns the index\u0027th element of the supplied collection.\n     ",
      "child_ranges": [
        "(line 267,col 9)-(line 267,col 42)",
        "(line 268,col 9)-(line 268,col 34)",
        "(line 269,col 9)-(line 295,col 9)",
        "(line 296,col 9)-(line 296,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.util.ValueUtils.setValue(java.lang.Object, int, java.lang.Object)",
      "begin_line": 303,
      "end_line": 321,
      "comment": "\n     * Modifies the index\u0027th element of the supplied collection.\n     * Converts the value to the required type if necessary.\n     ",
      "child_ranges": [
        "(line 304,col 9)-(line 304,col 42)",
        "(line 305,col 9)-(line 320,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.util.ValueUtils.getValue(java.lang.Object, java.beans.PropertyDescriptor)",
      "begin_line": 327,
      "end_line": 349,
      "comment": "\n     * Returns the value of the bean\u0027s property represented by\n     * the supplied property descriptor.\n     ",
      "child_ranges": [
        "(line 331,col 9)-(line 331,col 21)",
        "(line 332,col 9)-(line 347,col 9)",
        "(line 348,col 9)-(line 348,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.util.ValueUtils.setValue(java.lang.Object, java.beans.PropertyDescriptor, java.lang.Object)",
      "begin_line": 355,
      "end_line": 377,
      "comment": "\n     * Modifies the value of the bean\u0027s property represented by\n     * the supplied property descriptor.\n     ",
      "child_ranges": [
        "(line 360,col 9)-(line 376,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.util.ValueUtils.convert(java.lang.Object, java.lang.Class)",
      "begin_line": 379,
      "end_line": 391,
      "comment": "",
      "child_ranges": [
        "(line 380,col 9)-(line 390,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.util.ValueUtils.getValue(java.lang.Object, java.beans.PropertyDescriptor, int)",
      "begin_line": 397,
      "end_line": 432,
      "comment": "\n     * Returns the index\u0027th element of the bean\u0027s property represented by\n     * the supplied property descriptor.\n     ",
      "child_ranges": [
        "(line 402,col 9)-(line 427,col 9)",
        "(line 431,col 9)-(line 431,col 67)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.util.ValueUtils.setValue(java.lang.Object, java.beans.PropertyDescriptor, int, java.lang.Object)",
      "begin_line": 439,
      "end_line": 479,
      "comment": "\n     * Modifies the index\u0027th element of the bean\u0027s property represented by\n     * the supplied property descriptor. Converts the value to the required\n     * type if necessary.\n     ",
      "child_ranges": [
        "(line 445,col 9)-(line 466,col 9)",
        "(line 468,col 9)-(line 468,col 63)",
        "(line 469,col 9)-(line 478,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.util.ValueUtils.getValue(java.lang.Object)",
      "begin_line": 485,
      "end_line": 490,
      "comment": "\n     * If the parameter is a container, opens the container and\n     * return the contents.  The method is recursive.\n     ",
      "child_ranges": [
        "(line 486,col 9)-(line 488,col 9)",
        "(line 489,col 9)-(line 489,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.util.ValueUtils.getDynamicPropertyHandler(java.lang.Class)",
      "begin_line": 496,
      "end_line": 513,
      "comment": "\n     * Returns a shared instance of the dynamic property handler class\n     * returned by \u003ccode\u003egetDynamicPropertyHandlerClass()\u003c/code\u003e.\n     ",
      "child_ranges": [
        "(line 498,col 9)-(line 499,col 74)",
        "(line 500,col 9)-(line 511,col 9)",
        "(line 512,col 9)-(line 512,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.util.ValueUtils.getAccessibleMethod(java.lang.reflect.Method)",
      "begin_line": 529,
      "end_line": 568,
      "comment": "\n     * Return an accessible method (that is, one that can be invoked via\n     * reflection) that implements the specified Method.  If no such method\n     * can be found, return \u003ccode\u003enull\u003c/code\u003e.\n     *\n     * @param method The method that we wish to call\n     ",
      "child_ranges": [
        "(line 532,col 9)-(line 534,col 9)",
        "(line 537,col 9)-(line 539,col 9)",
        "(line 542,col 9)-(line 542,col 49)",
        "(line 543,col 9)-(line 545,col 9)",
        "(line 547,col 9)-(line 547,col 39)",
        "(line 548,col 9)-(line 548,col 60)",
        "(line 549,col 9)-(line 566,col 9)",
        "(line 567,col 9)-(line 567,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.util.ValueUtils.getAccessibleMethodFromInterfaceNest(java.lang.Class, java.lang.String, java.lang.Class[])",
      "begin_line": 581,
      "end_line": 623,
      "comment": "\n     * Return an accessible method (that is, one that can be invoked via\n     * reflection) that implements the specified method, by scanning through\n     * all implemented interfaces and subinterfaces.  If no such Method\n     * can be found, return \u003ccode\u003enull\u003c/code\u003e.\n     *\n     * @param clazz Parent class for the interfaces to be checked\n     * @param methodName Method name of the method we wish to call\n     * @param parameterTypes The parameter type signatures\n     ",
      "child_ranges": [
        "(line 587,col 9)-(line 587,col 29)",
        "(line 590,col 9)-(line 590,col 51)",
        "(line 591,col 9)-(line 619,col 9)",
        "(line 622,col 9)-(line 622,col 24)"
      ]
    }
  ]
}