{
  "filepath": "/tmp/Collections-25b/src/main/java/org/apache/commons/collections4/map/PassiveExpiringMap.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "PassiveExpiringMap",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.collections4.map.AbstractMapDecorator\u003cK, V\u003e",
        "java.io.Serializable"
      ],
      "begin_line": 63,
      "end_line": 539,
      "comment": "\n * Decorates a \u003ccode\u003eMap\u003c/code\u003e to evict expired entries once their expiration\n * time has been reached.\n * \u003cp\u003e\n * When putting a key-value pair in the map this decorator uses a\n * {@link ExpirationPolicy} to determine how long the entry should remain alive\n * as defined by an expiration time value.\n * \u003c/p\u003e\n * \u003cp\u003e\n * When accessing the mapped value for a key, its expiration time is checked,\n * and if it is a negative value or if it is greater than the current time, the\n * mapped value is returned. Otherwise, the key is removed from the decorated\n * map, and \u003ccode\u003enull\u003c/code\u003e is returned.\n * \u003c/p\u003e\n * \u003cp\u003e\n * When invoking methods that involve accessing the entire map contents (i.e\n * {@link #containsKey(Object)}, {@link #entrySet()}, etc.) this decorator\n * removes all expired entries prior to actually completing the invocation.\n * \u003c/p\u003e\n * \u003cp\u003e\n * \u003cstrong\u003eNote that {@link PassiveExpiringMap} is not synchronized and is not\n * thread-safe.\u003c/strong\u003e If you wish to use this map from multiple threads\n * concurrently, you must use appropriate synchronization. The simplest approach\n * is to wrap this map using {@link java.util.Collections#synchronizedMap(Map)}.\n * This class may throw exceptions when accessed by concurrent threads without\n * synchronization.\n * \u003c/p\u003e\n *\n * @param \u003cK\u003e the type of the keys in the map\n * @param \u003cV\u003e the type of the values in the map\n * @since 4.0\n * @version $Id$\n "
    },
    {
      "type": "class_interface",
      "name": "ConstantTimeToLiveExpirationPolicy",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.collections4.map.PassiveExpiringMap.ExpirationPolicy\u003cK, V\u003e"
      ],
      "begin_line": 77,
      "end_line": 154,
      "comment": "\n     * A {@link org.apache.commons.collections4.map.PassiveExpiringMap.ExpirationPolicy ExpirationPolicy}\n     * that returns a expiration time that is a\n     * constant about of time in the future from the current time.\n     *\n     * @param \u003cK\u003e the type of the keys in the map\n     * @param \u003cV\u003e the type of the values in the map\n     * @since 4.0\n     * @version $Id$\n     "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 81,
      "end_line": 81,
      "comment": " Serialization version "
    },
    {
      "type": "field",
      "varNames": [
        "timeToLiveMillis"
      ],
      "begin_line": 84,
      "end_line": 84,
      "comment": " the constant time-to-live value measured in milliseconds. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.collections4.map.PassiveExpiringMap.ConstantTimeToLiveExpirationPolicy.ConstantTimeToLiveExpirationPolicy()",
      "begin_line": 90,
      "end_line": 92,
      "comment": "\n         * Default constructor. Constructs a policy using a negative\n         * time-to-live value that results in entries never expiring.\n         ",
      "child_ranges": [
        "(line 91,col 13)-(line 91,col 22)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.collections4.map.PassiveExpiringMap.ConstantTimeToLiveExpirationPolicy.ConstantTimeToLiveExpirationPolicy(long)",
      "begin_line": 105,
      "end_line": 108,
      "comment": "\n         * Construct a policy with the given time-to-live constant measured in\n         * milliseconds. A negative time-to-live value indicates entries never\n         * expire. A zero time-to-live value indicates entries expire (nearly)\n         * immediately.\n         *\n         * @param timeToLiveMillis the constant amount of time (in milliseconds)\n         *        an entry is available before it expires. A negative value\n         *        results in entries that NEVER expire. A zero value results in\n         *        entries that ALWAYS expire.\n         ",
      "child_ranges": [
        "(line 106,col 13)-(line 106,col 20)",
        "(line 107,col 13)-(line 107,col 53)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.collections4.map.PassiveExpiringMap.ConstantTimeToLiveExpirationPolicy.ConstantTimeToLiveExpirationPolicy(long, java.util.concurrent.TimeUnit)",
      "begin_line": 122,
      "end_line": 125,
      "comment": "\n         * Construct a policy with the given time-to-live constant measured in\n         * the given time unit of measure.\n         *\n         * @param timeToLive the constant amount of time an entry is available\n         *        before it expires. A negative value results in entries that\n         *        NEVER expire. A zero value results in entries that ALWAYS\n         *        expire.\n         * @param timeUnit the unit of time for the \u003ccode\u003etimeToLive\u003c/code\u003e\n         *        parameter, must not be null.\n         * @throws IllegalArgumentException if the time unit is null.\n         ",
      "child_ranges": [
        "(line 124,col 13)-(line 124,col 67)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.PassiveExpiringMap.ConstantTimeToLiveExpirationPolicy.expirationTime(K, V)",
      "begin_line": 137,
      "end_line": 153,
      "comment": "\n         * Determine the expiration time for the given key-value entry.\n         *\n         * @param key the key for the entry (ignored).\n         * @param value the value for the entry (ignored).\n         * @return if {@link #timeToLiveMillis} \u0026ge; 0, an expiration time of\n         *         {@link #timeToLiveMillis} +\n         *         {@link System#currentTimeMillis()} is returned. Otherwise, -1\n         *         is returned indicating the entry never expires.\n         ",
      "child_ranges": [
        "(line 138,col 13)-(line 149,col 13)",
        "(line 152,col 13)-(line 152,col 23)"
      ]
    },
    {
      "type": "class_interface",
      "name": "ExpirationPolicy",
      "is_interface": true,
      "parent_types": [
        "java.io.Serializable"
      ],
      "begin_line": 164,
      "end_line": 176,
      "comment": "\n     * A policy to determine the expiration time for key-value entries.\n     *\n     * @param \u003cK\u003e the key object type.\n     * @param \u003cV\u003e the value object type\n     * @since 4.0\n     * @version $Id$\n     "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.PassiveExpiringMap.ExpirationPolicy.expirationTime(K, V)",
      "begin_line": 175,
      "end_line": 175,
      "comment": "\n         * Determine the expiration time for the given key-value entry.\n         *\n         * @param key the key for the entry.\n         * @param value the value for the entry.\n         * @return the expiration time value measured in milliseconds. A\n         *         negative return value indicates the entry never expires.\n         ",
      "child_ranges": []
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 179,
      "end_line": 179,
      "comment": " Serialization version "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.PassiveExpiringMap.validateAndConvertToMillis(long, java.util.concurrent.TimeUnit)",
      "begin_line": 194,
      "end_line": 200,
      "comment": "\n     * First validate the input parameters. If the parameters are valid, convert\n     * the given time measured in the given units to the same time measured in\n     * milliseconds. If the parameters are invalid, an\n     * {@link IllegalArgumentException} is thrown.\n     *\n     * @param timeToLive the constant amount of time an entry is available\n     *        before it expires. A negative value results in entries that NEVER\n     *        expire. A zero value results in entries that ALWAYS expire.\n     * @param timeUnit the unit of time for the \u003ccode\u003etimeToLive\u003c/code\u003e\n     *        parameter, must not be null.\n     * @throws IllegalArgumentException if the time unit is null.\n     ",
      "child_ranges": [
        "(line 196,col 9)-(line 198,col 9)",
        "(line 199,col 9)-(line 199,col 67)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "expirationMap"
      ],
      "begin_line": 203,
      "end_line": 203,
      "comment": " map used to manage expiration times for the actual map entries. "
    },
    {
      "type": "field",
      "varNames": [
        "expiringPolicy"
      ],
      "begin_line": 206,
      "end_line": 206,
      "comment": " the policy used to determine time-to-live values for map entries. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.collections4.map.PassiveExpiringMap.PassiveExpiringMap()",
      "begin_line": 212,
      "end_line": 214,
      "comment": "\n     * Default constructor. Constructs a map decorator that results in entries\n     * NEVER expiring.\n     ",
      "child_ranges": [
        "(line 213,col 9)-(line 213,col 18)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.collections4.map.PassiveExpiringMap.PassiveExpiringMap(org.apache.commons.collections4.map.PassiveExpiringMap.ExpirationPolicy\u003cK, V\u003e)",
      "begin_line": 223,
      "end_line": 225,
      "comment": "\n     * Construct a map decorator using the given expiration policy to determine\n     * expiration times.\n     *\n     * @param expiringPolicy the policy used to determine expiration times of\n     *        entries as they are added.\n     ",
      "child_ranges": [
        "(line 224,col 9)-(line 224,col 50)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.collections4.map.PassiveExpiringMap.PassiveExpiringMap(org.apache.commons.collections4.map.PassiveExpiringMap.ExpirationPolicy\u003cK, V\u003e, java.util.Map\u003cK, V\u003e)",
      "begin_line": 238,
      "end_line": 245,
      "comment": "\n     * Construct a map decorator that decorates the given map and uses the given\n     * expiration policy to determine expiration times. If there are any\n     * elements already in the map being decorated, they will NEVER expire\n     * unless they are replaced.\n     *\n     * @param expiringPolicy the policy used to determine expiration times of\n     *        entries as they are added.\n     * @param map the map to decorate, must not be null.\n     * @throws IllegalArgumentException if the map is null.\n     ",
      "child_ranges": [
        "(line 240,col 9)-(line 240,col 19)",
        "(line 241,col 9)-(line 243,col 9)",
        "(line 244,col 9)-(line 244,col 45)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.collections4.map.PassiveExpiringMap.PassiveExpiringMap(long)",
      "begin_line": 257,
      "end_line": 260,
      "comment": "\n     * Construct a map decorator that decorates the given map using the given\n     * time-to-live value measured in milliseconds to create and use a\n     * {@link ConstantTimeToLiveExpirationPolicy} expiration policy.\n     *\n     * @param timeToLiveMillis the constant amount of time (in milliseconds) an\n     *        entry is available before it expires. A negative value results in\n     *        entries that NEVER expire. A zero value results in entries that\n     *        ALWAYS expire.\n     ",
      "child_ranges": [
        "(line 258,col 9)-(line 259,col 34)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.collections4.map.PassiveExpiringMap.PassiveExpiringMap(long, java.util.Map\u003cK, V\u003e)",
      "begin_line": 276,
      "end_line": 279,
      "comment": "\n     * Construct a map decorator using the given time-to-live value measured in\n     * milliseconds to create and use a\n     * {@link ConstantTimeToLiveExpirationPolicy} expiration policy. If there\n     * are any elements already in the map being decorated, they will NEVER\n     * expire unless they are replaced.\n     *\n     * @param timeToLiveMillis the constant amount of time (in milliseconds) an\n     *        entry is available before it expires. A negative value results in\n     *        entries that NEVER expire. A zero value results in entries that\n     *        ALWAYS expire.\n     * @param map the map to decorate, must not be null.\n     * @throws IllegalArgumentException if the map is null.\n     ",
      "child_ranges": [
        "(line 277,col 9)-(line 278,col 18)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.collections4.map.PassiveExpiringMap.PassiveExpiringMap(long, java.util.concurrent.TimeUnit)",
      "begin_line": 293,
      "end_line": 295,
      "comment": "\n     * Construct a map decorator using the given time-to-live value measured in\n     * the given time units of measure to create and use a\n     * {@link ConstantTimeToLiveExpirationPolicy} expiration policy.\n     *\n     * @param timeToLive the constant amount of time an entry is available\n     *        before it expires. A negative value results in entries that NEVER\n     *        expire. A zero value results in entries that ALWAYS expire.\n     * @param timeUnit the unit of time for the \u003ccode\u003etimeToLive\u003c/code\u003e\n     *        parameter, must not be null.\n     * @throws IllegalArgumentException if the time unit is null.\n     ",
      "child_ranges": [
        "(line 294,col 9)-(line 294,col 63)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.collections4.map.PassiveExpiringMap.PassiveExpiringMap(long, java.util.concurrent.TimeUnit, java.util.Map\u003cK, V\u003e)",
      "begin_line": 314,
      "end_line": 316,
      "comment": "\n     * Construct a map decorator that decorates the given map using the given\n     * time-to-live value measured in the given time units of measure to create\n     * {@link ConstantTimeToLiveExpirationPolicy} expiration policy. This policy\n     * is used to determine expiration times. If there are any elements already\n     * in the map being decorated, they will NEVER expire unless they are\n     * replaced.\n     *\n     * @param timeToLive the constant amount of time an entry is available\n     *        before it expires. A negative value results in entries that NEVER\n     *        expire. A zero value results in entries that ALWAYS expire.\n     * @param timeUnit the unit of time for the \u003ccode\u003etimeToLive\u003c/code\u003e\n     *        parameter, must not be null.\n     * @param map the map to decorate, must not be null.\n     * @throws IllegalArgumentException if the time unit is null.\n     * @throws IllegalArgumentException if the map is null.\n     ",
      "child_ranges": [
        "(line 315,col 9)-(line 315,col 68)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.collections4.map.PassiveExpiringMap.PassiveExpiringMap(java.util.Map\u003cK, V\u003e)",
      "begin_line": 326,
      "end_line": 328,
      "comment": "\n     * Constructs a map decorator that decorates the given map and results in\n     * entries NEVER expiring. If there are any elements already in the map\n     * being decorated, they also will NEVER expire.\n     *\n     * @param map the map to decorate, must not be null.\n     * @throws IllegalArgumentException if the map is null.\n     ",
      "child_ranges": [
        "(line 327,col 9)-(line 327,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.PassiveExpiringMap.clear()",
      "begin_line": 334,
      "end_line": 338,
      "comment": "\n     * Normal {@link Map#clear()} behavior with the addition of clearing all\n     * expiration entries as well.\n     ",
      "child_ranges": [
        "(line 336,col 9)-(line 336,col 22)",
        "(line 337,col 9)-(line 337,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.PassiveExpiringMap.containsKey(java.lang.Object)",
      "begin_line": 345,
      "end_line": 349,
      "comment": "\n     * All expired entries are removed from the map prior to determining the\n     * contains result.\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 347,col 9)-(line 347,col 36)",
        "(line 348,col 9)-(line 348,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.PassiveExpiringMap.containsValue(java.lang.Object)",
      "begin_line": 356,
      "end_line": 360,
      "comment": "\n     * All expired entries are removed from the map prior to determining the\n     * contains result.\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 358,col 9)-(line 358,col 32)",
        "(line 359,col 9)-(line 359,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.PassiveExpiringMap.entrySet()",
      "begin_line": 366,
      "end_line": 370,
      "comment": "\n     * All expired entries are removed from the map prior to returning the entry set.\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 368,col 9)-(line 368,col 32)",
        "(line 369,col 9)-(line 369,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.PassiveExpiringMap.get(java.lang.Object)",
      "begin_line": 376,
      "end_line": 380,
      "comment": "\n     * All expired entries are removed from the map prior to returning the entry value.\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 378,col 9)-(line 378,col 36)",
        "(line 379,col 9)-(line 379,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.PassiveExpiringMap.isEmpty()",
      "begin_line": 386,
      "end_line": 390,
      "comment": "\n     * All expired entries are removed from the map prior to determining if it is empty.\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 388,col 9)-(line 388,col 32)",
        "(line 389,col 9)-(line 389,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.PassiveExpiringMap.isExpired(long, java.lang.Long)",
      "begin_line": 403,
      "end_line": 409,
      "comment": "\n     * Determines if the given expiration time is less than \u003ccode\u003enow\u003c/code\u003e.\n     *\n     * @param now the time in milliseconds used to compare against the\n     *        expiration time.\n     * @param expirationTimeObject the expiration time value retrieved from\n     *        {@link #expirationMap}, can be null.\n     * @return \u003ccode\u003etrue\u003c/code\u003e if \u003ccode\u003eexpirationTimeObject\u003c/code\u003e is \u0026ge; 0\n     *         and \u003ccode\u003eexpirationTimeObject\u003c/code\u003e \u0026lt; \u003ccode\u003enow\u003c/code\u003e.\n     *         \u003ccode\u003efalse\u003c/code\u003e otherwise.\n     ",
      "child_ranges": [
        "(line 404,col 9)-(line 407,col 9)",
        "(line 408,col 9)-(line 408,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.PassiveExpiringMap.keySet()",
      "begin_line": 415,
      "end_line": 419,
      "comment": "\n     * All expired entries are removed from the map prior to returning the key set.\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 417,col 9)-(line 417,col 32)",
        "(line 418,col 9)-(line 418,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.PassiveExpiringMap.now()",
      "begin_line": 424,
      "end_line": 426,
      "comment": "\n     * The current time in milliseconds.\n     ",
      "child_ranges": [
        "(line 425,col 9)-(line 425,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.PassiveExpiringMap.put(K, V)",
      "begin_line": 434,
      "end_line": 441,
      "comment": "\n    * Add the given key-value pair to this map as well as recording the entry\u0027s expiration time based on\n    * the current time in milliseconds and this map\u0027s {@link #expiringPolicy}.\n    * \u003cp\u003e\n    * {@inheritDoc}\n    ",
      "child_ranges": [
        "(line 437,col 9)-(line 437,col 78)",
        "(line 438,col 9)-(line 438,col 61)",
        "(line 440,col 9)-(line 440,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.PassiveExpiringMap.putAll(java.util.Map\u003c? extends K, ? extends V\u003e)",
      "begin_line": 443,
      "end_line": 448,
      "comment": "",
      "child_ranges": [
        "(line 445,col 9)-(line 447,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.PassiveExpiringMap.remove(java.lang.Object)",
      "begin_line": 455,
      "end_line": 459,
      "comment": "\n     * Normal {@link Map#remove(Object)} behavior with the addition of removing\n     * any expiration entry as well.\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 457,col 9)-(line 457,col 34)",
        "(line 458,col 9)-(line 458,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.PassiveExpiringMap.removeAllExpired(long)",
      "begin_line": 468,
      "end_line": 479,
      "comment": "\n     * Removes all entries in the map whose expiration time is less than\n     * \u003ccode\u003enow\u003c/code\u003e. The exceptions are entries with negative expiration\n     * times; those entries are never removed.\n     *\n     * @see #isExpired(long, Long)\n     ",
      "child_ranges": [
        "(line 469,col 9)-(line 469,col 91)",
        "(line 470,col 9)-(line 478,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.PassiveExpiringMap.removeIfExpired(java.lang.Object, long)",
      "begin_line": 486,
      "end_line": 491,
      "comment": "\n     * Removes the entry with the given key if the entry\u0027s expiration time is\n     * less than \u003ccode\u003enow\u003c/code\u003e. If the entry has a negative expiration time,\n     * the entry is never removed.\n     ",
      "child_ranges": [
        "(line 487,col 9)-(line 487,col 65)",
        "(line 488,col 9)-(line 490,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.PassiveExpiringMap.size()",
      "begin_line": 497,
      "end_line": 501,
      "comment": "\n     * All expired entries are removed from the map prior to returning the size.\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 499,col 9)-(line 499,col 32)",
        "(line 500,col 9)-(line 500,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.PassiveExpiringMap.readObject(java.io.ObjectInputStream)",
      "begin_line": 510,
      "end_line": 516,
      "comment": "\n     * Read the map in using a custom routine.\n     *\n     * @param in the input stream\n     * @throws IOException\n     * @throws ClassNotFoundException\n     ",
      "child_ranges": [
        "(line 514,col 9)-(line 514,col 31)",
        "(line 515,col 9)-(line 515,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.PassiveExpiringMap.writeObject(java.io.ObjectOutputStream)",
      "begin_line": 524,
      "end_line": 528,
      "comment": "\n     * Write the map out using a custom routine.\n     *\n     * @param out the output stream\n     * @throws IOException\n     ",
      "child_ranges": [
        "(line 526,col 9)-(line 526,col 33)",
        "(line 527,col 9)-(line 527,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.PassiveExpiringMap.values()",
      "begin_line": 534,
      "end_line": 538,
      "comment": "\n     * All expired entries are removed from the map prior to returning the value collection.\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 536,col 9)-(line 536,col 32)",
        "(line 537,col 9)-(line 537,col 30)"
      ]
    }
  ]
}