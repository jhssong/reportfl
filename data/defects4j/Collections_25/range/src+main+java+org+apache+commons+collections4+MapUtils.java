{
  "filepath": "/tmp/Collections-25b/src/main/java/org/apache/commons/collections4/MapUtils.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "MapUtils",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 77,
      "end_line": 1791,
      "comment": "\n * Provides utility methods and decorators for\n * {@link Map} and {@link SortedMap} instances.\n * \u003cp\u003e\n * It contains various type safe methods\n * as well as other useful features like deep copying.\n * \u003cp\u003e\n * It also provides the following decorators:\n *\n *  \u003cul\u003e\n *  \u003cli\u003e{@link #fixedSizeMap(Map)}\n *  \u003cli\u003e{@link #fixedSizeSortedMap(SortedMap)}\n *  \u003cli\u003e{@link #lazyMap(Map,Factory)}\n *  \u003cli\u003e{@link #lazyMap(Map,Transformer)}\n *  \u003cli\u003e{@link #lazySortedMap(SortedMap,Factory)}\n *  \u003cli\u003e{@link #lazySortedMap(SortedMap,Transformer)}\n *  \u003cli\u003e{@link #predicatedMap(Map,Predicate,Predicate)}\n *  \u003cli\u003e{@link #predicatedSortedMap(SortedMap,Predicate,Predicate)}\n *  \u003cli\u003e{@link #transformedMap(Map, Transformer, Transformer)}\n *  \u003cli\u003e{@link #transformedSortedMap(SortedMap, Transformer, Transformer)}\n *  \u003cli\u003e{@link #multiValueMap( Map )}\n *  \u003cli\u003e{@link #multiValueMap( Map, Class )}\n *  \u003cli\u003e{@link #multiValueMap( Map, Factory )}\n *  \u003c/ul\u003e\n *\n * @since 1.0\n * @version $Id$\n "
    },
    {
      "type": "field",
      "varNames": [
        "EMPTY_SORTED_MAP"
      ],
      "begin_line": 84,
      "end_line": 86,
      "comment": "\n     * An empty unmodifiable sorted map.\n     * This is not provided in the JDK.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "INDENT_STRING"
      ],
      "begin_line": 91,
      "end_line": 91,
      "comment": "\n     * String used to indent the verbose and debug Map prints.\n     "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.collections4.MapUtils.MapUtils()",
      "begin_line": 96,
      "end_line": 96,
      "comment": "\n     * \u003ccode\u003eMapUtils\u003c/code\u003e should not normally be instantiated.\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.MapUtils.getObject(java.util.Map\u003c? super K, V\u003e, K)",
      "begin_line": 109,
      "end_line": 114,
      "comment": "\n     * Gets from a Map in a null-safe manner.\n     *\n     * @param \u003cK\u003e  the key type\n     * @param \u003cV\u003e  the value type\n     * @param map  the map to use\n     * @param key  the key to look up\n     * @return the value in the Map, \u003ccode\u003enull\u003c/code\u003e if null map input\n     ",
      "child_ranges": [
        "(line 110,col 9)-(line 112,col 9)",
        "(line 113,col 9)-(line 113,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.MapUtils.getString(java.util.Map\u003c? super K, ?\u003e, K)",
      "begin_line": 126,
      "end_line": 134,
      "comment": "\n     * Gets a String from a Map in a null-safe manner.\n     * \u003cp\u003e\n     * The String is obtained via \u003ccode\u003etoString\u003c/code\u003e.\n     *\n     * @param \u003cK\u003e  the key type\n     * @param map  the map to use\n     * @param key  the key to look up\n     * @return the value in the Map as a String, \u003ccode\u003enull\u003c/code\u003e if null map input\n     ",
      "child_ranges": [
        "(line 127,col 9)-(line 132,col 9)",
        "(line 133,col 9)-(line 133,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.MapUtils.getBoolean(java.util.Map\u003c? super K, ?\u003e, K)",
      "begin_line": 151,
      "end_line": 168,
      "comment": "\n     * Gets a Boolean from a Map in a null-safe manner.\n     * \u003cp\u003e\n     * If the value is a \u003ccode\u003eBoolean\u003c/code\u003e it is returned directly.\n     * If the value is a \u003ccode\u003eString\u003c/code\u003e and it equals \u0027true\u0027 ignoring case\n     * then \u003ccode\u003etrue\u003c/code\u003e is returned, otherwise \u003ccode\u003efalse\u003c/code\u003e.\n     * If the value is a \u003ccode\u003eNumber\u003c/code\u003e an integer zero value returns\n     * \u003ccode\u003efalse\u003c/code\u003e and non-zero returns \u003ccode\u003etrue\u003c/code\u003e.\n     * Otherwise, \u003ccode\u003enull\u003c/code\u003e is returned.\n     *\n     * @param \u003cK\u003e  the key type\n     * @param map  the map to use\n     * @param key  the key to look up\n     * @return the value in the Map as a Boolean, \u003ccode\u003enull\u003c/code\u003e if null map input\n     ",
      "child_ranges": [
        "(line 152,col 9)-(line 166,col 9)",
        "(line 167,col 9)-(line 167,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.MapUtils.getNumber(java.util.Map\u003c? super K, ?\u003e, K)",
      "begin_line": 184,
      "end_line": 202,
      "comment": "\n     * Gets a Number from a Map in a null-safe manner.\n     * \u003cp\u003e\n     * If the value is a \u003ccode\u003eNumber\u003c/code\u003e it is returned directly.\n     * If the value is a \u003ccode\u003eString\u003c/code\u003e it is converted using\n     * {@link NumberFormat#parse(String)} on the system default formatter\n     * returning \u003ccode\u003enull\u003c/code\u003e if the conversion fails.\n     * Otherwise, \u003ccode\u003enull\u003c/code\u003e is returned.\n     *\n     * @param \u003cK\u003e  the key type\n     * @param map  the map to use\n     * @param key  the key to look up\n     * @return the value in the Map as a Number, \u003ccode\u003enull\u003c/code\u003e if null map input\n     ",
      "child_ranges": [
        "(line 185,col 9)-(line 200,col 9)",
        "(line 201,col 9)-(line 201,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.MapUtils.getByte(java.util.Map\u003c? super K, ?\u003e, K)",
      "begin_line": 214,
      "end_line": 223,
      "comment": "\n     * Gets a Byte from a Map in a null-safe manner.\n     * \u003cp\u003e\n     * The Byte is obtained from the results of {@link #getNumber(Map,Object)}.\n     *\n     * @param \u003cK\u003e  the key type\n     * @param map  the map to use\n     * @param key  the key to look up\n     * @return the value in the Map as a Byte, \u003ccode\u003enull\u003c/code\u003e if null map input\n     ",
      "child_ranges": [
        "(line 215,col 9)-(line 215,col 50)",
        "(line 216,col 9)-(line 218,col 9)",
        "(line 219,col 9)-(line 221,col 9)",
        "(line 222,col 9)-(line 222,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.MapUtils.getShort(java.util.Map\u003c? super K, ?\u003e, K)",
      "begin_line": 235,
      "end_line": 244,
      "comment": "\n     * Gets a Short from a Map in a null-safe manner.\n     * \u003cp\u003e\n     * The Short is obtained from the results of {@link #getNumber(Map,Object)}.\n     *\n     * @param \u003cK\u003e  the key type\n     * @param map  the map to use\n     * @param key  the key to look up\n     * @return the value in the Map as a Short, \u003ccode\u003enull\u003c/code\u003e if null map input\n     ",
      "child_ranges": [
        "(line 236,col 9)-(line 236,col 50)",
        "(line 237,col 9)-(line 239,col 9)",
        "(line 240,col 9)-(line 242,col 9)",
        "(line 243,col 9)-(line 243,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.MapUtils.getInteger(java.util.Map\u003c? super K, ?\u003e, K)",
      "begin_line": 256,
      "end_line": 265,
      "comment": "\n     * Gets a Integer from a Map in a null-safe manner.\n     * \u003cp\u003e\n     * The Integer is obtained from the results of {@link #getNumber(Map,Object)}.\n     *\n     * @param \u003cK\u003e  the key type\n     * @param map  the map to use\n     * @param key  the key to look up\n     * @return the value in the Map as a Integer, \u003ccode\u003enull\u003c/code\u003e if null map input\n     ",
      "child_ranges": [
        "(line 257,col 9)-(line 257,col 50)",
        "(line 258,col 9)-(line 260,col 9)",
        "(line 261,col 9)-(line 263,col 9)",
        "(line 264,col 9)-(line 264,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.MapUtils.getLong(java.util.Map\u003c? super K, ?\u003e, K)",
      "begin_line": 277,
      "end_line": 286,
      "comment": "\n     * Gets a Long from a Map in a null-safe manner.\n     * \u003cp\u003e\n     * The Long is obtained from the results of {@link #getNumber(Map,Object)}.\n     *\n     * @param \u003cK\u003e  the key type\n     * @param map  the map to use\n     * @param key  the key to look up\n     * @return the value in the Map as a Long, \u003ccode\u003enull\u003c/code\u003e if null map input\n     ",
      "child_ranges": [
        "(line 278,col 9)-(line 278,col 50)",
        "(line 279,col 9)-(line 281,col 9)",
        "(line 282,col 9)-(line 284,col 9)",
        "(line 285,col 9)-(line 285,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.MapUtils.getFloat(java.util.Map\u003c? super K, ?\u003e, K)",
      "begin_line": 298,
      "end_line": 307,
      "comment": "\n     * Gets a Float from a Map in a null-safe manner.\n     * \u003cp\u003e\n     * The Float is obtained from the results of {@link #getNumber(Map,Object)}.\n     *\n     * @param \u003cK\u003e  the key type\n     * @param map  the map to use\n     * @param key  the key to look up\n     * @return the value in the Map as a Float, \u003ccode\u003enull\u003c/code\u003e if null map input\n     ",
      "child_ranges": [
        "(line 299,col 9)-(line 299,col 50)",
        "(line 300,col 9)-(line 302,col 9)",
        "(line 303,col 9)-(line 305,col 9)",
        "(line 306,col 9)-(line 306,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.MapUtils.getDouble(java.util.Map\u003c? super K, ?\u003e, K)",
      "begin_line": 319,
      "end_line": 328,
      "comment": "\n     * Gets a Double from a Map in a null-safe manner.\n     * \u003cp\u003e\n     * The Double is obtained from the results of {@link #getNumber(Map,Object)}.\n     *\n     * @param \u003cK\u003e  the key type\n     * @param map  the map to use\n     * @param key  the key to look up\n     * @return the value in the Map as a Double, \u003ccode\u003enull\u003c/code\u003e if null map input\n     ",
      "child_ranges": [
        "(line 320,col 9)-(line 320,col 50)",
        "(line 321,col 9)-(line 323,col 9)",
        "(line 324,col 9)-(line 326,col 9)",
        "(line 327,col 9)-(line 327,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.MapUtils.getMap(java.util.Map\u003c? super K, ?\u003e, K)",
      "begin_line": 341,
      "end_line": 349,
      "comment": "\n     * Gets a Map from a Map in a null-safe manner.\n     * \u003cp\u003e\n     * If the value returned from the specified map is not a Map then\n     * \u003ccode\u003enull\u003c/code\u003e is returned.\n     *\n     * @param \u003cK\u003e  the key type\n     * @param map  the map to use\n     * @param key  the key to look up\n     * @return the value in the Map as a Map, \u003ccode\u003enull\u003c/code\u003e if null map input\n     ",
      "child_ranges": [
        "(line 342,col 9)-(line 347,col 9)",
        "(line 348,col 9)-(line 348,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.MapUtils.getObject(java.util.Map\u003cK, V\u003e, K, V)",
      "begin_line": 365,
      "end_line": 373,
      "comment": "\n     * Looks up the given key in the given map, converting null into the\n     * given default value.\n     *\n     * @param \u003cK\u003e  the key type\n     * @param \u003cV\u003e  the value type\n     * @param map  the map whose value to look up\n     * @param key  the key of the value to look up in that map\n     * @param defaultValue  what to return if the value is null\n     * @return  the value in the map, or defaultValue if the original value\n     *   is null or the map is null\n     ",
      "child_ranges": [
        "(line 366,col 9)-(line 371,col 9)",
        "(line 372,col 9)-(line 372,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.MapUtils.getString(java.util.Map\u003c? super K, ?\u003e, K, java.lang.String)",
      "begin_line": 387,
      "end_line": 393,
      "comment": "\n     * Looks up the given key in the given map, converting the result into\n     * a string, using the default value if the the conversion fails.\n     *\n     * @param \u003cK\u003e  the key type\n     * @param map  the map whose value to look up\n     * @param key  the key of the value to look up in that map\n     * @param defaultValue  what to return if the value is null or if the\n     *   conversion fails\n     * @return  the value in the map as a string, or defaultValue if the\n     *   original value is null, the map is null or the string conversion fails\n     ",
      "child_ranges": [
        "(line 388,col 9)-(line 388,col 44)",
        "(line 389,col 9)-(line 391,col 9)",
        "(line 392,col 9)-(line 392,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.MapUtils.getBoolean(java.util.Map\u003c? super K, ?\u003e, K, java.lang.Boolean)",
      "begin_line": 407,
      "end_line": 413,
      "comment": "\n     * Looks up the given key in the given map, converting the result into\n     * a boolean, using the default value if the the conversion fails.\n     *\n     * @param \u003cK\u003e  the key type\n     * @param map  the map whose value to look up\n     * @param key  the key of the value to look up in that map\n     * @param defaultValue  what to return if the value is null or if the\n     *   conversion fails\n     * @return  the value in the map as a boolean, or defaultValue if the\n     *   original value is null, the map is null or the boolean conversion fails\n     ",
      "child_ranges": [
        "(line 408,col 9)-(line 408,col 46)",
        "(line 409,col 9)-(line 411,col 9)",
        "(line 412,col 9)-(line 412,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.MapUtils.getNumber(java.util.Map\u003c? super K, ?\u003e, K, java.lang.Number)",
      "begin_line": 427,
      "end_line": 433,
      "comment": "\n     * Looks up the given key in the given map, converting the result into\n     * a number, using the default value if the the conversion fails.\n     *\n     * @param \u003cK\u003e  the key type\n     * @param map  the map whose value to look up\n     * @param key  the key of the value to look up in that map\n     * @param defaultValue  what to return if the value is null or if the\n     *   conversion fails\n     * @return  the value in the map as a number, or defaultValue if the\n     *   original value is null, the map is null or the number conversion fails\n     ",
      "child_ranges": [
        "(line 428,col 9)-(line 428,col 44)",
        "(line 429,col 9)-(line 431,col 9)",
        "(line 432,col 9)-(line 432,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.MapUtils.getByte(java.util.Map\u003c? super K, ?\u003e, K, java.lang.Byte)",
      "begin_line": 447,
      "end_line": 453,
      "comment": "\n     * Looks up the given key in the given map, converting the result into\n     * a byte, using the default value if the the conversion fails.\n     *\n     * @param \u003cK\u003e  the key type\n     * @param map  the map whose value to look up\n     * @param key  the key of the value to look up in that map\n     * @param defaultValue  what to return if the value is null or if the\n     *   conversion fails\n     * @return  the value in the map as a number, or defaultValue if the\n     *   original value is null, the map is null or the number conversion fails\n     ",
      "child_ranges": [
        "(line 448,col 9)-(line 448,col 40)",
        "(line 449,col 9)-(line 451,col 9)",
        "(line 452,col 9)-(line 452,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.MapUtils.getShort(java.util.Map\u003c? super K, ?\u003e, K, java.lang.Short)",
      "begin_line": 467,
      "end_line": 473,
      "comment": "\n     * Looks up the given key in the given map, converting the result into\n     * a short, using the default value if the the conversion fails.\n     *\n     * @param \u003cK\u003e  the key type\n     * @param map  the map whose value to look up\n     * @param key  the key of the value to look up in that map\n     * @param defaultValue  what to return if the value is null or if the\n     *   conversion fails\n     * @return  the value in the map as a number, or defaultValue if the\n     *   original value is null, the map is null or the number conversion fails\n     ",
      "child_ranges": [
        "(line 468,col 9)-(line 468,col 42)",
        "(line 469,col 9)-(line 471,col 9)",
        "(line 472,col 9)-(line 472,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.MapUtils.getInteger(java.util.Map\u003c? super K, ?\u003e, K, java.lang.Integer)",
      "begin_line": 487,
      "end_line": 493,
      "comment": "\n     * Looks up the given key in the given map, converting the result into\n     * an integer, using the default value if the the conversion fails.\n     *\n     * @param \u003cK\u003e  the key type\n     * @param map  the map whose value to look up\n     * @param key  the key of the value to look up in that map\n     * @param defaultValue  what to return if the value is null or if the\n     *   conversion fails\n     * @return  the value in the map as a number, or defaultValue if the\n     *   original value is null, the map is null or the number conversion fails\n     ",
      "child_ranges": [
        "(line 488,col 9)-(line 488,col 46)",
        "(line 489,col 9)-(line 491,col 9)",
        "(line 492,col 9)-(line 492,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.MapUtils.getLong(java.util.Map\u003c? super K, ?\u003e, K, java.lang.Long)",
      "begin_line": 507,
      "end_line": 513,
      "comment": "\n     * Looks up the given key in the given map, converting the result into\n     * a long, using the default value if the the conversion fails.\n     *\n     * @param \u003cK\u003e  the key type\n     * @param map  the map whose value to look up\n     * @param key  the key of the value to look up in that map\n     * @param defaultValue  what to return if the value is null or if the\n     *   conversion fails\n     * @return  the value in the map as a number, or defaultValue if the\n     *   original value is null, the map is null or the number conversion fails\n     ",
      "child_ranges": [
        "(line 508,col 9)-(line 508,col 40)",
        "(line 509,col 9)-(line 511,col 9)",
        "(line 512,col 9)-(line 512,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.MapUtils.getFloat(java.util.Map\u003c? super K, ?\u003e, K, java.lang.Float)",
      "begin_line": 527,
      "end_line": 533,
      "comment": "\n     * Looks up the given key in the given map, converting the result into\n     * a float, using the default value if the the conversion fails.\n     *\n     * @param \u003cK\u003e  the key type\n     * @param map  the map whose value to look up\n     * @param key  the key of the value to look up in that map\n     * @param defaultValue  what to return if the value is null or if the\n     *   conversion fails\n     * @return  the value in the map as a number, or defaultValue if the\n     *   original value is null, the map is null or the number conversion fails\n     ",
      "child_ranges": [
        "(line 528,col 9)-(line 528,col 42)",
        "(line 529,col 9)-(line 531,col 9)",
        "(line 532,col 9)-(line 532,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.MapUtils.getDouble(java.util.Map\u003c? super K, ?\u003e, K, java.lang.Double)",
      "begin_line": 547,
      "end_line": 553,
      "comment": "\n     * Looks up the given key in the given map, converting the result into\n     * a double, using the default value if the the conversion fails.\n     *\n     * @param \u003cK\u003e  the key type\n     * @param map  the map whose value to look up\n     * @param key  the key of the value to look up in that map\n     * @param defaultValue  what to return if the value is null or if the\n     *   conversion fails\n     * @return  the value in the map as a number, or defaultValue if the\n     *   original value is null, the map is null or the number conversion fails\n     ",
      "child_ranges": [
        "(line 548,col 9)-(line 548,col 44)",
        "(line 549,col 9)-(line 551,col 9)",
        "(line 552,col 9)-(line 552,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.MapUtils.getMap(java.util.Map\u003c? super K, ?\u003e, K, java.util.Map\u003c?, ?\u003e)",
      "begin_line": 567,
      "end_line": 573,
      "comment": "\n     * Looks up the given key in the given map, converting the result into\n     * a map, using the default value if the the conversion fails.\n     *\n     * @param \u003cK\u003e  the key type\n     * @param map  the map whose value to look up\n     * @param key  the key of the value to look up in that map\n     * @param defaultValue  what to return if the value is null or if the\n     *   conversion fails\n     * @return  the value in the map as a number, or defaultValue if the\n     *   original value is null, the map is null or the map conversion fails\n     ",
      "child_ranges": [
        "(line 568,col 9)-(line 568,col 44)",
        "(line 569,col 9)-(line 571,col 9)",
        "(line 572,col 9)-(line 572,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.MapUtils.getBooleanValue(java.util.Map\u003c? super K, ?\u003e, K)",
      "begin_line": 592,
      "end_line": 594,
      "comment": "\n     * Gets a boolean from a Map in a null-safe manner.\n     * \u003cp\u003e\n     * If the value is a \u003ccode\u003eBoolean\u003c/code\u003e its value is returned.\n     * If the value is a \u003ccode\u003eString\u003c/code\u003e and it equals \u0027true\u0027 ignoring case\n     * then \u003ccode\u003etrue\u003c/code\u003e is returned, otherwise \u003ccode\u003efalse\u003c/code\u003e.\n     * If the value is a \u003ccode\u003eNumber\u003c/code\u003e an integer zero value returns\n     * \u003ccode\u003efalse\u003c/code\u003e and non-zero returns \u003ccode\u003etrue\u003c/code\u003e.\n     * Otherwise, \u003ccode\u003efalse\u003c/code\u003e is returned.\n     *\n     * @param \u003cK\u003e  the key type\n     * @param map  the map to use\n     * @param key  the key to look up\n     * @return the value in the Map as a Boolean, \u003ccode\u003efalse\u003c/code\u003e if null map input\n     ",
      "child_ranges": [
        "(line 593,col 9)-(line 593,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.MapUtils.getByteValue(java.util.Map\u003c? super K, ?\u003e, K)",
      "begin_line": 606,
      "end_line": 612,
      "comment": "\n     * Gets a byte from a Map in a null-safe manner.\n     * \u003cp\u003e\n     * The byte is obtained from the results of {@link #getNumber(Map,Object)}.\n     *\n     * @param \u003cK\u003e  the key type\n     * @param map  the map to use\n     * @param key  the key to look up\n     * @return the value in the Map as a byte, \u003ccode\u003e0\u003c/code\u003e if null map input\n     ",
      "child_ranges": [
        "(line 607,col 9)-(line 607,col 50)",
        "(line 608,col 9)-(line 610,col 9)",
        "(line 611,col 9)-(line 611,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.MapUtils.getShortValue(java.util.Map\u003c? super K, ?\u003e, K)",
      "begin_line": 624,
      "end_line": 630,
      "comment": "\n     * Gets a short from a Map in a null-safe manner.\n     * \u003cp\u003e\n     * The short is obtained from the results of {@link #getNumber(Map,Object)}.\n     *\n     * @param \u003cK\u003e  the key type\n     * @param map  the map to use\n     * @param key  the key to look up\n     * @return the value in the Map as a short, \u003ccode\u003e0\u003c/code\u003e if null map input\n     ",
      "child_ranges": [
        "(line 625,col 9)-(line 625,col 53)",
        "(line 626,col 9)-(line 628,col 9)",
        "(line 629,col 9)-(line 629,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.MapUtils.getIntValue(java.util.Map\u003c? super K, ?\u003e, K)",
      "begin_line": 642,
      "end_line": 648,
      "comment": "\n     * Gets an int from a Map in a null-safe manner.\n     * \u003cp\u003e\n     * The int is obtained from the results of {@link #getNumber(Map,Object)}.\n     *\n     * @param \u003cK\u003e  the key type\n     * @param map  the map to use\n     * @param key  the key to look up\n     * @return the value in the Map as an int, \u003ccode\u003e0\u003c/code\u003e if null map input\n     ",
      "child_ranges": [
        "(line 643,col 9)-(line 643,col 59)",
        "(line 644,col 9)-(line 646,col 9)",
        "(line 647,col 9)-(line 647,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.MapUtils.getLongValue(java.util.Map\u003c? super K, ?\u003e, K)",
      "begin_line": 660,
      "end_line": 666,
      "comment": "\n     * Gets a long from a Map in a null-safe manner.\n     * \u003cp\u003e\n     * The long is obtained from the results of {@link #getNumber(Map,Object)}.\n     *\n     * @param \u003cK\u003e  the key type\n     * @param map  the map to use\n     * @param key  the key to look up\n     * @return the value in the Map as a long, \u003ccode\u003e0L\u003c/code\u003e if null map input\n     ",
      "child_ranges": [
        "(line 661,col 9)-(line 661,col 50)",
        "(line 662,col 9)-(line 664,col 9)",
        "(line 665,col 9)-(line 665,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.MapUtils.getFloatValue(java.util.Map\u003c? super K, ?\u003e, K)",
      "begin_line": 678,
      "end_line": 684,
      "comment": "\n     * Gets a float from a Map in a null-safe manner.\n     * \u003cp\u003e\n     * The float is obtained from the results of {@link #getNumber(Map,Object)}.\n     *\n     * @param \u003cK\u003e  the key type\n     * @param map  the map to use\n     * @param key  the key to look up\n     * @return the value in the Map as a float, \u003ccode\u003e0.0F\u003c/code\u003e if null map input\n     ",
      "child_ranges": [
        "(line 679,col 9)-(line 679,col 53)",
        "(line 680,col 9)-(line 682,col 9)",
        "(line 683,col 9)-(line 683,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.MapUtils.getDoubleValue(java.util.Map\u003c? super K, ?\u003e, K)",
      "begin_line": 696,
      "end_line": 702,
      "comment": "\n     * Gets a double from a Map in a null-safe manner.\n     * \u003cp\u003e\n     * The double is obtained from the results of {@link #getNumber(Map,Object)}.\n     *\n     * @param \u003cK\u003e  the key type\n     * @param map  the map to use\n     * @param key  the key to look up\n     * @return the value in the Map as a double, \u003ccode\u003e0.0\u003c/code\u003e if null map input\n     ",
      "child_ranges": [
        "(line 697,col 9)-(line 697,col 56)",
        "(line 698,col 9)-(line 700,col 9)",
        "(line 701,col 9)-(line 701,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.MapUtils.getBooleanValue(java.util.Map\u003c? super K, ?\u003e, K, boolean)",
      "begin_line": 723,
      "end_line": 729,
      "comment": "\n     * Gets a boolean from a Map in a null-safe manner,\n     * using the default value if the the conversion fails.\n     * \u003cp\u003e\n     * If the value is a \u003ccode\u003eBoolean\u003c/code\u003e its value is returned.\n     * If the value is a \u003ccode\u003eString\u003c/code\u003e and it equals \u0027true\u0027 ignoring case\n     * then \u003ccode\u003etrue\u003c/code\u003e is returned, otherwise \u003ccode\u003efalse\u003c/code\u003e.\n     * If the value is a \u003ccode\u003eNumber\u003c/code\u003e an integer zero value returns\n     * \u003ccode\u003efalse\u003c/code\u003e and non-zero returns \u003ccode\u003etrue\u003c/code\u003e.\n     * Otherwise, \u003ccode\u003edefaultValue\u003c/code\u003e is returned.\n     *\n     * @param \u003cK\u003e  the key type\n     * @param map  the map to use\n     * @param key  the key to look up\n     * @param defaultValue  return if the value is null or if the conversion fails\n     * @return the value in the Map as a Boolean, \u003ccode\u003edefaultValue\u003c/code\u003e if null map input\n     ",
      "child_ranges": [
        "(line 724,col 9)-(line 724,col 59)",
        "(line 725,col 9)-(line 727,col 9)",
        "(line 728,col 9)-(line 728,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.MapUtils.getByteValue(java.util.Map\u003c? super K, ?\u003e, K, byte)",
      "begin_line": 743,
      "end_line": 749,
      "comment": "\n     * Gets a byte from a Map in a null-safe manner,\n     * using the default value if the the conversion fails.\n     * \u003cp\u003e\n     * The byte is obtained from the results of {@link #getNumber(Map,Object)}.\n     *\n     * @param \u003cK\u003e  the key type\n     * @param map  the map to use\n     * @param key  the key to look up\n     * @param defaultValue  return if the value is null or if the conversion fails\n     * @return the value in the Map as a byte, \u003ccode\u003edefaultValue\u003c/code\u003e if null map input\n     ",
      "child_ranges": [
        "(line 744,col 9)-(line 744,col 50)",
        "(line 745,col 9)-(line 747,col 9)",
        "(line 748,col 9)-(line 748,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.MapUtils.getShortValue(java.util.Map\u003c? super K, ?\u003e, K, short)",
      "begin_line": 763,
      "end_line": 769,
      "comment": "\n     * Gets a short from a Map in a null-safe manner,\n     * using the default value if the the conversion fails.\n     * \u003cp\u003e\n     * The short is obtained from the results of {@link #getNumber(Map,Object)}.\n     *\n     * @param \u003cK\u003e  the key type\n     * @param map  the map to use\n     * @param key  the key to look up\n     * @param defaultValue  return if the value is null or if the conversion fails\n     * @return the value in the Map as a short, \u003ccode\u003edefaultValue\u003c/code\u003e if null map input\n     ",
      "child_ranges": [
        "(line 764,col 9)-(line 764,col 53)",
        "(line 765,col 9)-(line 767,col 9)",
        "(line 768,col 9)-(line 768,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.MapUtils.getIntValue(java.util.Map\u003c? super K, ?\u003e, K, int)",
      "begin_line": 783,
      "end_line": 789,
      "comment": "\n     * Gets an int from a Map in a null-safe manner,\n     * using the default value if the the conversion fails.\n     * \u003cp\u003e\n     * The int is obtained from the results of {@link #getNumber(Map,Object)}.\n     *\n     * @param \u003cK\u003e  the key type\n     * @param map  the map to use\n     * @param key  the key to look up\n     * @param defaultValue  return if the value is null or if the conversion fails\n     * @return the value in the Map as an int, \u003ccode\u003edefaultValue\u003c/code\u003e if null map input\n     ",
      "child_ranges": [
        "(line 784,col 9)-(line 784,col 59)",
        "(line 785,col 9)-(line 787,col 9)",
        "(line 788,col 9)-(line 788,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.MapUtils.getLongValue(java.util.Map\u003c? super K, ?\u003e, K, long)",
      "begin_line": 803,
      "end_line": 809,
      "comment": "\n     * Gets a long from a Map in a null-safe manner,\n     * using the default value if the the conversion fails.\n     * \u003cp\u003e\n     * The long is obtained from the results of {@link #getNumber(Map,Object)}.\n     *\n     * @param \u003cK\u003e  the key type\n     * @param map  the map to use\n     * @param key  the key to look up\n     * @param defaultValue  return if the value is null or if the conversion fails\n     * @return the value in the Map as a long, \u003ccode\u003edefaultValue\u003c/code\u003e if null map input\n     ",
      "child_ranges": [
        "(line 804,col 9)-(line 804,col 50)",
        "(line 805,col 9)-(line 807,col 9)",
        "(line 808,col 9)-(line 808,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.MapUtils.getFloatValue(java.util.Map\u003c? super K, ?\u003e, K, float)",
      "begin_line": 823,
      "end_line": 829,
      "comment": "\n     * Gets a float from a Map in a null-safe manner,\n     * using the default value if the the conversion fails.\n     * \u003cp\u003e\n     * The float is obtained from the results of {@link #getNumber(Map,Object)}.\n     *\n     * @param \u003cK\u003e  the key type\n     * @param map  the map to use\n     * @param key  the key to look up\n     * @param defaultValue  return if the value is null or if the conversion fails\n     * @return the value in the Map as a float, \u003ccode\u003edefaultValue\u003c/code\u003e if null map input\n     ",
      "child_ranges": [
        "(line 824,col 9)-(line 824,col 53)",
        "(line 825,col 9)-(line 827,col 9)",
        "(line 828,col 9)-(line 828,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.MapUtils.getDoubleValue(java.util.Map\u003c? super K, ?\u003e, K, double)",
      "begin_line": 843,
      "end_line": 849,
      "comment": "\n     * Gets a double from a Map in a null-safe manner,\n     * using the default value if the the conversion fails.\n     * \u003cp\u003e\n     * The double is obtained from the results of {@link #getNumber(Map,Object)}.\n     *\n     * @param \u003cK\u003e  the key type\n     * @param map  the map to use\n     * @param key  the key to look up\n     * @param defaultValue  return if the value is null or if the conversion fails\n     * @return the value in the Map as a double, \u003ccode\u003edefaultValue\u003c/code\u003e if null map input\n     ",
      "child_ranges": [
        "(line 844,col 9)-(line 844,col 56)",
        "(line 845,col 9)-(line 847,col 9)",
        "(line 848,col 9)-(line 848,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.MapUtils.toProperties(java.util.Map\u003cK, V\u003e)",
      "begin_line": 867,
      "end_line": 878,
      "comment": "\n     * Gets a new Properties object initialised with the values from a Map.\n     * A null input will return an empty properties object.\n     * \u003cp\u003e\n     * A Properties object may only store non-null keys and values, thus if\n     * the provided map contains either a key or value which is {@code null},\n     * a {@link NullPointerException} will be thrown.\n     *\n     * @param \u003cK\u003e  the key type\n     * @param \u003cV\u003e  the value type\n     * @param map  the map to convert to a Properties object\n     * @return the properties object\n     * @throws NullPointerException if a key or value in the provided map is {@code null}\n     ",
      "child_ranges": [
        "(line 868,col 9)-(line 868,col 51)",
        "(line 869,col 9)-(line 876,col 9)",
        "(line 877,col 9)-(line 877,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.MapUtils.toMap(java.util.ResourceBundle)",
      "begin_line": 887,
      "end_line": 898,
      "comment": "\n     * Creates a new HashMap using data copied from a ResourceBundle.\n     *\n     * @param resourceBundle  the resource bundle to convert, may not be null\n     * @return the hashmap containing the data\n     * @throws NullPointerException if the bundle is null\n     ",
      "child_ranges": [
        "(line 888,col 9)-(line 888,col 73)",
        "(line 889,col 9)-(line 889,col 70)",
        "(line 891,col 9)-(line 895,col 9)",
        "(line 897,col 9)-(line 897,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.MapUtils.verbosePrint(java.io.PrintStream, java.lang.Object, java.util.Map\u003c?, ?\u003e)",
      "begin_line": 920,
      "end_line": 922,
      "comment": "\n     * Prints the given map with nice line breaks.\n     * \u003cp\u003e\n     * This method prints a nicely formatted String describing the Map.\n     * Each map entry will be printed with key and value.\n     * When the value is a Map, recursive behaviour occurs.\n     * \u003cp\u003e\n     * This method is NOT thread-safe in any special way. You must manually\n     * synchronize on either this class or the stream as required.\n     *\n     * @param out  the stream to print to, must not be null\n     * @param label  The label to be used, may be \u003ccode\u003enull\u003c/code\u003e.\n     *  If \u003ccode\u003enull\u003c/code\u003e, the label is not output.\n     *  It typically represents the name of the property in a bean or similar.\n     * @param map  The map to print, may be \u003ccode\u003enull\u003c/code\u003e.\n     *  If \u003ccode\u003enull\u003c/code\u003e, the text \u0027null\u0027 is output.\n     * @throws NullPointerException if the stream is \u003ccode\u003enull\u003c/code\u003e\n     ",
      "child_ranges": [
        "(line 921,col 9)-(line 921,col 82)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.MapUtils.debugPrint(java.io.PrintStream, java.lang.Object, java.util.Map\u003c?, ?\u003e)",
      "begin_line": 942,
      "end_line": 944,
      "comment": "\n     * Prints the given map with nice line breaks.\n     * \u003cp\u003e\n     * This method prints a nicely formatted String describing the Map.\n     * Each map entry will be printed with key, value and value classname.\n     * When the value is a Map, recursive behaviour occurs.\n     * \u003cp\u003e\n     * This method is NOT thread-safe in any special way. You must manually\n     * synchronize on either this class or the stream as required.\n     *\n     * @param out  the stream to print to, must not be null\n     * @param label  The label to be used, may be \u003ccode\u003enull\u003c/code\u003e.\n     *   If \u003ccode\u003enull\u003c/code\u003e, the label is not output.\n     *   It typically represents the name of the property in a bean or similar.\n     * @param map  The map to print, may be \u003ccode\u003enull\u003c/code\u003e.\n     *   If \u003ccode\u003enull\u003c/code\u003e, the text \u0027null\u0027 is output.\n     * @throws NullPointerException if the stream is \u003ccode\u003enull\u003c/code\u003e\n     ",
      "child_ranges": [
        "(line 943,col 9)-(line 943,col 81)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.MapUtils.verbosePrintInternal(java.io.PrintStream, java.lang.Object, java.util.Map\u003c?, ?\u003e, org.apache.commons.collections4.ArrayStack\u003cjava.util.Map\u003c?, ?\u003e\u003e, boolean)",
      "begin_line": 971,
      "end_line": 1033,
      "comment": "\n     * Implementation providing functionality for {@link #debugPrint} and for\n     * {@link #verbosePrint}.  This prints the given map with nice line breaks.\n     * If the debug flag is true, it additionally prints the type of the object\n     * value.  If the contents of a map include the map itself, then the text\n     * \u003cem\u003e(this Map)\u003c/em\u003e is printed out.  If the contents include a\n     * parent container of the map, the the text \u003cem\u003e(ancestor[i] Map)\u003c/em\u003e is\n     * printed, where i actually indicates the number of levels which must be\n     * traversed in the sequential list of ancestors (e.g. father, grandfather,\n     * great-grandfather, etc).\n     *\n     * @param out  the stream to print to\n     * @param label  the label to be used, may be \u003ccode\u003enull\u003c/code\u003e.\n     *   If \u003ccode\u003enull\u003c/code\u003e, the label is not output.\n     *   It typically represents the name of the property in a bean or similar.\n     * @param map  the map to print, may be \u003ccode\u003enull\u003c/code\u003e.\n     *   If \u003ccode\u003enull\u003c/code\u003e, the text \u0027null\u0027 is output\n     * @param lineage  a stack consisting of any maps in which the previous\n     *   argument is contained. This is checked to avoid infinite recursion when\n     *   printing the output\n     * @param debug  flag indicating whether type names should be output.\n     * @throws NullPointerException if the stream is \u003ccode\u003enull\u003c/code\u003e\n     ",
      "child_ranges": [
        "(line 973,col 9)-(line 973,col 41)",
        "(line 975,col 9)-(line 982,col 9)",
        "(line 983,col 9)-(line 986,col 9)",
        "(line 988,col 9)-(line 988,col 41)",
        "(line 989,col 9)-(line 989,col 25)",
        "(line 991,col 9)-(line 991,col 26)",
        "(line 993,col 9)-(line 1027,col 9)",
        "(line 1029,col 9)-(line 1029,col 22)",
        "(line 1031,col 9)-(line 1031,col 41)",
        "(line 1032,col 9)-(line 1032,col 67)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.MapUtils.printIndent(java.io.PrintStream, int)",
      "begin_line": 1040,
      "end_line": 1044,
      "comment": "\n     * Writes indentation to the given stream.\n     *\n     * @param out  the stream to indent\n     ",
      "child_ranges": [
        "(line 1041,col 9)-(line 1043,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.MapUtils.invertMap(java.util.Map\u003cK, V\u003e)",
      "begin_line": 1063,
      "end_line": 1069,
      "comment": "\n     * Inverts the supplied map returning a new HashMap such that the keys of\n     * the input are swapped with the values.\n     * \u003cp\u003e\n     * This operation assumes that the inverse mapping is well defined.\n     * If the input map had multiple entries with the same value mapped to\n     * different keys, the returned map will map one of those keys to the\n     * value, but the exact key which will be mapped is undefined.\n     *\n     * @param \u003cK\u003e  the key type\n     * @param \u003cV\u003e  the value type\n     * @param map  the map to invert, may not be null\n     * @return a new HashMap containing the inverted data\n     * @throws NullPointerException if the map is null\n     ",
      "child_ranges": [
        "(line 1064,col 9)-(line 1064,col 60)",
        "(line 1065,col 9)-(line 1067,col 9)",
        "(line 1068,col 9)-(line 1068,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.MapUtils.safeAddToMap(java.util.Map\u003c? super K, java.lang.Object\u003e, K, java.lang.Object)",
      "begin_line": 1092,
      "end_line": 1095,
      "comment": "\n     * Protects against adding null values to a map.\n     * \u003cp\u003e\n     * This method checks the value being added to the map, and if it is null\n     * it is replaced by an empty string.\n     * \u003cp\u003e\n     * This could be useful if the map does not accept null values, or for\n     * receiving data from a source that may provide null or empty string\n     * which should be held in the same way in the map.\n     * \u003cp\u003e\n     * Keys are not validated.\n     * Note that this method can be used to circumvent the map\u0027s\n     * value type at runtime.\n     *\n     * @param \u003cK\u003e  the key type\n     * @param map  the map to add to, may not be null\n     * @param key  the key\n     * @param value  the value, null converted to \"\"\n     * @throws NullPointerException if the map is null\n     ",
      "child_ranges": [
        "(line 1094,col 9)-(line 1094,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.MapUtils.putAll(java.util.Map\u003cK, V\u003e, java.lang.Object[])",
      "begin_line": 1146,
      "end_line": 1183,
      "comment": "\n     * Puts all the keys and values from the specified array into the map.\n     * \u003cp\u003e\n     * This method is an alternative to the {@link java.util.Map#putAll(java.util.Map)}\n     * method and constructors. It allows you to build a map from an object array\n     * of various possible styles.\n     * \u003cp\u003e\n     * If the first entry in the object array implements {@link java.util.Map.Entry}\n     * or {@link KeyValue} then the key and value are added from that object.\n     * If the first entry in the object array is an object array itself, then\n     * it is assumed that index 0 in the sub-array is the key and index 1 is the value.\n     * Otherwise, the array is treated as keys and values in alternate indices.\n     * \u003cp\u003e\n     * For example, to create a color map:\n     * \u003cpre\u003e\n     * Map colorMap \u003d MapUtils.putAll(new HashMap(), new String[][] {\n     *     {\"RED\", \"#FF0000\"},\n     *     {\"GREEN\", \"#00FF00\"},\n     *     {\"BLUE\", \"#0000FF\"}\n     * });\n     * \u003c/pre\u003e\n     * or:\n     * \u003cpre\u003e\n     * Map colorMap \u003d MapUtils.putAll(new HashMap(), new String[] {\n     *     \"RED\", \"#FF0000\",\n     *     \"GREEN\", \"#00FF00\",\n     *     \"BLUE\", \"#0000FF\"\n     * });\n     * \u003c/pre\u003e\n     * or:\n     * \u003cpre\u003e\n     * Map colorMap \u003d MapUtils.putAll(new HashMap(), new Map.Entry[] {\n     *     new DefaultMapEntry(\"RED\", \"#FF0000\"),\n     *     new DefaultMapEntry(\"GREEN\", \"#00FF00\"),\n     *     new DefaultMapEntry(\"BLUE\", \"#0000FF\")\n     * });\n     * \u003c/pre\u003e\n     *\n     * @param \u003cK\u003e  the key type\n     * @param \u003cV\u003e  the value type\n     * @param map  the map to populate, must not be null\n     * @param array  an array to populate from, null ignored\n     * @return the input map\n     * @throws NullPointerException  if map is null\n     * @throws IllegalArgumentException  if sub-array or entry matching used and an entry is invalid\n     * @throws ClassCastException if the array contents is mixed\n     * @since 3.2\n     ",
      "child_ranges": [
        "(line 1148,col 9)-(line 1150,col 9)",
        "(line 1151,col 9)-(line 1153,col 9)",
        "(line 1154,col 9)-(line 1154,col 36)",
        "(line 1155,col 9)-(line 1181,col 9)",
        "(line 1182,col 9)-(line 1182,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.MapUtils.emptyIfNull(java.util.Map\u003cK, V\u003e)",
      "begin_line": 1196,
      "end_line": 1198,
      "comment": "\n     * Returns an immutable empty map if the argument is \u003ccode\u003enull\u003c/code\u003e,\n     * or the argument itself otherwise.\n     *\n     * @param \u003cK\u003e the key type\n     * @param \u003cV\u003e the value type\n     * @param map the map, possibly \u003ccode\u003enull\u003c/code\u003e\n     * @return an empty map if the argument is \u003ccode\u003enull\u003c/code\u003e\n     ",
      "child_ranges": [
        "(line 1197,col 9)-(line 1197,col 63)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.MapUtils.isEmpty(java.util.Map\u003c?, ?\u003e)",
      "begin_line": 1209,
      "end_line": 1211,
      "comment": "\n     * Null-safe check if the specified map is empty.\n     * \u003cp\u003e\n     * Null returns true.\n     *\n     * @param map  the map to check, may be null\n     * @return true if empty or null\n     * @since 3.2\n     ",
      "child_ranges": [
        "(line 1210,col 9)-(line 1210,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.MapUtils.isNotEmpty(java.util.Map\u003c?, ?\u003e)",
      "begin_line": 1222,
      "end_line": 1224,
      "comment": "\n     * Null-safe check if the specified map is not empty.\n     * \u003cp\u003e\n     * Null returns false.\n     *\n     * @param map  the map to check, may be null\n     * @return true if non-null and non-empty\n     * @since 3.2\n     ",
      "child_ranges": [
        "(line 1223,col 9)-(line 1223,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.MapUtils.synchronizedMap(java.util.Map\u003cK, V\u003e)",
      "begin_line": 1252,
      "end_line": 1254,
      "comment": "\n     * Returns a synchronized map backed by the given map.\n     * \u003cp\u003e\n     * You must manually synchronize on the returned buffer\u0027s iterator to\n     * avoid non-deterministic behavior:\n     *\n     * \u003cpre\u003e\n     * Map m \u003d MapUtils.synchronizedMap(myMap);\n     * Set s \u003d m.keySet();  // outside synchronized block\n     * synchronized (m) {  // synchronized on MAP!\n     *     Iterator i \u003d s.iterator();\n     *     while (i.hasNext()) {\n     *         process (i.next());\n     *     }\n     * }\n     * \u003c/pre\u003e\n     *\n     * This method uses the implementation in {@link java.util.Collections Collections}.\n     *\n     * @param \u003cK\u003e  the key type\n     * @param \u003cV\u003e  the value type\n     * @param map  the map to synchronize, must not be null\n     * @return a synchronized map backed by the given map\n     ",
      "child_ranges": [
        "(line 1253,col 9)-(line 1253,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.MapUtils.unmodifiableMap(java.util.Map\u003c? extends K, ? extends V\u003e)",
      "begin_line": 1267,
      "end_line": 1269,
      "comment": "\n     * Returns an unmodifiable map backed by the given map.\n     * \u003cp\u003e\n     * This method uses the implementation in the decorators subpackage.\n     *\n     * @param \u003cK\u003e  the key type\n     * @param \u003cV\u003e  the value type\n     * @param map  the map to make unmodifiable, must not be null\n     * @return an unmodifiable map backed by the given map\n     * @throws IllegalArgumentException  if the map is null\n     ",
      "child_ranges": [
        "(line 1268,col 9)-(line 1268,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.MapUtils.predicatedMap(java.util.Map\u003cK, V\u003e, org.apache.commons.collections4.Predicate\u003c? super K\u003e, org.apache.commons.collections4.Predicate\u003c? super V\u003e)",
      "begin_line": 1288,
      "end_line": 1291,
      "comment": "\n     * Returns a predicated (validating) map backed by the given map.\n     * \u003cp\u003e\n     * Only objects that pass the tests in the given predicates can be added to the map.\n     * Trying to add an invalid object results in an IllegalArgumentException.\n     * Keys must pass the key predicate, values must pass the value predicate.\n     * It is important not to use the original map after invoking this method,\n     * as it is a backdoor for adding invalid objects.\n     *\n     * @param \u003cK\u003e  the key type\n     * @param \u003cV\u003e  the value type\n     * @param map  the map to predicate, must not be null\n     * @param keyPred  the predicate for keys, null means no check\n     * @param valuePred  the predicate for values, null means no check\n     * @return a predicated map backed by the given map\n     * @throws IllegalArgumentException  if the Map is null\n     ",
      "child_ranges": [
        "(line 1290,col 9)-(line 1290,col 68)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.MapUtils.transformedMap(java.util.Map\u003cK, V\u003e, org.apache.commons.collections4.Transformer\u003c? super K, ? extends K\u003e, org.apache.commons.collections4.Transformer\u003c? super V, ? extends V\u003e)",
      "begin_line": 1316,
      "end_line": 1320,
      "comment": "\n     * Returns a transformed map backed by the given map.\n     * \u003cp\u003e\n     * This method returns a new map (decorating the specified map) that\n     * will transform any new entries added to it.\n     * Existing entries in the specified map will not be transformed.\n     * If you want that behaviour, see {@link TransformedMap#transformedMap}.\n     * \u003cp\u003e\n     * Each object is passed through the transformers as it is added to the\n     * Map. It is important not to use the original map after invoking this\n     * method, as it is a backdoor for adding untransformed objects.\n     * \u003cp\u003e\n     * If there are any elements already in the map being decorated, they\n     * are NOT transformed.\n     *\n     * @param \u003cK\u003e  the key type\n     * @param \u003cV\u003e  the value type\n     * @param map  the map to transform, must not be null, typically empty\n     * @param keyTransformer  the transformer for the map keys, null means no transformation\n     * @param valueTransformer  the transformer for the map values, null means no transformation\n     * @return a transformed map backed by the given map\n     * @throws IllegalArgumentException  if the Map is null\n     ",
      "child_ranges": [
        "(line 1319,col 9)-(line 1319,col 85)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.MapUtils.fixedSizeMap(java.util.Map\u003cK, V\u003e)",
      "begin_line": 1334,
      "end_line": 1336,
      "comment": "\n     * Returns a fixed-sized map backed by the given map.\n     * Elements may not be added or removed from the returned map, but\n     * existing elements can be changed (for instance, via the\n     * {@link Map#put(Object,Object)} method).\n     *\n     * @param \u003cK\u003e  the key type\n     * @param \u003cV\u003e  the value type\n     * @param map  the map whose size to fix, must not be null\n     * @return a fixed-size map backed by that map\n     * @throws IllegalArgumentException  if the Map is null\n     ",
      "child_ranges": [
        "(line 1335,col 9)-(line 1335,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.MapUtils.lazyMap(java.util.Map\u003cK, V\u003e, org.apache.commons.collections4.Factory\u003c? extends V\u003e)",
      "begin_line": 1368,
      "end_line": 1370,
      "comment": "\n     * Returns a \"lazy\" map whose values will be created on demand.\n     * \u003cp\u003e\n     * When the key passed to the returned map\u0027s {@link Map#get(Object)}\n     * method is not present in the map, then the factory will be used\n     * to create a new object and that object will become the value\n     * associated with that key.\n     * \u003cp\u003e\n     * For instance:\n     * \u003cpre\u003e\n     * Factory factory \u003d new Factory() {\n     *     public Object create() {\n     *         return new Date();\n     *     }\n     * }\n     * Map lazyMap \u003d MapUtils.lazyMap(new HashMap(), factory);\n     * Object obj \u003d lazyMap.get(\"test\");\n     * \u003c/pre\u003e\n     *\n     * After the above code is executed, \u003ccode\u003eobj\u003c/code\u003e will contain\n     * a new \u003ccode\u003eDate\u003c/code\u003e instance.  Furthermore, that \u003ccode\u003eDate\u003c/code\u003e\n     * instance is the value for the \u003ccode\u003e\"test\"\u003c/code\u003e key in the map.\n     *\n     * @param \u003cK\u003e  the key type\n     * @param \u003cV\u003e  the value type\n     * @param map  the map to make lazy, must not be null\n     * @param factory  the factory for creating new objects, must not be null\n     * @return a lazy map backed by the given map\n     * @throws IllegalArgumentException  if the Map or Factory is null\n     ",
      "child_ranges": [
        "(line 1369,col 9)-(line 1369,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.MapUtils.lazyMap(java.util.Map\u003cK, V\u003e, org.apache.commons.collections4.Transformer\u003c? super K, ? extends V\u003e)",
      "begin_line": 1409,
      "end_line": 1412,
      "comment": "\n     * Returns a \"lazy\" map whose values will be created on demand.\n     * \u003cp\u003e\n     * When the key passed to the returned map\u0027s {@link Map#get(Object)}\n     * method is not present in the map, then the factory will be used\n     * to create a new object and that object will become the value\n     * associated with that key. The factory is a {@link Transformer}\n     * that will be passed the key which it must transform into the value.\n     * \u003cp\u003e\n     * For instance:\n     * \u003cpre\u003e\n     * Transformer factory \u003d new Transformer() {\n     *     public Object transform(Object mapKey) {\n     *         return new File(mapKey);\n     *     }\n     * }\n     * Map lazyMap \u003d MapUtils.lazyMap(new HashMap(), factory);\n     * Object obj \u003d lazyMap.get(\"C:/dev\");\n     * \u003c/pre\u003e\n     *\n     * After the above code is executed, \u003ccode\u003eobj\u003c/code\u003e will contain\n     * a new \u003ccode\u003eFile\u003c/code\u003e instance for the C drive dev directory.\n     * Furthermore, that \u003ccode\u003eFile\u003c/code\u003e instance is the value for the\n     * \u003ccode\u003e\"C:/dev\"\u003c/code\u003e key in the map.\n     * \u003cp\u003e\n     * If a lazy map is wrapped by a synchronized map, the result is a simple\n     * synchronized cache. When an object is not is the cache, the cache itself\n     * calls back to the factory Transformer to populate itself, all within the\n     * same synchronized block.\n     *\n     * @param \u003cK\u003e  the key type\n     * @param \u003cV\u003e  the value type\n     * @param map  the map to make lazy, must not be null\n     * @param transformerFactory  the factory for creating new objects, must not be null\n     * @return a lazy map backed by the given map\n     * @throws IllegalArgumentException  if the Map or Transformer is null\n     ",
      "child_ranges": [
        "(line 1411,col 9)-(line 1411,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.MapUtils.orderedMap(java.util.Map\u003cK, V\u003e)",
      "begin_line": 1427,
      "end_line": 1429,
      "comment": "\n     * Returns a map that maintains the order of keys that are added\n     * backed by the given map.\n     * \u003cp\u003e\n     * If a key is added twice, the order is determined by the first add.\n     * The order is observed through the keySet, values and entrySet.\n     *\n     * @param \u003cK\u003e  the key type\n     * @param \u003cV\u003e  the value type\n     * @param map  the map to order, must not be null\n     * @return an ordered map backed by the given map\n     * @throws IllegalArgumentException  if the Map is null\n     ",
      "child_ranges": [
        "(line 1428,col 9)-(line 1428,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.MapUtils.multiValueMap(java.util.Map\u003cK, ? super java.util.Collection\u003cV\u003e\u003e)",
      "begin_line": 1443,
      "end_line": 1446,
      "comment": "\n     * Creates a mult-value map backed by the given map which returns\n     * collections of type ArrayList.\n     *\n     * @param \u003cK\u003e  the key type\n     * @param \u003cV\u003e  the value type\n     * @param map  the map to decorate\n     * @return a multi-value map backed by the given map which returns ArrayLists of values.\n     * @see MultiValueMap\n     * @since 3.2\n     * @deprecated since 4.1, use {@link MultiValuedMap} instead\n     ",
      "child_ranges": [
        "(line 1445,col 9)-(line 1445,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.MapUtils.multiValueMap(java.util.Map\u003cK, C\u003e, java.lang.Class\u003cC\u003e)",
      "begin_line": 1463,
      "end_line": 1467,
      "comment": "\n     * Creates a multi-value map backed by the given map which returns\n     * collections of the specified type.\n     *\n     * @param \u003cK\u003e  the key type\n     * @param \u003cV\u003e  the value type\n     * @param \u003cC\u003e  the collection class type\n     * @param map  the map to decorate\n     * @param collectionClass  the type of collections to return from the map\n     *   (must contain public no-arg constructor and extend Collection)\n     * @return a multi-value map backed by the given map which returns collections of the specified type\n     * @see MultiValueMap\n     * @since 3.2\n     * @deprecated since 4.1, use {@link MultiValuedMap} instead\n     ",
      "child_ranges": [
        "(line 1466,col 9)-(line 1466,col 65)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.MapUtils.multiValueMap(java.util.Map\u003cK, C\u003e, org.apache.commons.collections4.Factory\u003cC\u003e)",
      "begin_line": 1484,
      "end_line": 1488,
      "comment": "\n     * Creates a multi-value map backed by the given map which returns\n     * collections created by the specified collection factory.\n     *\n     * @param \u003cK\u003e  the key type\n     * @param \u003cV\u003e  the value type\n     * @param \u003cC\u003e  the collection class type\n     * @param map  the map to decorate\n     * @param collectionFactory  a factor which creates collection objects\n     * @return a multi-value map backed by the given map which returns collections\n     *   created by the specified collection factory\n     * @see MultiValueMap\n     * @since 3.2\n     * @deprecated since 4.1, use {@link MultiValuedMap} instead\n     ",
      "child_ranges": [
        "(line 1487,col 9)-(line 1487,col 67)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.MapUtils.synchronizedSortedMap(java.util.SortedMap\u003cK, V\u003e)",
      "begin_line": 1517,
      "end_line": 1519,
      "comment": "\n     * Returns a synchronized sorted map backed by the given sorted map.\n     * \u003cp\u003e\n     * You must manually synchronize on the returned buffer\u0027s iterator to\n     * avoid non-deterministic behavior:\n     *\n     * \u003cpre\u003e\n     * Map m \u003d MapUtils.synchronizedSortedMap(myMap);\n     * Set s \u003d m.keySet();  // outside synchronized block\n     * synchronized (m) {  // synchronized on MAP!\n     *     Iterator i \u003d s.iterator();\n     *     while (i.hasNext()) {\n     *         process (i.next());\n     *     }\n     * }\n     * \u003c/pre\u003e\n     *\n     * This method uses the implementation in {@link java.util.Collections Collections}.\n     *\n     * @param \u003cK\u003e  the key type\n     * @param \u003cV\u003e  the value type\n     * @param map  the map to synchronize, must not be null\n     * @return a synchronized map backed by the given map\n     * @throws IllegalArgumentException  if the map is null\n     ",
      "child_ranges": [
        "(line 1518,col 9)-(line 1518,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.MapUtils.unmodifiableSortedMap(java.util.SortedMap\u003cK, ? extends V\u003e)",
      "begin_line": 1532,
      "end_line": 1534,
      "comment": "\n     * Returns an unmodifiable sorted map backed by the given sorted map.\n     * \u003cp\u003e\n     * This method uses the implementation in the decorators subpackage.\n     *\n     * @param \u003cK\u003e  the key type\n     * @param \u003cV\u003e  the value type\n     * @param map  the sorted map to make unmodifiable, must not be null\n     * @return an unmodifiable map backed by the given map\n     * @throws IllegalArgumentException  if the map is null\n     ",
      "child_ranges": [
        "(line 1533,col 9)-(line 1533,col 64)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.MapUtils.predicatedSortedMap(java.util.SortedMap\u003cK, V\u003e, org.apache.commons.collections4.Predicate\u003c? super K\u003e, org.apache.commons.collections4.Predicate\u003c? super V\u003e)",
      "begin_line": 1553,
      "end_line": 1556,
      "comment": "\n     * Returns a predicated (validating) sorted map backed by the given map.\n     * \u003cp\u003e\n     * Only objects that pass the tests in the given predicates can be added to the map.\n     * Trying to add an invalid object results in an IllegalArgumentException.\n     * Keys must pass the key predicate, values must pass the value predicate.\n     * It is important not to use the original map after invoking this method,\n     * as it is a backdoor for adding invalid objects.\n     *\n     * @param \u003cK\u003e  the key type\n     * @param \u003cV\u003e  the value type\n     * @param map  the map to predicate, must not be null\n     * @param keyPred  the predicate for keys, null means no check\n     * @param valuePred  the predicate for values, null means no check\n     * @return a predicated map backed by the given map\n     * @throws IllegalArgumentException  if the SortedMap is null\n     ",
      "child_ranges": [
        "(line 1555,col 9)-(line 1555,col 80)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.MapUtils.transformedSortedMap(java.util.SortedMap\u003cK, V\u003e, org.apache.commons.collections4.Transformer\u003c? super K, ? extends K\u003e, org.apache.commons.collections4.Transformer\u003c? super V, ? extends V\u003e)",
      "begin_line": 1581,
      "end_line": 1585,
      "comment": "\n     * Returns a transformed sorted map backed by the given map.\n     * \u003cp\u003e\n     * This method returns a new sorted map (decorating the specified map) that\n     * will transform any new entries added to it.\n     * Existing entries in the specified map will not be transformed.\n     * If you want that behaviour, see {@link TransformedSortedMap#transformedSortedMap}.\n     * \u003cp\u003e\n     * Each object is passed through the transformers as it is added to the\n     * Map. It is important not to use the original map after invoking this\n     * method, as it is a backdoor for adding untransformed objects.\n     * \u003cp\u003e\n     * If there are any elements already in the map being decorated, they\n     * are NOT transformed.\n     *\n     * @param \u003cK\u003e  the key type\n     * @param \u003cV\u003e  the value type\n     * @param map  the map to transform, must not be null, typically empty\n     * @param keyTransformer  the transformer for the map keys, null means no transformation\n     * @param valueTransformer  the transformer for the map values, null means no transformation\n     * @return a transformed map backed by the given map\n     * @throws IllegalArgumentException  if the SortedMap is null\n     ",
      "child_ranges": [
        "(line 1584,col 9)-(line 1584,col 97)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.MapUtils.fixedSizeSortedMap(java.util.SortedMap\u003cK, V\u003e)",
      "begin_line": 1599,
      "end_line": 1601,
      "comment": "\n     * Returns a fixed-sized sorted map backed by the given sorted map.\n     * Elements may not be added or removed from the returned map, but\n     * existing elements can be changed (for instance, via the\n     * {@link Map#put(Object,Object)} method).\n     *\n     * @param \u003cK\u003e  the key type\n     * @param \u003cV\u003e  the value type\n     * @param map  the map whose size to fix, must not be null\n     * @return a fixed-size map backed by that map\n     * @throws IllegalArgumentException  if the SortedMap is null\n     ",
      "child_ranges": [
        "(line 1600,col 9)-(line 1600,col 58)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.MapUtils.lazySortedMap(java.util.SortedMap\u003cK, V\u003e, org.apache.commons.collections4.Factory\u003c? extends V\u003e)",
      "begin_line": 1634,
      "end_line": 1636,
      "comment": "\n     * Returns a \"lazy\" sorted map whose values will be created on demand.\n     * \u003cp\u003e\n     * When the key passed to the returned map\u0027s {@link Map#get(Object)}\n     * method is not present in the map, then the factory will be used\n     * to create a new object and that object will become the value\n     * associated with that key.\n     * \u003cp\u003e\n     * For instance:\n     *\n     * \u003cpre\u003e\n     * Factory factory \u003d new Factory() {\n     *     public Object create() {\n     *         return new Date();\n     *     }\n     * }\n     * SortedMap lazy \u003d MapUtils.lazySortedMap(new TreeMap(), factory);\n     * Object obj \u003d lazy.get(\"test\");\n     * \u003c/pre\u003e\n     *\n     * After the above code is executed, \u003ccode\u003eobj\u003c/code\u003e will contain\n     * a new \u003ccode\u003eDate\u003c/code\u003e instance.  Furthermore, that \u003ccode\u003eDate\u003c/code\u003e\n     * instance is the value for the \u003ccode\u003e\"test\"\u003c/code\u003e key.\n     *\n     * @param \u003cK\u003e  the key type\n     * @param \u003cV\u003e  the value type\n     * @param map  the map to make lazy, must not be null\n     * @param factory  the factory for creating new objects, must not be null\n     * @return a lazy map backed by the given map\n     * @throws IllegalArgumentException  if the SortedMap or Factory is null\n     ",
      "child_ranges": [
        "(line 1635,col 9)-(line 1635,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.MapUtils.lazySortedMap(java.util.SortedMap\u003cK, V\u003e, org.apache.commons.collections4.Transformer\u003c? super K, ? extends V\u003e)",
      "begin_line": 1675,
      "end_line": 1678,
      "comment": "\n     * Returns a \"lazy\" sorted map whose values will be created on demand.\n     * \u003cp\u003e\n     * When the key passed to the returned map\u0027s {@link Map#get(Object)}\n     * method is not present in the map, then the factory will be used\n     * to create a new object and that object will become the value\n     * associated with that key. The factory is a {@link Transformer}\n     * that will be passed the key which it must transform into the value.\n     * \u003cp\u003e\n     * For instance:\n     * \u003cpre\u003e\n     * Transformer factory \u003d new Transformer() {\n     *     public Object transform(Object mapKey) {\n     *         return new File(mapKey);\n     *     }\n     * }\n     * SortedMap lazy \u003d MapUtils.lazySortedMap(new TreeMap(), factory);\n     * Object obj \u003d lazy.get(\"C:/dev\");\n     * \u003c/pre\u003e\n     *\n     * After the above code is executed, \u003ccode\u003eobj\u003c/code\u003e will contain\n     * a new \u003ccode\u003eFile\u003c/code\u003e instance for the C drive dev directory.\n     * Furthermore, that \u003ccode\u003eFile\u003c/code\u003e instance is the value for the\n     * \u003ccode\u003e\"C:/dev\"\u003c/code\u003e key in the map.\n     * \u003cp\u003e\n     * If a lazy map is wrapped by a synchronized map, the result is a simple\n     * synchronized cache. When an object is not is the cache, the cache itself\n     * calls back to the factory Transformer to populate itself, all within the\n     * same synchronized block.\n     *\n     * @param \u003cK\u003e  the key type\n     * @param \u003cV\u003e  the value type\n     * @param map  the map to make lazy, must not be null\n     * @param transformerFactory  the factory for creating new objects, must not be null\n     * @return a lazy map backed by the given map\n     * @throws IllegalArgumentException  if the Map or Transformer is null\n     ",
      "child_ranges": [
        "(line 1677,col 9)-(line 1677,col 68)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.MapUtils.populateMap(java.util.Map\u003cK, V\u003e, java.lang.Iterable\u003c? extends V\u003e, org.apache.commons.collections4.Transformer\u003cV, K\u003e)",
      "begin_line": 1691,
      "end_line": 1694,
      "comment": "\n     * Populates a Map using the supplied \u003ccode\u003eTransformer\u003c/code\u003e to transform the elements\n     * into keys, using the unaltered element as the value in the \u003ccode\u003eMap\u003c/code\u003e.\n     *\n     * @param \u003cK\u003e  the key type\n     * @param \u003cV\u003e  the value type\n     * @param map the \u003ccode\u003eMap\u003c/code\u003e to populate.\n     * @param elements the \u003ccode\u003eIterable\u003c/code\u003e containing the input values for the map.\n     * @param keyTransformer the \u003ccode\u003eTransformer\u003c/code\u003e used to transform the element into a key value\n     * @throws NullPointerException if the map, elements or transformer are null\n     ",
      "child_ranges": [
        "(line 1693,col 9)-(line 1693,col 89)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.MapUtils.populateMap(java.util.Map\u003cK, V\u003e, java.lang.Iterable\u003c? extends E\u003e, org.apache.commons.collections4.Transformer\u003cE, K\u003e, org.apache.commons.collections4.Transformer\u003cE, V\u003e)",
      "begin_line": 1709,
      "end_line": 1717,
      "comment": "\n     * Populates a Map using the supplied \u003ccode\u003eTransformer\u003c/code\u003es to transform the elements\n     * into keys and values.\n     *\n     * @param \u003cK\u003e  the key type\n     * @param \u003cV\u003e  the value type\n     * @param \u003cE\u003e  the type of object contained in the {@link Iterable}\n     * @param map the \u003ccode\u003eMap\u003c/code\u003e to populate.\n     * @param elements the \u003ccode\u003eIterable\u003c/code\u003e containing the input values for the map.\n     * @param keyTransformer the \u003ccode\u003eTransformer\u003c/code\u003e used to transform the element into a key value\n     * @param valueTransformer the \u003ccode\u003eTransformer\u003c/code\u003e used to transform the element into a value\n     * @throws NullPointerException if the map, elements or transformers are null\n     ",
      "child_ranges": [
        "(line 1712,col 9)-(line 1712,col 63)",
        "(line 1713,col 9)-(line 1716,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.MapUtils.populateMap(org.apache.commons.collections4.MultiMap\u003cK, V\u003e, java.lang.Iterable\u003c? extends V\u003e, org.apache.commons.collections4.Transformer\u003cV, K\u003e)",
      "begin_line": 1730,
      "end_line": 1733,
      "comment": "\n     * Populates a MultiMap using the supplied \u003ccode\u003eTransformer\u003c/code\u003e to transform the elements\n     * into keys, using the unaltered element as the value in the \u003ccode\u003eMultiMap\u003c/code\u003e.\n     *\n     * @param \u003cK\u003e  the key type\n     * @param \u003cV\u003e  the value type\n     * @param map the \u003ccode\u003eMultiMap\u003c/code\u003e to populate.\n     * @param elements the \u003ccode\u003eIterable\u003c/code\u003e to use as input values for the map.\n     * @param keyTransformer the \u003ccode\u003eTransformer\u003c/code\u003e used to transform the element into a key value\n     * @throws NullPointerException if the map, elements or transformer are null\n     ",
      "child_ranges": [
        "(line 1732,col 9)-(line 1732,col 89)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.MapUtils.populateMap(org.apache.commons.collections4.MultiMap\u003cK, V\u003e, java.lang.Iterable\u003c? extends E\u003e, org.apache.commons.collections4.Transformer\u003cE, K\u003e, org.apache.commons.collections4.Transformer\u003cE, V\u003e)",
      "begin_line": 1748,
      "end_line": 1756,
      "comment": "\n     * Populates a MultiMap using the supplied \u003ccode\u003eTransformer\u003c/code\u003es to transform the elements\n     * into keys and values.\n     *\n     * @param \u003cK\u003e  the key type\n     * @param \u003cV\u003e  the value type\n     * @param \u003cE\u003e  the type of object contained in the {@link Iterable}\n     * @param map the \u003ccode\u003eMultiMap\u003c/code\u003e to populate.\n     * @param elements the \u003ccode\u003eIterable\u003c/code\u003e containing the input values for the map.\n     * @param keyTransformer the \u003ccode\u003eTransformer\u003c/code\u003e used to transform the element into a key value\n     * @param valueTransformer the \u003ccode\u003eTransformer\u003c/code\u003e used to transform the element into a value\n     * @throws NullPointerException if the map, collection or transformers are null\n     ",
      "child_ranges": [
        "(line 1751,col 9)-(line 1751,col 63)",
        "(line 1752,col 9)-(line 1755,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.MapUtils.iterableMap(java.util.Map\u003cK, V\u003e)",
      "begin_line": 1767,
      "end_line": 1772,
      "comment": "\n     * Get the specified {@link Map} as an {@link IterableMap}.\n     *\n     * @param \u003cK\u003e  the key type\n     * @param \u003cV\u003e  the value type\n     * @param map to wrap if necessary.\n     * @return IterableMap\u003cK, V\u003e\n     * @since 4.0\n     ",
      "child_ranges": [
        "(line 1768,col 9)-(line 1770,col 9)",
        "(line 1771,col 9)-(line 1771,col 109)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.MapUtils.iterableSortedMap(java.util.SortedMap\u003cK, V\u003e)",
      "begin_line": 1783,
      "end_line": 1789,
      "comment": "\n     * Get the specified {@link SortedMap} as an {@link IterableSortedMap}.\n     *\n     * @param \u003cK\u003e  the key type\n     * @param \u003cV\u003e  the value type\n     * @param sortedMap to wrap if necessary\n     * @return {@link IterableSortedMap}\u003cK, V\u003e\n     * @since 4.0\n     ",
      "child_ranges": [
        "(line 1784,col 9)-(line 1786,col 9)",
        "(line 1787,col 9)-(line 1788,col 107)"
      ]
    }
  ]
}