{
  "filepath": "/tmp/Collections-26b/src/main/java/org/apache/commons/collections4/map/PassiveExpiringMap.java",
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
      "end_line": 538,
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
      "comment": "\n         * Construct a policy with the given time-to-live constant measured in\n         * the given time unit of measure.\n         *\n         * @param timeToLive the constant amount of time an entry is available\n         *        before it expires. A negative value results in entries that\n         *        NEVER expire. A zero value results in entries that ALWAYS\n         *        expire.\n         * @param timeUnit the unit of time for the \u003ccode\u003etimeToLive\u003c/code\u003e\n         *        parameter, must not be null.\n         * @throws NullPointerException if the time unit is null.\n         ",
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
      "begin_line": 193,
      "end_line": 199,
      "comment": "\n     * First validate the input parameters. If the parameters are valid, convert\n     * the given time measured in the given units to the same time measured in\n     * milliseconds.\n     *\n     * @param timeToLive the constant amount of time an entry is available\n     *        before it expires. A negative value results in entries that NEVER\n     *        expire. A zero value results in entries that ALWAYS expire.\n     * @param timeUnit the unit of time for the \u003ccode\u003etimeToLive\u003c/code\u003e\n     *        parameter, must not be null.\n     * @throws NullPointerException if the time unit is null.\n     ",
      "child_ranges": [
        "(line 195,col 9)-(line 197,col 9)",
        "(line 198,col 9)-(line 198,col 67)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "expirationMap"
      ],
      "begin_line": 202,
      "end_line": 202,
      "comment": " map used to manage expiration times for the actual map entries. "
    },
    {
      "type": "field",
      "varNames": [
        "expiringPolicy"
      ],
      "begin_line": 205,
      "end_line": 205,
      "comment": " the policy used to determine time-to-live values for map entries. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.collections4.map.PassiveExpiringMap.PassiveExpiringMap()",
      "begin_line": 211,
      "end_line": 213,
      "comment": "\n     * Default constructor. Constructs a map decorator that results in entries\n     * NEVER expiring.\n     ",
      "child_ranges": [
        "(line 212,col 9)-(line 212,col 18)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.collections4.map.PassiveExpiringMap.PassiveExpiringMap(org.apache.commons.collections4.map.PassiveExpiringMap.ExpirationPolicy\u003cK, V\u003e)",
      "begin_line": 223,
      "end_line": 225,
      "comment": "\n     * Construct a map decorator using the given expiration policy to determine\n     * expiration times.\n     *\n     * @param expiringPolicy the policy used to determine expiration times of\n     *        entries as they are added.\n     * @throws NullPointerException if expiringPolicy is null\n     ",
      "child_ranges": [
        "(line 224,col 9)-(line 224,col 50)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.collections4.map.PassiveExpiringMap.PassiveExpiringMap(org.apache.commons.collections4.map.PassiveExpiringMap.ExpirationPolicy\u003cK, V\u003e, java.util.Map\u003cK, V\u003e)",
      "begin_line": 238,
      "end_line": 245,
      "comment": "\n     * Construct a map decorator that decorates the given map and uses the given\n     * expiration policy to determine expiration times. If there are any\n     * elements already in the map being decorated, they will NEVER expire\n     * unless they are replaced.\n     *\n     * @param expiringPolicy the policy used to determine expiration times of\n     *        entries as they are added.\n     * @param map the map to decorate, must not be null.\n     * @throws NullPointerException if the map or expiringPolicy is null.\n     ",
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
      "comment": "\n     * Construct a map decorator using the given time-to-live value measured in\n     * milliseconds to create and use a\n     * {@link ConstantTimeToLiveExpirationPolicy} expiration policy. If there\n     * are any elements already in the map being decorated, they will NEVER\n     * expire unless they are replaced.\n     *\n     * @param timeToLiveMillis the constant amount of time (in milliseconds) an\n     *        entry is available before it expires. A negative value results in\n     *        entries that NEVER expire. A zero value results in entries that\n     *        ALWAYS expire.\n     * @param map the map to decorate, must not be null.\n     * @throws NullPointerException if the map is null.\n     ",
      "child_ranges": [
        "(line 277,col 9)-(line 278,col 18)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.collections4.map.PassiveExpiringMap.PassiveExpiringMap(long, java.util.concurrent.TimeUnit)",
      "begin_line": 293,
      "end_line": 295,
      "comment": "\n     * Construct a map decorator using the given time-to-live value measured in\n     * the given time units of measure to create and use a\n     * {@link ConstantTimeToLiveExpirationPolicy} expiration policy.\n     *\n     * @param timeToLive the constant amount of time an entry is available\n     *        before it expires. A negative value results in entries that NEVER\n     *        expire. A zero value results in entries that ALWAYS expire.\n     * @param timeUnit the unit of time for the \u003ccode\u003etimeToLive\u003c/code\u003e\n     *        parameter, must not be null.\n     * @throws NullPointerException if the time unit is null.\n     ",
      "child_ranges": [
        "(line 294,col 9)-(line 294,col 63)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.collections4.map.PassiveExpiringMap.PassiveExpiringMap(long, java.util.concurrent.TimeUnit, java.util.Map\u003cK, V\u003e)",
      "begin_line": 313,
      "end_line": 315,
      "comment": "\n     * Construct a map decorator that decorates the given map using the given\n     * time-to-live value measured in the given time units of measure to create\n     * {@link ConstantTimeToLiveExpirationPolicy} expiration policy. This policy\n     * is used to determine expiration times. If there are any elements already\n     * in the map being decorated, they will NEVER expire unless they are\n     * replaced.\n     *\n     * @param timeToLive the constant amount of time an entry is available\n     *        before it expires. A negative value results in entries that NEVER\n     *        expire. A zero value results in entries that ALWAYS expire.\n     * @param timeUnit the unit of time for the \u003ccode\u003etimeToLive\u003c/code\u003e\n     *        parameter, must not be null.\n     * @param map the map to decorate, must not be null.\n     * @throws NullPointerException if the map or time unit is null.\n     ",
      "child_ranges": [
        "(line 314,col 9)-(line 314,col 68)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.collections4.map.PassiveExpiringMap.PassiveExpiringMap(java.util.Map\u003cK, V\u003e)",
      "begin_line": 325,
      "end_line": 327,
      "comment": "\n     * Constructs a map decorator that decorates the given map and results in\n     * entries NEVER expiring. If there are any elements already in the map\n     * being decorated, they also will NEVER expire.\n     *\n     * @param map the map to decorate, must not be null.\n     * @throws NullPointerException if the map is null.\n     ",
      "child_ranges": [
        "(line 326,col 9)-(line 326,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.PassiveExpiringMap.clear()",
      "begin_line": 333,
      "end_line": 337,
      "comment": "\n     * Normal {@link Map#clear()} behavior with the addition of clearing all\n     * expiration entries as well.\n     ",
      "child_ranges": [
        "(line 335,col 9)-(line 335,col 22)",
        "(line 336,col 9)-(line 336,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.PassiveExpiringMap.containsKey(java.lang.Object)",
      "begin_line": 344,
      "end_line": 348,
      "comment": "\n     * All expired entries are removed from the map prior to determining the\n     * contains result.\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 346,col 9)-(line 346,col 36)",
        "(line 347,col 9)-(line 347,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.PassiveExpiringMap.containsValue(java.lang.Object)",
      "begin_line": 355,
      "end_line": 359,
      "comment": "\n     * All expired entries are removed from the map prior to determining the\n     * contains result.\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 357,col 9)-(line 357,col 32)",
        "(line 358,col 9)-(line 358,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.PassiveExpiringMap.entrySet()",
      "begin_line": 365,
      "end_line": 369,
      "comment": "\n     * All expired entries are removed from the map prior to returning the entry set.\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 367,col 9)-(line 367,col 32)",
        "(line 368,col 9)-(line 368,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.PassiveExpiringMap.get(java.lang.Object)",
      "begin_line": 375,
      "end_line": 379,
      "comment": "\n     * All expired entries are removed from the map prior to returning the entry value.\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 377,col 9)-(line 377,col 36)",
        "(line 378,col 9)-(line 378,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.PassiveExpiringMap.isEmpty()",
      "begin_line": 385,
      "end_line": 389,
      "comment": "\n     * All expired entries are removed from the map prior to determining if it is empty.\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 387,col 9)-(line 387,col 32)",
        "(line 388,col 9)-(line 388,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.PassiveExpiringMap.isExpired(long, java.lang.Long)",
      "begin_line": 402,
      "end_line": 408,
      "comment": "\n     * Determines if the given expiration time is less than \u003ccode\u003enow\u003c/code\u003e.\n     *\n     * @param now the time in milliseconds used to compare against the\n     *        expiration time.\n     * @param expirationTimeObject the expiration time value retrieved from\n     *        {@link #expirationMap}, can be null.\n     * @return \u003ccode\u003etrue\u003c/code\u003e if \u003ccode\u003eexpirationTimeObject\u003c/code\u003e is \u0026ge; 0\n     *         and \u003ccode\u003eexpirationTimeObject\u003c/code\u003e \u0026lt; \u003ccode\u003enow\u003c/code\u003e.\n     *         \u003ccode\u003efalse\u003c/code\u003e otherwise.\n     ",
      "child_ranges": [
        "(line 403,col 9)-(line 406,col 9)",
        "(line 407,col 9)-(line 407,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.PassiveExpiringMap.keySet()",
      "begin_line": 414,
      "end_line": 418,
      "comment": "\n     * All expired entries are removed from the map prior to returning the key set.\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 416,col 9)-(line 416,col 32)",
        "(line 417,col 9)-(line 417,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.PassiveExpiringMap.now()",
      "begin_line": 423,
      "end_line": 425,
      "comment": "\n     * The current time in milliseconds.\n     ",
      "child_ranges": [
        "(line 424,col 9)-(line 424,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.PassiveExpiringMap.put(K, V)",
      "begin_line": 433,
      "end_line": 440,
      "comment": "\n    * Add the given key-value pair to this map as well as recording the entry\u0027s expiration time based on\n    * the current time in milliseconds and this map\u0027s {@link #expiringPolicy}.\n    * \u003cp\u003e\n    * {@inheritDoc}\n    ",
      "child_ranges": [
        "(line 436,col 9)-(line 436,col 78)",
        "(line 437,col 9)-(line 437,col 61)",
        "(line 439,col 9)-(line 439,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.PassiveExpiringMap.putAll(java.util.Map\u003c? extends K, ? extends V\u003e)",
      "begin_line": 442,
      "end_line": 447,
      "comment": "",
      "child_ranges": [
        "(line 444,col 9)-(line 446,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.PassiveExpiringMap.remove(java.lang.Object)",
      "begin_line": 454,
      "end_line": 458,
      "comment": "\n     * Normal {@link Map#remove(Object)} behavior with the addition of removing\n     * any expiration entry as well.\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 456,col 9)-(line 456,col 34)",
        "(line 457,col 9)-(line 457,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.PassiveExpiringMap.removeAllExpired(long)",
      "begin_line": 467,
      "end_line": 478,
      "comment": "\n     * Removes all entries in the map whose expiration time is less than\n     * \u003ccode\u003enow\u003c/code\u003e. The exceptions are entries with negative expiration\n     * times; those entries are never removed.\n     *\n     * @see #isExpired(long, Long)\n     ",
      "child_ranges": [
        "(line 468,col 9)-(line 468,col 91)",
        "(line 469,col 9)-(line 477,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.PassiveExpiringMap.removeIfExpired(java.lang.Object, long)",
      "begin_line": 485,
      "end_line": 490,
      "comment": "\n     * Removes the entry with the given key if the entry\u0027s expiration time is\n     * less than \u003ccode\u003enow\u003c/code\u003e. If the entry has a negative expiration time,\n     * the entry is never removed.\n     ",
      "child_ranges": [
        "(line 486,col 9)-(line 486,col 65)",
        "(line 487,col 9)-(line 489,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.PassiveExpiringMap.size()",
      "begin_line": 496,
      "end_line": 500,
      "comment": "\n     * All expired entries are removed from the map prior to returning the size.\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 498,col 9)-(line 498,col 32)",
        "(line 499,col 9)-(line 499,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.PassiveExpiringMap.readObject(java.io.ObjectInputStream)",
      "begin_line": 509,
      "end_line": 515,
      "comment": "\n     * Read the map in using a custom routine.\n     *\n     * @param in the input stream\n     * @throws IOException\n     * @throws ClassNotFoundException\n     ",
      "child_ranges": [
        "(line 513,col 9)-(line 513,col 31)",
        "(line 514,col 9)-(line 514,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.PassiveExpiringMap.writeObject(java.io.ObjectOutputStream)",
      "begin_line": 523,
      "end_line": 527,
      "comment": "\n     * Write the map out using a custom routine.\n     *\n     * @param out the output stream\n     * @throws IOException\n     ",
      "child_ranges": [
        "(line 525,col 9)-(line 525,col 33)",
        "(line 526,col 9)-(line 526,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.PassiveExpiringMap.values()",
      "begin_line": 533,
      "end_line": 537,
      "comment": "\n     * All expired entries are removed from the map prior to returning the value collection.\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 535,col 9)-(line 535,col 32)",
        "(line 536,col 9)-(line 536,col 30)"
      ]
    }
  ]
}