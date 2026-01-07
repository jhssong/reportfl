{
  "filepath": "/tmp/Collections-27b/src/main/java/org/apache/commons/collections4/MapUtils.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "MapUtils",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 79,
      "end_line": 1797,
      "comment": "\n * Provides utility methods and decorators for\n * {@link Map} and {@link SortedMap} instances.\n * \u003cp\u003e\n * It contains various type safe methods\n * as well as other useful features like deep copying.\n * \u003cp\u003e\n * It also provides the following decorators:\n *\n *  \u003cul\u003e\n *  \u003cli\u003e{@link #fixedSizeMap(Map)}\n *  \u003cli\u003e{@link #fixedSizeSortedMap(SortedMap)}\n *  \u003cli\u003e{@link #lazyMap(Map,Factory)}\n *  \u003cli\u003e{@link #lazyMap(Map,Transformer)}\n *  \u003cli\u003e{@link #lazySortedMap(SortedMap,Factory)}\n *  \u003cli\u003e{@link #lazySortedMap(SortedMap,Transformer)}\n *  \u003cli\u003e{@link #predicatedMap(Map,Predicate,Predicate)}\n *  \u003cli\u003e{@link #predicatedSortedMap(SortedMap,Predicate,Predicate)}\n *  \u003cli\u003e{@link #transformedMap(Map, Transformer, Transformer)}\n *  \u003cli\u003e{@link #transformedSortedMap(SortedMap, Transformer, Transformer)}\n *  \u003cli\u003e{@link #multiValueMap( Map )}\n *  \u003cli\u003e{@link #multiValueMap( Map, Class )}\n *  \u003cli\u003e{@link #multiValueMap( Map, Factory )}\n *  \u003c/ul\u003e\n *\n * @since 1.0\n * @version $Id$\n "
    },
    {
      "type": "field",
      "varNames": [
        "EMPTY_SORTED_MAP"
      ],
      "begin_line": 86,
      "end_line": 88,
      "comment": "\n     * An empty unmodifiable sorted map.\n     * This is not provided in the JDK.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "INDENT_STRING"
      ],
      "begin_line": 93,
      "end_line": 93,
      "comment": "\n     * String used to indent the verbose and debug Map prints.\n     "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.collections4.MapUtils.MapUtils()",
      "begin_line": 98,
      "end_line": 98,
      "comment": "\n     * \u003ccode\u003eMapUtils\u003c/code\u003e should not normally be instantiated.\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.MapUtils.getObject(java.util.Map\u003c? super K, V\u003e, K)",
      "begin_line": 111,
      "end_line": 116,
      "comment": "\n     * Gets from a Map in a null-safe manner.\n     *\n     * @param \u003cK\u003e  the key type\n     * @param \u003cV\u003e  the value type\n     * @param map  the map to use\n     * @param key  the key to look up\n     * @return the value in the Map, \u003ccode\u003enull\u003c/code\u003e if null map input\n     ",
      "child_ranges": [
        "(line 112,col 9)-(line 114,col 9)",
        "(line 115,col 9)-(line 115,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.MapUtils.getString(java.util.Map\u003c? super K, ?\u003e, K)",
      "begin_line": 128,
      "end_line": 136,
      "comment": "\n     * Gets a String from a Map in a null-safe manner.\n     * \u003cp\u003e\n     * The String is obtained via \u003ccode\u003etoString\u003c/code\u003e.\n     *\n     * @param \u003cK\u003e  the key type\n     * @param map  the map to use\n     * @param key  the key to look up\n     * @return the value in the Map as a String, \u003ccode\u003enull\u003c/code\u003e if null map input\n     ",
      "child_ranges": [
        "(line 129,col 9)-(line 134,col 9)",
        "(line 135,col 9)-(line 135,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.MapUtils.getBoolean(java.util.Map\u003c? super K, ?\u003e, K)",
      "begin_line": 153,
      "end_line": 170,
      "comment": "\n     * Gets a Boolean from a Map in a null-safe manner.\n     * \u003cp\u003e\n     * If the value is a \u003ccode\u003eBoolean\u003c/code\u003e it is returned directly.\n     * If the value is a \u003ccode\u003eString\u003c/code\u003e and it equals \u0027true\u0027 ignoring case\n     * then \u003ccode\u003etrue\u003c/code\u003e is returned, otherwise \u003ccode\u003efalse\u003c/code\u003e.\n     * If the value is a \u003ccode\u003eNumber\u003c/code\u003e an integer zero value returns\n     * \u003ccode\u003efalse\u003c/code\u003e and non-zero returns \u003ccode\u003etrue\u003c/code\u003e.\n     * Otherwise, \u003ccode\u003enull\u003c/code\u003e is returned.\n     *\n     * @param \u003cK\u003e  the key type\n     * @param map  the map to use\n     * @param key  the key to look up\n     * @return the value in the Map as a Boolean, \u003ccode\u003enull\u003c/code\u003e if null map input\n     ",
      "child_ranges": [
        "(line 154,col 9)-(line 168,col 9)",
        "(line 169,col 9)-(line 169,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.MapUtils.getNumber(java.util.Map\u003c? super K, ?\u003e, K)",
      "begin_line": 186,
      "end_line": 204,
      "comment": "\n     * Gets a Number from a Map in a null-safe manner.\n     * \u003cp\u003e\n     * If the value is a \u003ccode\u003eNumber\u003c/code\u003e it is returned directly.\n     * If the value is a \u003ccode\u003eString\u003c/code\u003e it is converted using\n     * {@link NumberFormat#parse(String)} on the system default formatter\n     * returning \u003ccode\u003enull\u003c/code\u003e if the conversion fails.\n     * Otherwise, \u003ccode\u003enull\u003c/code\u003e is returned.\n     *\n     * @param \u003cK\u003e  the key type\n     * @param map  the map to use\n     * @param key  the key to look up\n     * @return the value in the Map as a Number, \u003ccode\u003enull\u003c/code\u003e if null map input\n     ",
      "child_ranges": [
        "(line 187,col 9)-(line 202,col 9)",
        "(line 203,col 9)-(line 203,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.MapUtils.getByte(java.util.Map\u003c? super K, ?\u003e, K)",
      "begin_line": 216,
      "end_line": 225,
      "comment": "\n     * Gets a Byte from a Map in a null-safe manner.\n     * \u003cp\u003e\n     * The Byte is obtained from the results of {@link #getNumber(Map,Object)}.\n     *\n     * @param \u003cK\u003e  the key type\n     * @param map  the map to use\n     * @param key  the key to look up\n     * @return the value in the Map as a Byte, \u003ccode\u003enull\u003c/code\u003e if null map input\n     ",
      "child_ranges": [
        "(line 217,col 9)-(line 217,col 50)",
        "(line 218,col 9)-(line 220,col 9)",
        "(line 221,col 9)-(line 223,col 9)",
        "(line 224,col 9)-(line 224,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.MapUtils.getShort(java.util.Map\u003c? super K, ?\u003e, K)",
      "begin_line": 237,
      "end_line": 246,
      "comment": "\n     * Gets a Short from a Map in a null-safe manner.\n     * \u003cp\u003e\n     * The Short is obtained from the results of {@link #getNumber(Map,Object)}.\n     *\n     * @param \u003cK\u003e  the key type\n     * @param map  the map to use\n     * @param key  the key to look up\n     * @return the value in the Map as a Short, \u003ccode\u003enull\u003c/code\u003e if null map input\n     ",
      "child_ranges": [
        "(line 238,col 9)-(line 238,col 50)",
        "(line 239,col 9)-(line 241,col 9)",
        "(line 242,col 9)-(line 244,col 9)",
        "(line 245,col 9)-(line 245,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.MapUtils.getInteger(java.util.Map\u003c? super K, ?\u003e, K)",
      "begin_line": 258,
      "end_line": 267,
      "comment": "\n     * Gets a Integer from a Map in a null-safe manner.\n     * \u003cp\u003e\n     * The Integer is obtained from the results of {@link #getNumber(Map,Object)}.\n     *\n     * @param \u003cK\u003e  the key type\n     * @param map  the map to use\n     * @param key  the key to look up\n     * @return the value in the Map as a Integer, \u003ccode\u003enull\u003c/code\u003e if null map input\n     ",
      "child_ranges": [
        "(line 259,col 9)-(line 259,col 50)",
        "(line 260,col 9)-(line 262,col 9)",
        "(line 263,col 9)-(line 265,col 9)",
        "(line 266,col 9)-(line 266,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.MapUtils.getLong(java.util.Map\u003c? super K, ?\u003e, K)",
      "begin_line": 279,
      "end_line": 288,
      "comment": "\n     * Gets a Long from a Map in a null-safe manner.\n     * \u003cp\u003e\n     * The Long is obtained from the results of {@link #getNumber(Map,Object)}.\n     *\n     * @param \u003cK\u003e  the key type\n     * @param map  the map to use\n     * @param key  the key to look up\n     * @return the value in the Map as a Long, \u003ccode\u003enull\u003c/code\u003e if null map input\n     ",
      "child_ranges": [
        "(line 280,col 9)-(line 280,col 50)",
        "(line 281,col 9)-(line 283,col 9)",
        "(line 284,col 9)-(line 286,col 9)",
        "(line 287,col 9)-(line 287,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.MapUtils.getFloat(java.util.Map\u003c? super K, ?\u003e, K)",
      "begin_line": 300,
      "end_line": 309,
      "comment": "\n     * Gets a Float from a Map in a null-safe manner.\n     * \u003cp\u003e\n     * The Float is obtained from the results of {@link #getNumber(Map,Object)}.\n     *\n     * @param \u003cK\u003e  the key type\n     * @param map  the map to use\n     * @param key  the key to look up\n     * @return the value in the Map as a Float, \u003ccode\u003enull\u003c/code\u003e if null map input\n     ",
      "child_ranges": [
        "(line 301,col 9)-(line 301,col 50)",
        "(line 302,col 9)-(line 304,col 9)",
        "(line 305,col 9)-(line 307,col 9)",
        "(line 308,col 9)-(line 308,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.MapUtils.getDouble(java.util.Map\u003c? super K, ?\u003e, K)",
      "begin_line": 321,
      "end_line": 330,
      "comment": "\n     * Gets a Double from a Map in a null-safe manner.\n     * \u003cp\u003e\n     * The Double is obtained from the results of {@link #getNumber(Map,Object)}.\n     *\n     * @param \u003cK\u003e  the key type\n     * @param map  the map to use\n     * @param key  the key to look up\n     * @return the value in the Map as a Double, \u003ccode\u003enull\u003c/code\u003e if null map input\n     ",
      "child_ranges": [
        "(line 322,col 9)-(line 322,col 50)",
        "(line 323,col 9)-(line 325,col 9)",
        "(line 326,col 9)-(line 328,col 9)",
        "(line 329,col 9)-(line 329,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.MapUtils.getMap(java.util.Map\u003c? super K, ?\u003e, K)",
      "begin_line": 343,
      "end_line": 351,
      "comment": "\n     * Gets a Map from a Map in a null-safe manner.\n     * \u003cp\u003e\n     * If the value returned from the specified map is not a Map then\n     * \u003ccode\u003enull\u003c/code\u003e is returned.\n     *\n     * @param \u003cK\u003e  the key type\n     * @param map  the map to use\n     * @param key  the key to look up\n     * @return the value in the Map as a Map, \u003ccode\u003enull\u003c/code\u003e if null map input\n     ",
      "child_ranges": [
        "(line 344,col 9)-(line 349,col 9)",
        "(line 350,col 9)-(line 350,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.MapUtils.getObject(java.util.Map\u003cK, V\u003e, K, V)",
      "begin_line": 367,
      "end_line": 375,
      "comment": "\n     * Looks up the given key in the given map, converting null into the\n     * given default value.\n     *\n     * @param \u003cK\u003e  the key type\n     * @param \u003cV\u003e  the value type\n     * @param map  the map whose value to look up\n     * @param key  the key of the value to look up in that map\n     * @param defaultValue  what to return if the value is null\n     * @return  the value in the map, or defaultValue if the original value\n     *   is null or the map is null\n     ",
      "child_ranges": [
        "(line 368,col 9)-(line 373,col 9)",
        "(line 374,col 9)-(line 374,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.MapUtils.getString(java.util.Map\u003c? super K, ?\u003e, K, java.lang.String)",
      "begin_line": 389,
      "end_line": 395,
      "comment": "\n     * Looks up the given key in the given map, converting the result into\n     * a string, using the default value if the the conversion fails.\n     *\n     * @param \u003cK\u003e  the key type\n     * @param map  the map whose value to look up\n     * @param key  the key of the value to look up in that map\n     * @param defaultValue  what to return if the value is null or if the\n     *   conversion fails\n     * @return  the value in the map as a string, or defaultValue if the\n     *   original value is null, the map is null or the string conversion fails\n     ",
      "child_ranges": [
        "(line 390,col 9)-(line 390,col 44)",
        "(line 391,col 9)-(line 393,col 9)",
        "(line 394,col 9)-(line 394,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.MapUtils.getBoolean(java.util.Map\u003c? super K, ?\u003e, K, java.lang.Boolean)",
      "begin_line": 409,
      "end_line": 415,
      "comment": "\n     * Looks up the given key in the given map, converting the result into\n     * a boolean, using the default value if the the conversion fails.\n     *\n     * @param \u003cK\u003e  the key type\n     * @param map  the map whose value to look up\n     * @param key  the key of the value to look up in that map\n     * @param defaultValue  what to return if the value is null or if the\n     *   conversion fails\n     * @return  the value in the map as a boolean, or defaultValue if the\n     *   original value is null, the map is null or the boolean conversion fails\n     ",
      "child_ranges": [
        "(line 410,col 9)-(line 410,col 46)",
        "(line 411,col 9)-(line 413,col 9)",
        "(line 414,col 9)-(line 414,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.MapUtils.getNumber(java.util.Map\u003c? super K, ?\u003e, K, java.lang.Number)",
      "begin_line": 429,
      "end_line": 435,
      "comment": "\n     * Looks up the given key in the given map, converting the result into\n     * a number, using the default value if the the conversion fails.\n     *\n     * @param \u003cK\u003e  the key type\n     * @param map  the map whose value to look up\n     * @param key  the key of the value to look up in that map\n     * @param defaultValue  what to return if the value is null or if the\n     *   conversion fails\n     * @return  the value in the map as a number, or defaultValue if the\n     *   original value is null, the map is null or the number conversion fails\n     ",
      "child_ranges": [
        "(line 430,col 9)-(line 430,col 44)",
        "(line 431,col 9)-(line 433,col 9)",
        "(line 434,col 9)-(line 434,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.MapUtils.getByte(java.util.Map\u003c? super K, ?\u003e, K, java.lang.Byte)",
      "begin_line": 449,
      "end_line": 455,
      "comment": "\n     * Looks up the given key in the given map, converting the result into\n     * a byte, using the default value if the the conversion fails.\n     *\n     * @param \u003cK\u003e  the key type\n     * @param map  the map whose value to look up\n     * @param key  the key of the value to look up in that map\n     * @param defaultValue  what to return if the value is null or if the\n     *   conversion fails\n     * @return  the value in the map as a number, or defaultValue if the\n     *   original value is null, the map is null or the number conversion fails\n     ",
      "child_ranges": [
        "(line 450,col 9)-(line 450,col 40)",
        "(line 451,col 9)-(line 453,col 9)",
        "(line 454,col 9)-(line 454,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.MapUtils.getShort(java.util.Map\u003c? super K, ?\u003e, K, java.lang.Short)",
      "begin_line": 469,
      "end_line": 475,
      "comment": "\n     * Looks up the given key in the given map, converting the result into\n     * a short, using the default value if the the conversion fails.\n     *\n     * @param \u003cK\u003e  the key type\n     * @param map  the map whose value to look up\n     * @param key  the key of the value to look up in that map\n     * @param defaultValue  what to return if the value is null or if the\n     *   conversion fails\n     * @return  the value in the map as a number, or defaultValue if the\n     *   original value is null, the map is null or the number conversion fails\n     ",
      "child_ranges": [
        "(line 470,col 9)-(line 470,col 42)",
        "(line 471,col 9)-(line 473,col 9)",
        "(line 474,col 9)-(line 474,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.MapUtils.getInteger(java.util.Map\u003c? super K, ?\u003e, K, java.lang.Integer)",
      "begin_line": 489,
      "end_line": 495,
      "comment": "\n     * Looks up the given key in the given map, converting the result into\n     * an integer, using the default value if the the conversion fails.\n     *\n     * @param \u003cK\u003e  the key type\n     * @param map  the map whose value to look up\n     * @param key  the key of the value to look up in that map\n     * @param defaultValue  what to return if the value is null or if the\n     *   conversion fails\n     * @return  the value in the map as a number, or defaultValue if the\n     *   original value is null, the map is null or the number conversion fails\n     ",
      "child_ranges": [
        "(line 490,col 9)-(line 490,col 46)",
        "(line 491,col 9)-(line 493,col 9)",
        "(line 494,col 9)-(line 494,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.MapUtils.getLong(java.util.Map\u003c? super K, ?\u003e, K, java.lang.Long)",
      "begin_line": 509,
      "end_line": 515,
      "comment": "\n     * Looks up the given key in the given map, converting the result into\n     * a long, using the default value if the the conversion fails.\n     *\n     * @param \u003cK\u003e  the key type\n     * @param map  the map whose value to look up\n     * @param key  the key of the value to look up in that map\n     * @param defaultValue  what to return if the value is null or if the\n     *   conversion fails\n     * @return  the value in the map as a number, or defaultValue if the\n     *   original value is null, the map is null or the number conversion fails\n     ",
      "child_ranges": [
        "(line 510,col 9)-(line 510,col 40)",
        "(line 511,col 9)-(line 513,col 9)",
        "(line 514,col 9)-(line 514,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.MapUtils.getFloat(java.util.Map\u003c? super K, ?\u003e, K, java.lang.Float)",
      "begin_line": 529,
      "end_line": 535,
      "comment": "\n     * Looks up the given key in the given map, converting the result into\n     * a float, using the default value if the the conversion fails.\n     *\n     * @param \u003cK\u003e  the key type\n     * @param map  the map whose value to look up\n     * @param key  the key of the value to look up in that map\n     * @param defaultValue  what to return if the value is null or if the\n     *   conversion fails\n     * @return  the value in the map as a number, or defaultValue if the\n     *   original value is null, the map is null or the number conversion fails\n     ",
      "child_ranges": [
        "(line 530,col 9)-(line 530,col 42)",
        "(line 531,col 9)-(line 533,col 9)",
        "(line 534,col 9)-(line 534,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.MapUtils.getDouble(java.util.Map\u003c? super K, ?\u003e, K, java.lang.Double)",
      "begin_line": 549,
      "end_line": 555,
      "comment": "\n     * Looks up the given key in the given map, converting the result into\n     * a double, using the default value if the the conversion fails.\n     *\n     * @param \u003cK\u003e  the key type\n     * @param map  the map whose value to look up\n     * @param key  the key of the value to look up in that map\n     * @param defaultValue  what to return if the value is null or if the\n     *   conversion fails\n     * @return  the value in the map as a number, or defaultValue if the\n     *   original value is null, the map is null or the number conversion fails\n     ",
      "child_ranges": [
        "(line 550,col 9)-(line 550,col 44)",
        "(line 551,col 9)-(line 553,col 9)",
        "(line 554,col 9)-(line 554,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.MapUtils.getMap(java.util.Map\u003c? super K, ?\u003e, K, java.util.Map\u003c?, ?\u003e)",
      "begin_line": 569,
      "end_line": 575,
      "comment": "\n     * Looks up the given key in the given map, converting the result into\n     * a map, using the default value if the the conversion fails.\n     *\n     * @param \u003cK\u003e  the key type\n     * @param map  the map whose value to look up\n     * @param key  the key of the value to look up in that map\n     * @param defaultValue  what to return if the value is null or if the\n     *   conversion fails\n     * @return  the value in the map as a number, or defaultValue if the\n     *   original value is null, the map is null or the map conversion fails\n     ",
      "child_ranges": [
        "(line 570,col 9)-(line 570,col 44)",
        "(line 571,col 9)-(line 573,col 9)",
        "(line 574,col 9)-(line 574,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.MapUtils.getBooleanValue(java.util.Map\u003c? super K, ?\u003e, K)",
      "begin_line": 594,
      "end_line": 596,
      "comment": "\n     * Gets a boolean from a Map in a null-safe manner.\n     * \u003cp\u003e\n     * If the value is a \u003ccode\u003eBoolean\u003c/code\u003e its value is returned.\n     * If the value is a \u003ccode\u003eString\u003c/code\u003e and it equals \u0027true\u0027 ignoring case\n     * then \u003ccode\u003etrue\u003c/code\u003e is returned, otherwise \u003ccode\u003efalse\u003c/code\u003e.\n     * If the value is a \u003ccode\u003eNumber\u003c/code\u003e an integer zero value returns\n     * \u003ccode\u003efalse\u003c/code\u003e and non-zero returns \u003ccode\u003etrue\u003c/code\u003e.\n     * Otherwise, \u003ccode\u003efalse\u003c/code\u003e is returned.\n     *\n     * @param \u003cK\u003e  the key type\n     * @param map  the map to use\n     * @param key  the key to look up\n     * @return the value in the Map as a Boolean, \u003ccode\u003efalse\u003c/code\u003e if null map input\n     ",
      "child_ranges": [
        "(line 595,col 9)-(line 595,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.MapUtils.getByteValue(java.util.Map\u003c? super K, ?\u003e, K)",
      "begin_line": 608,
      "end_line": 614,
      "comment": "\n     * Gets a byte from a Map in a null-safe manner.\n     * \u003cp\u003e\n     * The byte is obtained from the results of {@link #getNumber(Map,Object)}.\n     *\n     * @param \u003cK\u003e  the key type\n     * @param map  the map to use\n     * @param key  the key to look up\n     * @return the value in the Map as a byte, \u003ccode\u003e0\u003c/code\u003e if null map input\n     ",
      "child_ranges": [
        "(line 609,col 9)-(line 609,col 50)",
        "(line 610,col 9)-(line 612,col 9)",
        "(line 613,col 9)-(line 613,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.MapUtils.getShortValue(java.util.Map\u003c? super K, ?\u003e, K)",
      "begin_line": 626,
      "end_line": 632,
      "comment": "\n     * Gets a short from a Map in a null-safe manner.\n     * \u003cp\u003e\n     * The short is obtained from the results of {@link #getNumber(Map,Object)}.\n     *\n     * @param \u003cK\u003e  the key type\n     * @param map  the map to use\n     * @param key  the key to look up\n     * @return the value in the Map as a short, \u003ccode\u003e0\u003c/code\u003e if null map input\n     ",
      "child_ranges": [
        "(line 627,col 9)-(line 627,col 53)",
        "(line 628,col 9)-(line 630,col 9)",
        "(line 631,col 9)-(line 631,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.MapUtils.getIntValue(java.util.Map\u003c? super K, ?\u003e, K)",
      "begin_line": 644,
      "end_line": 650,
      "comment": "\n     * Gets an int from a Map in a null-safe manner.\n     * \u003cp\u003e\n     * The int is obtained from the results of {@link #getNumber(Map,Object)}.\n     *\n     * @param \u003cK\u003e  the key type\n     * @param map  the map to use\n     * @param key  the key to look up\n     * @return the value in the Map as an int, \u003ccode\u003e0\u003c/code\u003e if null map input\n     ",
      "child_ranges": [
        "(line 645,col 9)-(line 645,col 59)",
        "(line 646,col 9)-(line 648,col 9)",
        "(line 649,col 9)-(line 649,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.MapUtils.getLongValue(java.util.Map\u003c? super K, ?\u003e, K)",
      "begin_line": 662,
      "end_line": 668,
      "comment": "\n     * Gets a long from a Map in a null-safe manner.\n     * \u003cp\u003e\n     * The long is obtained from the results of {@link #getNumber(Map,Object)}.\n     *\n     * @param \u003cK\u003e  the key type\n     * @param map  the map to use\n     * @param key  the key to look up\n     * @return the value in the Map as a long, \u003ccode\u003e0L\u003c/code\u003e if null map input\n     ",
      "child_ranges": [
        "(line 663,col 9)-(line 663,col 50)",
        "(line 664,col 9)-(line 666,col 9)",
        "(line 667,col 9)-(line 667,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.MapUtils.getFloatValue(java.util.Map\u003c? super K, ?\u003e, K)",
      "begin_line": 680,
      "end_line": 686,
      "comment": "\n     * Gets a float from a Map in a null-safe manner.\n     * \u003cp\u003e\n     * The float is obtained from the results of {@link #getNumber(Map,Object)}.\n     *\n     * @param \u003cK\u003e  the key type\n     * @param map  the map to use\n     * @param key  the key to look up\n     * @return the value in the Map as a float, \u003ccode\u003e0.0F\u003c/code\u003e if null map input\n     ",
      "child_ranges": [
        "(line 681,col 9)-(line 681,col 53)",
        "(line 682,col 9)-(line 684,col 9)",
        "(line 685,col 9)-(line 685,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.MapUtils.getDoubleValue(java.util.Map\u003c? super K, ?\u003e, K)",
      "begin_line": 698,
      "end_line": 704,
      "comment": "\n     * Gets a double from a Map in a null-safe manner.\n     * \u003cp\u003e\n     * The double is obtained from the results of {@link #getNumber(Map,Object)}.\n     *\n     * @param \u003cK\u003e  the key type\n     * @param map  the map to use\n     * @param key  the key to look up\n     * @return the value in the Map as a double, \u003ccode\u003e0.0\u003c/code\u003e if null map input\n     ",
      "child_ranges": [
        "(line 699,col 9)-(line 699,col 56)",
        "(line 700,col 9)-(line 702,col 9)",
        "(line 703,col 9)-(line 703,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.MapUtils.getBooleanValue(java.util.Map\u003c? super K, ?\u003e, K, boolean)",
      "begin_line": 725,
      "end_line": 731,
      "comment": "\n     * Gets a boolean from a Map in a null-safe manner,\n     * using the default value if the the conversion fails.\n     * \u003cp\u003e\n     * If the value is a \u003ccode\u003eBoolean\u003c/code\u003e its value is returned.\n     * If the value is a \u003ccode\u003eString\u003c/code\u003e and it equals \u0027true\u0027 ignoring case\n     * then \u003ccode\u003etrue\u003c/code\u003e is returned, otherwise \u003ccode\u003efalse\u003c/code\u003e.\n     * If the value is a \u003ccode\u003eNumber\u003c/code\u003e an integer zero value returns\n     * \u003ccode\u003efalse\u003c/code\u003e and non-zero returns \u003ccode\u003etrue\u003c/code\u003e.\n     * Otherwise, \u003ccode\u003edefaultValue\u003c/code\u003e is returned.\n     *\n     * @param \u003cK\u003e  the key type\n     * @param map  the map to use\n     * @param key  the key to look up\n     * @param defaultValue  return if the value is null or if the conversion fails\n     * @return the value in the Map as a Boolean, \u003ccode\u003edefaultValue\u003c/code\u003e if null map input\n     ",
      "child_ranges": [
        "(line 726,col 9)-(line 726,col 59)",
        "(line 727,col 9)-(line 729,col 9)",
        "(line 730,col 9)-(line 730,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.MapUtils.getByteValue(java.util.Map\u003c? super K, ?\u003e, K, byte)",
      "begin_line": 745,
      "end_line": 751,
      "comment": "\n     * Gets a byte from a Map in a null-safe manner,\n     * using the default value if the the conversion fails.\n     * \u003cp\u003e\n     * The byte is obtained from the results of {@link #getNumber(Map,Object)}.\n     *\n     * @param \u003cK\u003e  the key type\n     * @param map  the map to use\n     * @param key  the key to look up\n     * @param defaultValue  return if the value is null or if the conversion fails\n     * @return the value in the Map as a byte, \u003ccode\u003edefaultValue\u003c/code\u003e if null map input\n     ",
      "child_ranges": [
        "(line 746,col 9)-(line 746,col 50)",
        "(line 747,col 9)-(line 749,col 9)",
        "(line 750,col 9)-(line 750,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.MapUtils.getShortValue(java.util.Map\u003c? super K, ?\u003e, K, short)",
      "begin_line": 765,
      "end_line": 771,
      "comment": "\n     * Gets a short from a Map in a null-safe manner,\n     * using the default value if the the conversion fails.\n     * \u003cp\u003e\n     * The short is obtained from the results of {@link #getNumber(Map,Object)}.\n     *\n     * @param \u003cK\u003e  the key type\n     * @param map  the map to use\n     * @param key  the key to look up\n     * @param defaultValue  return if the value is null or if the conversion fails\n     * @return the value in the Map as a short, \u003ccode\u003edefaultValue\u003c/code\u003e if null map input\n     ",
      "child_ranges": [
        "(line 766,col 9)-(line 766,col 53)",
        "(line 767,col 9)-(line 769,col 9)",
        "(line 770,col 9)-(line 770,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.MapUtils.getIntValue(java.util.Map\u003c? super K, ?\u003e, K, int)",
      "begin_line": 785,
      "end_line": 791,
      "comment": "\n     * Gets an int from a Map in a null-safe manner,\n     * using the default value if the the conversion fails.\n     * \u003cp\u003e\n     * The int is obtained from the results of {@link #getNumber(Map,Object)}.\n     *\n     * @param \u003cK\u003e  the key type\n     * @param map  the map to use\n     * @param key  the key to look up\n     * @param defaultValue  return if the value is null or if the conversion fails\n     * @return the value in the Map as an int, \u003ccode\u003edefaultValue\u003c/code\u003e if null map input\n     ",
      "child_ranges": [
        "(line 786,col 9)-(line 786,col 59)",
        "(line 787,col 9)-(line 789,col 9)",
        "(line 790,col 9)-(line 790,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.MapUtils.getLongValue(java.util.Map\u003c? super K, ?\u003e, K, long)",
      "begin_line": 805,
      "end_line": 811,
      "comment": "\n     * Gets a long from a Map in a null-safe manner,\n     * using the default value if the the conversion fails.\n     * \u003cp\u003e\n     * The long is obtained from the results of {@link #getNumber(Map,Object)}.\n     *\n     * @param \u003cK\u003e  the key type\n     * @param map  the map to use\n     * @param key  the key to look up\n     * @param defaultValue  return if the value is null or if the conversion fails\n     * @return the value in the Map as a long, \u003ccode\u003edefaultValue\u003c/code\u003e if null map input\n     ",
      "child_ranges": [
        "(line 806,col 9)-(line 806,col 50)",
        "(line 807,col 9)-(line 809,col 9)",
        "(line 810,col 9)-(line 810,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.MapUtils.getFloatValue(java.util.Map\u003c? super K, ?\u003e, K, float)",
      "begin_line": 825,
      "end_line": 831,
      "comment": "\n     * Gets a float from a Map in a null-safe manner,\n     * using the default value if the the conversion fails.\n     * \u003cp\u003e\n     * The float is obtained from the results of {@link #getNumber(Map,Object)}.\n     *\n     * @param \u003cK\u003e  the key type\n     * @param map  the map to use\n     * @param key  the key to look up\n     * @param defaultValue  return if the value is null or if the conversion fails\n     * @return the value in the Map as a float, \u003ccode\u003edefaultValue\u003c/code\u003e if null map input\n     ",
      "child_ranges": [
        "(line 826,col 9)-(line 826,col 53)",
        "(line 827,col 9)-(line 829,col 9)",
        "(line 830,col 9)-(line 830,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.MapUtils.getDoubleValue(java.util.Map\u003c? super K, ?\u003e, K, double)",
      "begin_line": 845,
      "end_line": 851,
      "comment": "\n     * Gets a double from a Map in a null-safe manner,\n     * using the default value if the the conversion fails.\n     * \u003cp\u003e\n     * The double is obtained from the results of {@link #getNumber(Map,Object)}.\n     *\n     * @param \u003cK\u003e  the key type\n     * @param map  the map to use\n     * @param key  the key to look up\n     * @param defaultValue  return if the value is null or if the conversion fails\n     * @return the value in the Map as a double, \u003ccode\u003edefaultValue\u003c/code\u003e if null map input\n     ",
      "child_ranges": [
        "(line 846,col 9)-(line 846,col 56)",
        "(line 847,col 9)-(line 849,col 9)",
        "(line 850,col 9)-(line 850,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.MapUtils.toProperties(java.util.Map\u003cK, V\u003e)",
      "begin_line": 869,
      "end_line": 880,
      "comment": "\n     * Gets a new Properties object initialised with the values from a Map.\n     * A null input will return an empty properties object.\n     * \u003cp\u003e\n     * A Properties object may only store non-null keys and values, thus if\n     * the provided map contains either a key or value which is {@code null},\n     * a {@link NullPointerException} will be thrown.\n     *\n     * @param \u003cK\u003e  the key type\n     * @param \u003cV\u003e  the value type\n     * @param map  the map to convert to a Properties object\n     * @return the properties object\n     * @throws NullPointerException if a key or value in the provided map is {@code null}\n     ",
      "child_ranges": [
        "(line 870,col 9)-(line 870,col 51)",
        "(line 871,col 9)-(line 878,col 9)",
        "(line 879,col 9)-(line 879,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.MapUtils.toMap(java.util.ResourceBundle)",
      "begin_line": 889,
      "end_line": 900,
      "comment": "\n     * Creates a new HashMap using data copied from a ResourceBundle.\n     *\n     * @param resourceBundle  the resource bundle to convert, may not be null\n     * @return the hashmap containing the data\n     * @throws NullPointerException if the bundle is null\n     ",
      "child_ranges": [
        "(line 890,col 9)-(line 890,col 73)",
        "(line 891,col 9)-(line 891,col 70)",
        "(line 893,col 9)-(line 897,col 9)",
        "(line 899,col 9)-(line 899,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.MapUtils.verbosePrint(java.io.PrintStream, java.lang.Object, java.util.Map\u003c?, ?\u003e)",
      "begin_line": 922,
      "end_line": 924,
      "comment": "\n     * Prints the given map with nice line breaks.\n     * \u003cp\u003e\n     * This method prints a nicely formatted String describing the Map.\n     * Each map entry will be printed with key and value.\n     * When the value is a Map, recursive behaviour occurs.\n     * \u003cp\u003e\n     * This method is NOT thread-safe in any special way. You must manually\n     * synchronize on either this class or the stream as required.\n     *\n     * @param out  the stream to print to, must not be null\n     * @param label  The label to be used, may be \u003ccode\u003enull\u003c/code\u003e.\n     *  If \u003ccode\u003enull\u003c/code\u003e, the label is not output.\n     *  It typically represents the name of the property in a bean or similar.\n     * @param map  The map to print, may be \u003ccode\u003enull\u003c/code\u003e.\n     *  If \u003ccode\u003enull\u003c/code\u003e, the text \u0027null\u0027 is output.\n     * @throws NullPointerException if the stream is \u003ccode\u003enull\u003c/code\u003e\n     ",
      "child_ranges": [
        "(line 923,col 9)-(line 923,col 82)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.MapUtils.debugPrint(java.io.PrintStream, java.lang.Object, java.util.Map\u003c?, ?\u003e)",
      "begin_line": 944,
      "end_line": 946,
      "comment": "\n     * Prints the given map with nice line breaks.\n     * \u003cp\u003e\n     * This method prints a nicely formatted String describing the Map.\n     * Each map entry will be printed with key, value and value classname.\n     * When the value is a Map, recursive behaviour occurs.\n     * \u003cp\u003e\n     * This method is NOT thread-safe in any special way. You must manually\n     * synchronize on either this class or the stream as required.\n     *\n     * @param out  the stream to print to, must not be null\n     * @param label  The label to be used, may be \u003ccode\u003enull\u003c/code\u003e.\n     *   If \u003ccode\u003enull\u003c/code\u003e, the label is not output.\n     *   It typically represents the name of the property in a bean or similar.\n     * @param map  The map to print, may be \u003ccode\u003enull\u003c/code\u003e.\n     *   If \u003ccode\u003enull\u003c/code\u003e, the text \u0027null\u0027 is output.\n     * @throws NullPointerException if the stream is \u003ccode\u003enull\u003c/code\u003e\n     ",
      "child_ranges": [
        "(line 945,col 9)-(line 945,col 81)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.MapUtils.verbosePrintInternal(java.io.PrintStream, java.lang.Object, java.util.Map\u003c?, ?\u003e, java.util.Deque\u003cjava.util.Map\u003c?, ?\u003e\u003e, boolean)",
      "begin_line": 973,
      "end_line": 1037,
      "comment": "\n     * Implementation providing functionality for {@link #debugPrint} and for\n     * {@link #verbosePrint}.  This prints the given map with nice line breaks.\n     * If the debug flag is true, it additionally prints the type of the object\n     * value.  If the contents of a map include the map itself, then the text\n     * \u003cem\u003e(this Map)\u003c/em\u003e is printed out.  If the contents include a\n     * parent container of the map, the the text \u003cem\u003e(ancestor[i] Map)\u003c/em\u003e is\n     * printed, where i actually indicates the number of levels which must be\n     * traversed in the sequential list of ancestors (e.g. father, grandfather,\n     * great-grandfather, etc).\n     *\n     * @param out  the stream to print to\n     * @param label  the label to be used, may be \u003ccode\u003enull\u003c/code\u003e.\n     *   If \u003ccode\u003enull\u003c/code\u003e, the label is not output.\n     *   It typically represents the name of the property in a bean or similar.\n     * @param map  the map to print, may be \u003ccode\u003enull\u003c/code\u003e.\n     *   If \u003ccode\u003enull\u003c/code\u003e, the text \u0027null\u0027 is output\n     * @param lineage  a stack consisting of any maps in which the previous\n     *   argument is contained. This is checked to avoid infinite recursion when\n     *   printing the output\n     * @param debug  flag indicating whether type names should be output.\n     * @throws NullPointerException if the stream is \u003ccode\u003enull\u003c/code\u003e\n     ",
      "child_ranges": [
        "(line 975,col 9)-(line 975,col 41)",
        "(line 977,col 9)-(line 984,col 9)",
        "(line 985,col 9)-(line 988,col 9)",
        "(line 990,col 9)-(line 990,col 41)",
        "(line 991,col 9)-(line 991,col 25)",
        "(line 993,col 9)-(line 993,col 29)",
        "(line 995,col 9)-(line 1031,col 9)",
        "(line 1033,col 9)-(line 1033,col 29)",
        "(line 1035,col 9)-(line 1035,col 41)",
        "(line 1036,col 9)-(line 1036,col 67)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.MapUtils.printIndent(java.io.PrintStream, int)",
      "begin_line": 1044,
      "end_line": 1048,
      "comment": "\n     * Writes indentation to the given stream.\n     *\n     * @param out  the stream to indent\n     ",
      "child_ranges": [
        "(line 1045,col 9)-(line 1047,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.MapUtils.invertMap(java.util.Map\u003cK, V\u003e)",
      "begin_line": 1067,
      "end_line": 1073,
      "comment": "\n     * Inverts the supplied map returning a new HashMap such that the keys of\n     * the input are swapped with the values.\n     * \u003cp\u003e\n     * This operation assumes that the inverse mapping is well defined.\n     * If the input map had multiple entries with the same value mapped to\n     * different keys, the returned map will map one of those keys to the\n     * value, but the exact key which will be mapped is undefined.\n     *\n     * @param \u003cK\u003e  the key type\n     * @param \u003cV\u003e  the value type\n     * @param map  the map to invert, may not be null\n     * @return a new HashMap containing the inverted data\n     * @throws NullPointerException if the map is null\n     ",
      "child_ranges": [
        "(line 1068,col 9)-(line 1068,col 60)",
        "(line 1069,col 9)-(line 1071,col 9)",
        "(line 1072,col 9)-(line 1072,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.MapUtils.safeAddToMap(java.util.Map\u003c? super K, java.lang.Object\u003e, K, java.lang.Object)",
      "begin_line": 1096,
      "end_line": 1099,
      "comment": "\n     * Protects against adding null values to a map.\n     * \u003cp\u003e\n     * This method checks the value being added to the map, and if it is null\n     * it is replaced by an empty string.\n     * \u003cp\u003e\n     * This could be useful if the map does not accept null values, or for\n     * receiving data from a source that may provide null or empty string\n     * which should be held in the same way in the map.\n     * \u003cp\u003e\n     * Keys are not validated.\n     * Note that this method can be used to circumvent the map\u0027s\n     * value type at runtime.\n     *\n     * @param \u003cK\u003e  the key type\n     * @param map  the map to add to, may not be null\n     * @param key  the key\n     * @param value  the value, null converted to \"\"\n     * @throws NullPointerException if the map is null\n     ",
      "child_ranges": [
        "(line 1098,col 9)-(line 1098,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.MapUtils.putAll(java.util.Map\u003cK, V\u003e, java.lang.Object[])",
      "begin_line": 1150,
      "end_line": 1187,
      "comment": "\n     * Puts all the keys and values from the specified array into the map.\n     * \u003cp\u003e\n     * This method is an alternative to the {@link java.util.Map#putAll(java.util.Map)}\n     * method and constructors. It allows you to build a map from an object array\n     * of various possible styles.\n     * \u003cp\u003e\n     * If the first entry in the object array implements {@link java.util.Map.Entry}\n     * or {@link KeyValue} then the key and value are added from that object.\n     * If the first entry in the object array is an object array itself, then\n     * it is assumed that index 0 in the sub-array is the key and index 1 is the value.\n     * Otherwise, the array is treated as keys and values in alternate indices.\n     * \u003cp\u003e\n     * For example, to create a color map:\n     * \u003cpre\u003e\n     * Map colorMap \u003d MapUtils.putAll(new HashMap(), new String[][] {\n     *     {\"RED\", \"#FF0000\"},\n     *     {\"GREEN\", \"#00FF00\"},\n     *     {\"BLUE\", \"#0000FF\"}\n     * });\n     * \u003c/pre\u003e\n     * or:\n     * \u003cpre\u003e\n     * Map colorMap \u003d MapUtils.putAll(new HashMap(), new String[] {\n     *     \"RED\", \"#FF0000\",\n     *     \"GREEN\", \"#00FF00\",\n     *     \"BLUE\", \"#0000FF\"\n     * });\n     * \u003c/pre\u003e\n     * or:\n     * \u003cpre\u003e\n     * Map colorMap \u003d MapUtils.putAll(new HashMap(), new Map.Entry[] {\n     *     new DefaultMapEntry(\"RED\", \"#FF0000\"),\n     *     new DefaultMapEntry(\"GREEN\", \"#00FF00\"),\n     *     new DefaultMapEntry(\"BLUE\", \"#0000FF\")\n     * });\n     * \u003c/pre\u003e\n     *\n     * @param \u003cK\u003e  the key type\n     * @param \u003cV\u003e  the value type\n     * @param map  the map to populate, must not be null\n     * @param array  an array to populate from, null ignored\n     * @return the input map\n     * @throws NullPointerException  if map is null\n     * @throws IllegalArgumentException  if sub-array or entry matching used and an entry is invalid\n     * @throws ClassCastException if the array contents is mixed\n     * @since 3.2\n     ",
      "child_ranges": [
        "(line 1152,col 9)-(line 1154,col 9)",
        "(line 1155,col 9)-(line 1157,col 9)",
        "(line 1158,col 9)-(line 1158,col 36)",
        "(line 1159,col 9)-(line 1185,col 9)",
        "(line 1186,col 9)-(line 1186,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.MapUtils.emptyIfNull(java.util.Map\u003cK, V\u003e)",
      "begin_line": 1200,
      "end_line": 1202,
      "comment": "\n     * Returns an immutable empty map if the argument is \u003ccode\u003enull\u003c/code\u003e,\n     * or the argument itself otherwise.\n     *\n     * @param \u003cK\u003e the key type\n     * @param \u003cV\u003e the value type\n     * @param map the map, possibly \u003ccode\u003enull\u003c/code\u003e\n     * @return an empty map if the argument is \u003ccode\u003enull\u003c/code\u003e\n     ",
      "child_ranges": [
        "(line 1201,col 9)-(line 1201,col 63)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.MapUtils.isEmpty(java.util.Map\u003c?, ?\u003e)",
      "begin_line": 1213,
      "end_line": 1215,
      "comment": "\n     * Null-safe check if the specified map is empty.\n     * \u003cp\u003e\n     * Null returns true.\n     *\n     * @param map  the map to check, may be null\n     * @return true if empty or null\n     * @since 3.2\n     ",
      "child_ranges": [
        "(line 1214,col 9)-(line 1214,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.MapUtils.isNotEmpty(java.util.Map\u003c?, ?\u003e)",
      "begin_line": 1226,
      "end_line": 1228,
      "comment": "\n     * Null-safe check if the specified map is not empty.\n     * \u003cp\u003e\n     * Null returns false.\n     *\n     * @param map  the map to check, may be null\n     * @return true if non-null and non-empty\n     * @since 3.2\n     ",
      "child_ranges": [
        "(line 1227,col 9)-(line 1227,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.MapUtils.synchronizedMap(java.util.Map\u003cK, V\u003e)",
      "begin_line": 1256,
      "end_line": 1258,
      "comment": "\n     * Returns a synchronized map backed by the given map.\n     * \u003cp\u003e\n     * You must manually synchronize on the returned buffer\u0027s iterator to\n     * avoid non-deterministic behavior:\n     *\n     * \u003cpre\u003e\n     * Map m \u003d MapUtils.synchronizedMap(myMap);\n     * Set s \u003d m.keySet();  // outside synchronized block\n     * synchronized (m) {  // synchronized on MAP!\n     *     Iterator i \u003d s.iterator();\n     *     while (i.hasNext()) {\n     *         process (i.next());\n     *     }\n     * }\n     * \u003c/pre\u003e\n     *\n     * This method uses the implementation in {@link java.util.Collections Collections}.\n     *\n     * @param \u003cK\u003e  the key type\n     * @param \u003cV\u003e  the value type\n     * @param map  the map to synchronize, must not be null\n     * @return a synchronized map backed by the given map\n     ",
      "child_ranges": [
        "(line 1257,col 9)-(line 1257,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.MapUtils.unmodifiableMap(java.util.Map\u003c? extends K, ? extends V\u003e)",
      "begin_line": 1271,
      "end_line": 1273,
      "comment": "\n     * Returns an unmodifiable map backed by the given map.\n     * \u003cp\u003e\n     * This method uses the implementation in the decorators subpackage.\n     *\n     * @param \u003cK\u003e  the key type\n     * @param \u003cV\u003e  the value type\n     * @param map  the map to make unmodifiable, must not be null\n     * @return an unmodifiable map backed by the given map\n     * @throws NullPointerException  if the map is null\n     ",
      "child_ranges": [
        "(line 1272,col 9)-(line 1272,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.MapUtils.predicatedMap(java.util.Map\u003cK, V\u003e, org.apache.commons.collections4.Predicate\u003c? super K\u003e, org.apache.commons.collections4.Predicate\u003c? super V\u003e)",
      "begin_line": 1292,
      "end_line": 1295,
      "comment": "\n     * Returns a predicated (validating) map backed by the given map.\n     * \u003cp\u003e\n     * Only objects that pass the tests in the given predicates can be added to the map.\n     * Trying to add an invalid object results in an IllegalArgumentException.\n     * Keys must pass the key predicate, values must pass the value predicate.\n     * It is important not to use the original map after invoking this method,\n     * as it is a backdoor for adding invalid objects.\n     *\n     * @param \u003cK\u003e  the key type\n     * @param \u003cV\u003e  the value type\n     * @param map  the map to predicate, must not be null\n     * @param keyPred  the predicate for keys, null means no check\n     * @param valuePred  the predicate for values, null means no check\n     * @return a predicated map backed by the given map\n     * @throws NullPointerException  if the Map is null\n     ",
      "child_ranges": [
        "(line 1294,col 9)-(line 1294,col 68)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.MapUtils.transformedMap(java.util.Map\u003cK, V\u003e, org.apache.commons.collections4.Transformer\u003c? super K, ? extends K\u003e, org.apache.commons.collections4.Transformer\u003c? super V, ? extends V\u003e)",
      "begin_line": 1320,
      "end_line": 1324,
      "comment": "\n     * Returns a transformed map backed by the given map.\n     * \u003cp\u003e\n     * This method returns a new map (decorating the specified map) that\n     * will transform any new entries added to it.\n     * Existing entries in the specified map will not be transformed.\n     * If you want that behaviour, see {@link TransformedMap#transformedMap}.\n     * \u003cp\u003e\n     * Each object is passed through the transformers as it is added to the\n     * Map. It is important not to use the original map after invoking this\n     * method, as it is a backdoor for adding untransformed objects.\n     * \u003cp\u003e\n     * If there are any elements already in the map being decorated, they\n     * are NOT transformed.\n     *\n     * @param \u003cK\u003e  the key type\n     * @param \u003cV\u003e  the value type\n     * @param map  the map to transform, must not be null, typically empty\n     * @param keyTransformer  the transformer for the map keys, null means no transformation\n     * @param valueTransformer  the transformer for the map values, null means no transformation\n     * @return a transformed map backed by the given map\n     * @throws NullPointerException  if the Map is null\n     ",
      "child_ranges": [
        "(line 1323,col 9)-(line 1323,col 85)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.MapUtils.fixedSizeMap(java.util.Map\u003cK, V\u003e)",
      "begin_line": 1338,
      "end_line": 1340,
      "comment": "\n     * Returns a fixed-sized map backed by the given map.\n     * Elements may not be added or removed from the returned map, but\n     * existing elements can be changed (for instance, via the\n     * {@link Map#put(Object,Object)} method).\n     *\n     * @param \u003cK\u003e  the key type\n     * @param \u003cV\u003e  the value type\n     * @param map  the map whose size to fix, must not be null\n     * @return a fixed-size map backed by that map\n     * @throws NullPointerException  if the Map is null\n     ",
      "child_ranges": [
        "(line 1339,col 9)-(line 1339,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.MapUtils.lazyMap(java.util.Map\u003cK, V\u003e, org.apache.commons.collections4.Factory\u003c? extends V\u003e)",
      "begin_line": 1372,
      "end_line": 1374,
      "comment": "\n     * Returns a \"lazy\" map whose values will be created on demand.\n     * \u003cp\u003e\n     * When the key passed to the returned map\u0027s {@link Map#get(Object)}\n     * method is not present in the map, then the factory will be used\n     * to create a new object and that object will become the value\n     * associated with that key.\n     * \u003cp\u003e\n     * For instance:\n     * \u003cpre\u003e\n     * Factory factory \u003d new Factory() {\n     *     public Object create() {\n     *         return new Date();\n     *     }\n     * }\n     * Map lazyMap \u003d MapUtils.lazyMap(new HashMap(), factory);\n     * Object obj \u003d lazyMap.get(\"test\");\n     * \u003c/pre\u003e\n     *\n     * After the above code is executed, \u003ccode\u003eobj\u003c/code\u003e will contain\n     * a new \u003ccode\u003eDate\u003c/code\u003e instance.  Furthermore, that \u003ccode\u003eDate\u003c/code\u003e\n     * instance is the value for the \u003ccode\u003e\"test\"\u003c/code\u003e key in the map.\n     *\n     * @param \u003cK\u003e  the key type\n     * @param \u003cV\u003e  the value type\n     * @param map  the map to make lazy, must not be null\n     * @param factory  the factory for creating new objects, must not be null\n     * @return a lazy map backed by the given map\n     * @throws NullPointerException  if the Map or Factory is null\n     ",
      "child_ranges": [
        "(line 1373,col 9)-(line 1373,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.MapUtils.lazyMap(java.util.Map\u003cK, V\u003e, org.apache.commons.collections4.Transformer\u003c? super K, ? extends V\u003e)",
      "begin_line": 1413,
      "end_line": 1416,
      "comment": "\n     * Returns a \"lazy\" map whose values will be created on demand.\n     * \u003cp\u003e\n     * When the key passed to the returned map\u0027s {@link Map#get(Object)}\n     * method is not present in the map, then the factory will be used\n     * to create a new object and that object will become the value\n     * associated with that key. The factory is a {@link Transformer}\n     * that will be passed the key which it must transform into the value.\n     * \u003cp\u003e\n     * For instance:\n     * \u003cpre\u003e\n     * Transformer factory \u003d new Transformer() {\n     *     public Object transform(Object mapKey) {\n     *         return new File(mapKey);\n     *     }\n     * }\n     * Map lazyMap \u003d MapUtils.lazyMap(new HashMap(), factory);\n     * Object obj \u003d lazyMap.get(\"C:/dev\");\n     * \u003c/pre\u003e\n     *\n     * After the above code is executed, \u003ccode\u003eobj\u003c/code\u003e will contain\n     * a new \u003ccode\u003eFile\u003c/code\u003e instance for the C drive dev directory.\n     * Furthermore, that \u003ccode\u003eFile\u003c/code\u003e instance is the value for the\n     * \u003ccode\u003e\"C:/dev\"\u003c/code\u003e key in the map.\n     * \u003cp\u003e\n     * If a lazy map is wrapped by a synchronized map, the result is a simple\n     * synchronized cache. When an object is not is the cache, the cache itself\n     * calls back to the factory Transformer to populate itself, all within the\n     * same synchronized block.\n     *\n     * @param \u003cK\u003e  the key type\n     * @param \u003cV\u003e  the value type\n     * @param map  the map to make lazy, must not be null\n     * @param transformerFactory  the factory for creating new objects, must not be null\n     * @return a lazy map backed by the given map\n     * @throws NullPointerException  if the Map or Transformer is null\n     ",
      "child_ranges": [
        "(line 1415,col 9)-(line 1415,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.MapUtils.orderedMap(java.util.Map\u003cK, V\u003e)",
      "begin_line": 1431,
      "end_line": 1433,
      "comment": "\n     * Returns a map that maintains the order of keys that are added\n     * backed by the given map.\n     * \u003cp\u003e\n     * If a key is added twice, the order is determined by the first add.\n     * The order is observed through the keySet, values and entrySet.\n     *\n     * @param \u003cK\u003e  the key type\n     * @param \u003cV\u003e  the value type\n     * @param map  the map to order, must not be null\n     * @return an ordered map backed by the given map\n     * @throws NullPointerException  if the Map is null\n     ",
      "child_ranges": [
        "(line 1432,col 9)-(line 1432,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.MapUtils.multiValueMap(java.util.Map\u003cK, ? super java.util.Collection\u003cV\u003e\u003e)",
      "begin_line": 1447,
      "end_line": 1450,
      "comment": "\n     * Creates a mult-value map backed by the given map which returns\n     * collections of type ArrayList.\n     *\n     * @param \u003cK\u003e  the key type\n     * @param \u003cV\u003e  the value type\n     * @param map  the map to decorate\n     * @return a multi-value map backed by the given map which returns ArrayLists of values.\n     * @see MultiValueMap\n     * @since 3.2\n     * @deprecated since 4.1, use {@link MultiValuedMap} instead\n     ",
      "child_ranges": [
        "(line 1449,col 9)-(line 1449,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.MapUtils.multiValueMap(java.util.Map\u003cK, C\u003e, java.lang.Class\u003cC\u003e)",
      "begin_line": 1467,
      "end_line": 1471,
      "comment": "\n     * Creates a multi-value map backed by the given map which returns\n     * collections of the specified type.\n     *\n     * @param \u003cK\u003e  the key type\n     * @param \u003cV\u003e  the value type\n     * @param \u003cC\u003e  the collection class type\n     * @param map  the map to decorate\n     * @param collectionClass  the type of collections to return from the map\n     *   (must contain public no-arg constructor and extend Collection)\n     * @return a multi-value map backed by the given map which returns collections of the specified type\n     * @see MultiValueMap\n     * @since 3.2\n     * @deprecated since 4.1, use {@link MultiValuedMap} instead\n     ",
      "child_ranges": [
        "(line 1470,col 9)-(line 1470,col 65)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.MapUtils.multiValueMap(java.util.Map\u003cK, C\u003e, org.apache.commons.collections4.Factory\u003cC\u003e)",
      "begin_line": 1488,
      "end_line": 1492,
      "comment": "\n     * Creates a multi-value map backed by the given map which returns\n     * collections created by the specified collection factory.\n     *\n     * @param \u003cK\u003e  the key type\n     * @param \u003cV\u003e  the value type\n     * @param \u003cC\u003e  the collection class type\n     * @param map  the map to decorate\n     * @param collectionFactory  a factor which creates collection objects\n     * @return a multi-value map backed by the given map which returns collections\n     *   created by the specified collection factory\n     * @see MultiValueMap\n     * @since 3.2\n     * @deprecated since 4.1, use {@link MultiValuedMap} instead\n     ",
      "child_ranges": [
        "(line 1491,col 9)-(line 1491,col 67)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.MapUtils.synchronizedSortedMap(java.util.SortedMap\u003cK, V\u003e)",
      "begin_line": 1521,
      "end_line": 1523,
      "comment": "\n     * Returns a synchronized sorted map backed by the given sorted map.\n     * \u003cp\u003e\n     * You must manually synchronize on the returned buffer\u0027s iterator to\n     * avoid non-deterministic behavior:\n     *\n     * \u003cpre\u003e\n     * Map m \u003d MapUtils.synchronizedSortedMap(myMap);\n     * Set s \u003d m.keySet();  // outside synchronized block\n     * synchronized (m) {  // synchronized on MAP!\n     *     Iterator i \u003d s.iterator();\n     *     while (i.hasNext()) {\n     *         process (i.next());\n     *     }\n     * }\n     * \u003c/pre\u003e\n     *\n     * This method uses the implementation in {@link java.util.Collections Collections}.\n     *\n     * @param \u003cK\u003e  the key type\n     * @param \u003cV\u003e  the value type\n     * @param map  the map to synchronize, must not be null\n     * @return a synchronized map backed by the given map\n     * @throws NullPointerException  if the map is null\n     ",
      "child_ranges": [
        "(line 1522,col 9)-(line 1522,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.MapUtils.unmodifiableSortedMap(java.util.SortedMap\u003cK, ? extends V\u003e)",
      "begin_line": 1536,
      "end_line": 1538,
      "comment": "\n     * Returns an unmodifiable sorted map backed by the given sorted map.\n     * \u003cp\u003e\n     * This method uses the implementation in the decorators subpackage.\n     *\n     * @param \u003cK\u003e  the key type\n     * @param \u003cV\u003e  the value type\n     * @param map  the sorted map to make unmodifiable, must not be null\n     * @return an unmodifiable map backed by the given map\n     * @throws NullPointerException  if the map is null\n     ",
      "child_ranges": [
        "(line 1537,col 9)-(line 1537,col 64)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.MapUtils.predicatedSortedMap(java.util.SortedMap\u003cK, V\u003e, org.apache.commons.collections4.Predicate\u003c? super K\u003e, org.apache.commons.collections4.Predicate\u003c? super V\u003e)",
      "begin_line": 1557,
      "end_line": 1560,
      "comment": "\n     * Returns a predicated (validating) sorted map backed by the given map.\n     * \u003cp\u003e\n     * Only objects that pass the tests in the given predicates can be added to the map.\n     * Trying to add an invalid object results in an IllegalArgumentException.\n     * Keys must pass the key predicate, values must pass the value predicate.\n     * It is important not to use the original map after invoking this method,\n     * as it is a backdoor for adding invalid objects.\n     *\n     * @param \u003cK\u003e  the key type\n     * @param \u003cV\u003e  the value type\n     * @param map  the map to predicate, must not be null\n     * @param keyPred  the predicate for keys, null means no check\n     * @param valuePred  the predicate for values, null means no check\n     * @return a predicated map backed by the given map\n     * @throws NullPointerException  if the SortedMap is null\n     ",
      "child_ranges": [
        "(line 1559,col 9)-(line 1559,col 80)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.MapUtils.transformedSortedMap(java.util.SortedMap\u003cK, V\u003e, org.apache.commons.collections4.Transformer\u003c? super K, ? extends K\u003e, org.apache.commons.collections4.Transformer\u003c? super V, ? extends V\u003e)",
      "begin_line": 1585,
      "end_line": 1589,
      "comment": "\n     * Returns a transformed sorted map backed by the given map.\n     * \u003cp\u003e\n     * This method returns a new sorted map (decorating the specified map) that\n     * will transform any new entries added to it.\n     * Existing entries in the specified map will not be transformed.\n     * If you want that behaviour, see {@link TransformedSortedMap#transformedSortedMap}.\n     * \u003cp\u003e\n     * Each object is passed through the transformers as it is added to the\n     * Map. It is important not to use the original map after invoking this\n     * method, as it is a backdoor for adding untransformed objects.\n     * \u003cp\u003e\n     * If there are any elements already in the map being decorated, they\n     * are NOT transformed.\n     *\n     * @param \u003cK\u003e  the key type\n     * @param \u003cV\u003e  the value type\n     * @param map  the map to transform, must not be null, typically empty\n     * @param keyTransformer  the transformer for the map keys, null means no transformation\n     * @param valueTransformer  the transformer for the map values, null means no transformation\n     * @return a transformed map backed by the given map\n     * @throws NullPointerException  if the SortedMap is null\n     ",
      "child_ranges": [
        "(line 1588,col 9)-(line 1588,col 97)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.MapUtils.fixedSizeSortedMap(java.util.SortedMap\u003cK, V\u003e)",
      "begin_line": 1603,
      "end_line": 1605,
      "comment": "\n     * Returns a fixed-sized sorted map backed by the given sorted map.\n     * Elements may not be added or removed from the returned map, but\n     * existing elements can be changed (for instance, via the\n     * {@link Map#put(Object,Object)} method).\n     *\n     * @param \u003cK\u003e  the key type\n     * @param \u003cV\u003e  the value type\n     * @param map  the map whose size to fix, must not be null\n     * @return a fixed-size map backed by that map\n     * @throws NullPointerException  if the SortedMap is null\n     ",
      "child_ranges": [
        "(line 1604,col 9)-(line 1604,col 58)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.MapUtils.lazySortedMap(java.util.SortedMap\u003cK, V\u003e, org.apache.commons.collections4.Factory\u003c? extends V\u003e)",
      "begin_line": 1638,
      "end_line": 1640,
      "comment": "\n     * Returns a \"lazy\" sorted map whose values will be created on demand.\n     * \u003cp\u003e\n     * When the key passed to the returned map\u0027s {@link Map#get(Object)}\n     * method is not present in the map, then the factory will be used\n     * to create a new object and that object will become the value\n     * associated with that key.\n     * \u003cp\u003e\n     * For instance:\n     *\n     * \u003cpre\u003e\n     * Factory factory \u003d new Factory() {\n     *     public Object create() {\n     *         return new Date();\n     *     }\n     * }\n     * SortedMap lazy \u003d MapUtils.lazySortedMap(new TreeMap(), factory);\n     * Object obj \u003d lazy.get(\"test\");\n     * \u003c/pre\u003e\n     *\n     * After the above code is executed, \u003ccode\u003eobj\u003c/code\u003e will contain\n     * a new \u003ccode\u003eDate\u003c/code\u003e instance.  Furthermore, that \u003ccode\u003eDate\u003c/code\u003e\n     * instance is the value for the \u003ccode\u003e\"test\"\u003c/code\u003e key.\n     *\n     * @param \u003cK\u003e  the key type\n     * @param \u003cV\u003e  the value type\n     * @param map  the map to make lazy, must not be null\n     * @param factory  the factory for creating new objects, must not be null\n     * @return a lazy map backed by the given map\n     * @throws NullPointerException  if the SortedMap or Factory is null\n     ",
      "child_ranges": [
        "(line 1639,col 9)-(line 1639,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.MapUtils.lazySortedMap(java.util.SortedMap\u003cK, V\u003e, org.apache.commons.collections4.Transformer\u003c? super K, ? extends V\u003e)",
      "begin_line": 1679,
      "end_line": 1682,
      "comment": "\n     * Returns a \"lazy\" sorted map whose values will be created on demand.\n     * \u003cp\u003e\n     * When the key passed to the returned map\u0027s {@link Map#get(Object)}\n     * method is not present in the map, then the factory will be used\n     * to create a new object and that object will become the value\n     * associated with that key. The factory is a {@link Transformer}\n     * that will be passed the key which it must transform into the value.\n     * \u003cp\u003e\n     * For instance:\n     * \u003cpre\u003e\n     * Transformer factory \u003d new Transformer() {\n     *     public Object transform(Object mapKey) {\n     *         return new File(mapKey);\n     *     }\n     * }\n     * SortedMap lazy \u003d MapUtils.lazySortedMap(new TreeMap(), factory);\n     * Object obj \u003d lazy.get(\"C:/dev\");\n     * \u003c/pre\u003e\n     *\n     * After the above code is executed, \u003ccode\u003eobj\u003c/code\u003e will contain\n     * a new \u003ccode\u003eFile\u003c/code\u003e instance for the C drive dev directory.\n     * Furthermore, that \u003ccode\u003eFile\u003c/code\u003e instance is the value for the\n     * \u003ccode\u003e\"C:/dev\"\u003c/code\u003e key in the map.\n     * \u003cp\u003e\n     * If a lazy map is wrapped by a synchronized map, the result is a simple\n     * synchronized cache. When an object is not is the cache, the cache itself\n     * calls back to the factory Transformer to populate itself, all within the\n     * same synchronized block.\n     *\n     * @param \u003cK\u003e  the key type\n     * @param \u003cV\u003e  the value type\n     * @param map  the map to make lazy, must not be null\n     * @param transformerFactory  the factory for creating new objects, must not be null\n     * @return a lazy map backed by the given map\n     * @throws NullPointerException  if the Map or Transformer is null\n     ",
      "child_ranges": [
        "(line 1681,col 9)-(line 1681,col 68)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.MapUtils.populateMap(java.util.Map\u003cK, V\u003e, java.lang.Iterable\u003c? extends V\u003e, org.apache.commons.collections4.Transformer\u003cV, K\u003e)",
      "begin_line": 1695,
      "end_line": 1698,
      "comment": "\n     * Populates a Map using the supplied \u003ccode\u003eTransformer\u003c/code\u003e to transform the elements\n     * into keys, using the unaltered element as the value in the \u003ccode\u003eMap\u003c/code\u003e.\n     *\n     * @param \u003cK\u003e  the key type\n     * @param \u003cV\u003e  the value type\n     * @param map the \u003ccode\u003eMap\u003c/code\u003e to populate.\n     * @param elements the \u003ccode\u003eIterable\u003c/code\u003e containing the input values for the map.\n     * @param keyTransformer the \u003ccode\u003eTransformer\u003c/code\u003e used to transform the element into a key value\n     * @throws NullPointerException if the map, elements or transformer are null\n     ",
      "child_ranges": [
        "(line 1697,col 9)-(line 1697,col 89)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.MapUtils.populateMap(java.util.Map\u003cK, V\u003e, java.lang.Iterable\u003c? extends E\u003e, org.apache.commons.collections4.Transformer\u003cE, K\u003e, org.apache.commons.collections4.Transformer\u003cE, V\u003e)",
      "begin_line": 1713,
      "end_line": 1721,
      "comment": "\n     * Populates a Map using the supplied \u003ccode\u003eTransformer\u003c/code\u003es to transform the elements\n     * into keys and values.\n     *\n     * @param \u003cK\u003e  the key type\n     * @param \u003cV\u003e  the value type\n     * @param \u003cE\u003e  the type of object contained in the {@link Iterable}\n     * @param map the \u003ccode\u003eMap\u003c/code\u003e to populate.\n     * @param elements the \u003ccode\u003eIterable\u003c/code\u003e containing the input values for the map.\n     * @param keyTransformer the \u003ccode\u003eTransformer\u003c/code\u003e used to transform the element into a key value\n     * @param valueTransformer the \u003ccode\u003eTransformer\u003c/code\u003e used to transform the element into a value\n     * @throws NullPointerException if the map, elements or transformers are null\n     ",
      "child_ranges": [
        "(line 1716,col 9)-(line 1716,col 63)",
        "(line 1717,col 9)-(line 1720,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.MapUtils.populateMap(org.apache.commons.collections4.MultiMap\u003cK, V\u003e, java.lang.Iterable\u003c? extends V\u003e, org.apache.commons.collections4.Transformer\u003cV, K\u003e)",
      "begin_line": 1734,
      "end_line": 1737,
      "comment": "\n     * Populates a MultiMap using the supplied \u003ccode\u003eTransformer\u003c/code\u003e to transform the elements\n     * into keys, using the unaltered element as the value in the \u003ccode\u003eMultiMap\u003c/code\u003e.\n     *\n     * @param \u003cK\u003e  the key type\n     * @param \u003cV\u003e  the value type\n     * @param map the \u003ccode\u003eMultiMap\u003c/code\u003e to populate.\n     * @param elements the \u003ccode\u003eIterable\u003c/code\u003e to use as input values for the map.\n     * @param keyTransformer the \u003ccode\u003eTransformer\u003c/code\u003e used to transform the element into a key value\n     * @throws NullPointerException if the map, elements or transformer are null\n     ",
      "child_ranges": [
        "(line 1736,col 9)-(line 1736,col 89)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.MapUtils.populateMap(org.apache.commons.collections4.MultiMap\u003cK, V\u003e, java.lang.Iterable\u003c? extends E\u003e, org.apache.commons.collections4.Transformer\u003cE, K\u003e, org.apache.commons.collections4.Transformer\u003cE, V\u003e)",
      "begin_line": 1752,
      "end_line": 1760,
      "comment": "\n     * Populates a MultiMap using the supplied \u003ccode\u003eTransformer\u003c/code\u003es to transform the elements\n     * into keys and values.\n     *\n     * @param \u003cK\u003e  the key type\n     * @param \u003cV\u003e  the value type\n     * @param \u003cE\u003e  the type of object contained in the {@link Iterable}\n     * @param map the \u003ccode\u003eMultiMap\u003c/code\u003e to populate.\n     * @param elements the \u003ccode\u003eIterable\u003c/code\u003e containing the input values for the map.\n     * @param keyTransformer the \u003ccode\u003eTransformer\u003c/code\u003e used to transform the element into a key value\n     * @param valueTransformer the \u003ccode\u003eTransformer\u003c/code\u003e used to transform the element into a value\n     * @throws NullPointerException if the map, collection or transformers are null\n     ",
      "child_ranges": [
        "(line 1755,col 9)-(line 1755,col 63)",
        "(line 1756,col 9)-(line 1759,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.MapUtils.iterableMap(java.util.Map\u003cK, V\u003e)",
      "begin_line": 1772,
      "end_line": 1777,
      "comment": "\n     * Get the specified {@link Map} as an {@link IterableMap}.\n     *\n     * @param \u003cK\u003e  the key type\n     * @param \u003cV\u003e  the value type\n     * @param map to wrap if necessary.\n     * @return IterableMap\u003cK, V\u003e\n     * @throws NullPointerException if map is null\n     * @since 4.0\n     ",
      "child_ranges": [
        "(line 1773,col 9)-(line 1775,col 9)",
        "(line 1776,col 9)-(line 1776,col 109)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.MapUtils.iterableSortedMap(java.util.SortedMap\u003cK, V\u003e)",
      "begin_line": 1789,
      "end_line": 1795,
      "comment": "\n     * Get the specified {@link SortedMap} as an {@link IterableSortedMap}.\n     *\n     * @param \u003cK\u003e  the key type\n     * @param \u003cV\u003e  the value type\n     * @param sortedMap to wrap if necessary\n     * @return {@link IterableSortedMap}\u003cK, V\u003e\n     * @throws NullPointerException if sortedMap is null\n     * @since 4.0\n     ",
      "child_ranges": [
        "(line 1790,col 9)-(line 1792,col 9)",
        "(line 1793,col 9)-(line 1794,col 107)"
      ]
    }
  ]
}