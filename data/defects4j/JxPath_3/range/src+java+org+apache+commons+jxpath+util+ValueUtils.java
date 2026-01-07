{
  "filepath": "/tmp/JxPath-3b/src/java/org/apache/commons/jxpath/util/ValueUtils.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "ValueUtils",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 43,
      "end_line": 634,
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
        "(line 55,col 9)-(line 60,col 9)",
        "(line 61,col 9)-(line 61,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.util.ValueUtils.getCollectionHint(java.lang.Class)",
      "begin_line": 69,
      "end_line": 91,
      "comment": "\n     * Returns 1 if the type is a collection, \n     * -1 if it is definitely not\n     * and 0 if it may be a collection in some cases.\n     ",
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
      "comment": "\n     * If there is a regular non-indexed read method for this property,\n     * uses this method to obtain the collection and then returns its\n     * length.\n     * Otherwise, attempts to guess the length of the collection by\n     * calling the indexed get method repeatedly.  The method is supposed\n     * to throw an exception if the index is out of bounds. \n     ",
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
      "end_line": 147,
      "comment": "\n     * Returns the length of the supplied collection. If the supplied object\n     * is not a collection, returns 1. If collection is null, returns 0.\n     ",
      "child_ranges": [
        "(line 134,col 9)-(line 136,col 9)",
        "(line 137,col 9)-(line 137,col 42)",
        "(line 138,col 9)-(line 146,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.util.ValueUtils.iterate(java.lang.Object)",
      "begin_line": 154,
      "end_line": 175,
      "comment": "\n     * Returns an iterator for the supplied collection. If the argument\n     * is null, returns an empty iterator. If the argument is not\n     * a collection, returns an iterator that produces just that one object.\n     ",
      "child_ranges": [
        "(line 155,col 9)-(line 157,col 9)",
        "(line 158,col 9)-(line 174,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.util.ValueUtils.expandCollection(java.lang.Object, int)",
      "begin_line": 181,
      "end_line": 211,
      "comment": "\n     * Grows the collection if necessary to the specified size. Returns\n     * the new, expanded collection.\n     ",
      "child_ranges": [
        "(line 182,col 9)-(line 210,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.util.ValueUtils.remove(java.lang.Object, int)",
      "begin_line": 216,
      "end_line": 269,
      "comment": "\n     * Returns the index\u0027th element from the supplied collection.\n     ",
      "child_ranges": [
        "(line 217,col 9)-(line 217,col 42)",
        "(line 218,col 9)-(line 268,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.util.ValueUtils.getValue(java.lang.Object, int)",
      "begin_line": 274,
      "end_line": 305,
      "comment": "\n     * Returns the index\u0027th element of the supplied collection.\n     ",
      "child_ranges": [
        "(line 275,col 9)-(line 275,col 42)",
        "(line 276,col 9)-(line 276,col 34)",
        "(line 277,col 9)-(line 303,col 9)",
        "(line 304,col 9)-(line 304,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.util.ValueUtils.setValue(java.lang.Object, int, java.lang.Object)",
      "begin_line": 311,
      "end_line": 329,
      "comment": "\n     * Modifies the index\u0027th element of the supplied collection.\n     * Converts the value to the required type if necessary.\n     ",
      "child_ranges": [
        "(line 312,col 9)-(line 312,col 42)",
        "(line 313,col 9)-(line 328,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.util.ValueUtils.getValue(java.lang.Object, java.beans.PropertyDescriptor)",
      "begin_line": 335,
      "end_line": 357,
      "comment": "\n     * Returns the value of the bean\u0027s property represented by\n     * the supplied property descriptor.\n     ",
      "child_ranges": [
        "(line 339,col 9)-(line 339,col 21)",
        "(line 340,col 9)-(line 355,col 9)",
        "(line 356,col 9)-(line 356,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.util.ValueUtils.setValue(java.lang.Object, java.beans.PropertyDescriptor, java.lang.Object)",
      "begin_line": 363,
      "end_line": 385,
      "comment": "\n     * Modifies the value of the bean\u0027s property represented by\n     * the supplied property descriptor.\n     ",
      "child_ranges": [
        "(line 368,col 9)-(line 384,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.util.ValueUtils.convert(java.lang.Object, java.lang.Class)",
      "begin_line": 387,
      "end_line": 399,
      "comment": "",
      "child_ranges": [
        "(line 388,col 9)-(line 398,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.util.ValueUtils.getValue(java.lang.Object, java.beans.PropertyDescriptor, int)",
      "begin_line": 405,
      "end_line": 442,
      "comment": "\n     * Returns the index\u0027th element of the bean\u0027s property represented by\n     * the supplied property descriptor.\n     ",
      "child_ranges": [
        "(line 410,col 9)-(line 437,col 9)",
        "(line 441,col 9)-(line 441,col 67)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.util.ValueUtils.setValue(java.lang.Object, java.beans.PropertyDescriptor, int, java.lang.Object)",
      "begin_line": 449,
      "end_line": 489,
      "comment": "\n     * Modifies the index\u0027th element of the bean\u0027s property represented by\n     * the supplied property descriptor. Converts the value to the required\n     * type if necessary.\n     ",
      "child_ranges": [
        "(line 455,col 9)-(line 476,col 9)",
        "(line 478,col 9)-(line 478,col 63)",
        "(line 479,col 9)-(line 488,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.util.ValueUtils.getValue(java.lang.Object)",
      "begin_line": 495,
      "end_line": 500,
      "comment": "\n     * If the parameter is a container, opens the container and\n     * return the contents.  The method is recursive.\n     ",
      "child_ranges": [
        "(line 496,col 9)-(line 498,col 9)",
        "(line 499,col 9)-(line 499,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.util.ValueUtils.getDynamicPropertyHandler(java.lang.Class)",
      "begin_line": 506,
      "end_line": 523,
      "comment": "\n     * Returns a shared instance of the dynamic property handler class\n     * returned by \u003ccode\u003egetDynamicPropertyHandlerClass()\u003c/code\u003e.\n     ",
      "child_ranges": [
        "(line 508,col 9)-(line 509,col 74)",
        "(line 510,col 9)-(line 521,col 9)",
        "(line 522,col 9)-(line 522,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.util.ValueUtils.getAccessibleMethod(java.lang.reflect.Method)",
      "begin_line": 539,
      "end_line": 578,
      "comment": "\n     * Return an accessible method (that is, one that can be invoked via\n     * reflection) that implements the specified Method.  If no such method\n     * can be found, return \u003ccode\u003enull\u003c/code\u003e.\n     *\n     * @param method The method that we wish to call\n     ",
      "child_ranges": [
        "(line 542,col 9)-(line 544,col 9)",
        "(line 547,col 9)-(line 549,col 9)",
        "(line 552,col 9)-(line 552,col 49)",
        "(line 553,col 9)-(line 555,col 9)",
        "(line 557,col 9)-(line 557,col 39)",
        "(line 558,col 9)-(line 558,col 60)",
        "(line 559,col 9)-(line 576,col 9)",
        "(line 577,col 9)-(line 577,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.util.ValueUtils.getAccessibleMethodFromInterfaceNest(java.lang.Class, java.lang.String, java.lang.Class[])",
      "begin_line": 591,
      "end_line": 633,
      "comment": "\n     * Return an accessible method (that is, one that can be invoked via\n     * reflection) that implements the specified method, by scanning through\n     * all implemented interfaces and subinterfaces.  If no such Method\n     * can be found, return \u003ccode\u003enull\u003c/code\u003e.\n     *\n     * @param clazz Parent class for the interfaces to be checked\n     * @param methodName Method name of the method we wish to call\n     * @param parameterTypes The parameter type signatures\n     ",
      "child_ranges": [
        "(line 597,col 9)-(line 597,col 29)",
        "(line 600,col 9)-(line 600,col 51)",
        "(line 601,col 9)-(line 629,col 9)",
        "(line 632,col 9)-(line 632,col 24)"
      ]
    }
  ]
}