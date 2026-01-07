{
  "filepath": "/tmp/Codec-17b/src/main/java/org/apache/commons/codec/digest/HmacUtils.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "HmacUtils",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 57,
      "end_line": 1088,
      "comment": "\n * Simplifies common {@link javax.crypto.Mac} tasks. This class is immutable and thread-safe.\n * However the Mac may not be.\n * \u003cp\u003e\n * \u003cstrong\u003eNote: Not all JCE implementations support all algorithms. If not supported, an IllegalArgumentException is\n * thrown.\u003c/strong\u003e\n * \u003cp\u003e\n * Sample usage:\n * \u003cpre\u003e\n * import static HmacAlgorithms.*;\n * byte[] key \u003d {1,2,3,4}; // don\u0027t use this actual key!\n * String valueToDigest \u003d \"The quick brown fox jumps over the lazy dog\";\n * byte[] hmac \u003d new HmacUtils(HMAC_SHA_224, key).hmac(valueToDigest);\n * // Mac re-use\n * HmacUtils hm1 \u003d new HmacUtils(\"HmacAlgoName\", key); // use a valid name here!\n * String hexPom \u003d hm1.hmacHex(new File(\"pom.xml\"));\n * String hexNot \u003d hm1.hmacHex(new File(\"NOTICE.txt\"));\n * \u003c/pre\u003e\n * @since 1.10\n * @version $Id$\n "
    },
    {
      "type": "field",
      "varNames": [
        "STREAM_BUFFER_LENGTH"
      ],
      "begin_line": 59,
      "end_line": 59,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.digest.HmacUtils.isAvailable(java.lang.String)",
      "begin_line": 68,
      "end_line": 75,
      "comment": "\n    * Returns whether this algorithm is available\n    *\n    *@param name the name to check\n    * @return whether this algorithm is available\n    * @since 1.11\n    ",
      "child_ranges": [
        "(line 69,col 9)-(line 74,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.digest.HmacUtils.isAvailable(org.apache.commons.codec.digest.HmacAlgorithms)",
      "begin_line": 84,
      "end_line": 91,
      "comment": "\n    * Returns whether this algorithm is available\n    *\n    *@param name the name to check\n    * @return whether this algorithm is available\n    * @since 1.11\n    ",
      "child_ranges": [
        "(line 85,col 9)-(line 90,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.digest.HmacUtils.getHmacMd5(byte[])",
      "begin_line": 108,
      "end_line": 111,
      "comment": "\n     * Returns an initialized \u003ccode\u003eMac\u003c/code\u003e for the HmacMD5 algorithm.\n     * \u003cp\u003e\n     * Every implementation of the Java platform is required to support this standard Mac algorithm.\n     * \u003c/p\u003e\n     *\n     * @param key\n     *            They key for the keyed digest (must not be null)\n     * @return A Mac instance initialized with the given key.\n     * @see Mac#getInstance(String)\n     * @see Mac#init(Key)\n     * @throws IllegalArgumentException\n     *             when a {@link NoSuchAlgorithmException} is caught or key is null or key is invalid.\n     * @deprecated Use {@code getInitializedMac(HmacAlgorithms.HMAC_MD5, byte[])}\n     ",
      "child_ranges": [
        "(line 110,col 9)-(line 110,col 63)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.digest.HmacUtils.getHmacSha1(byte[])",
      "begin_line": 128,
      "end_line": 131,
      "comment": "\n     * Returns an initialized \u003ccode\u003eMac\u003c/code\u003e for the HmacSHA1 algorithm.\n     * \u003cp\u003e\n     * Every implementation of the Java platform is required to support this standard Mac algorithm.\n     * \u003c/p\u003e\n     *\n     * @param key\n     *            They key for the keyed digest (must not be null)\n     * @return A Mac instance initialized with the given key.\n     * @see Mac#getInstance(String)\n     * @see Mac#init(Key)\n     * @throws IllegalArgumentException\n     *             when a {@link NoSuchAlgorithmException} is caught or key is null or key is invalid.\n     * @deprecated Use {@code getInitializedMac(HmacAlgorithms.HMAC_SHA_1, byte[])}\n     ",
      "child_ranges": [
        "(line 130,col 9)-(line 130,col 65)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.digest.HmacUtils.getHmacSha256(byte[])",
      "begin_line": 148,
      "end_line": 151,
      "comment": "\n     * Returns an initialized \u003ccode\u003eMac\u003c/code\u003e for the HmacSHA256 algorithm.\n     * \u003cp\u003e\n     * Every implementation of the Java platform is required to support this standard Mac algorithm.\n     * \u003c/p\u003e\n     *\n     * @param key\n     *            They key for the keyed digest (must not be null)\n     * @return A Mac instance initialized with the given key.\n     * @see Mac#getInstance(String)\n     * @see Mac#init(Key)\n     * @throws IllegalArgumentException\n     *             when a {@link NoSuchAlgorithmException} is caught or key is null or key is invalid.\n     * @deprecated Use {@code getInitializedMac(HmacAlgorithms.HMAC_SHA_256, byte[])}\n     ",
      "child_ranges": [
        "(line 150,col 9)-(line 150,col 67)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.digest.HmacUtils.getHmacSha384(byte[])",
      "begin_line": 168,
      "end_line": 171,
      "comment": "\n     * Returns an initialized \u003ccode\u003eMac\u003c/code\u003e for the HmacSHA384 algorithm.\n     * \u003cp\u003e\n     * Every implementation of the Java platform is \u003cem\u003enot\u003c/em\u003e required to support this Mac algorithm.\n     * \u003c/p\u003e\n     *\n     * @param key\n     *            They key for the keyed digest (must not be null)\n     * @return A Mac instance initialized with the given key.\n     * @see Mac#getInstance(String)\n     * @see Mac#init(Key)\n     * @throws IllegalArgumentException\n     *             when a {@link NoSuchAlgorithmException} is caught or key is null or key is invalid.\n     * @deprecated Use {@code getInitializedMac(HmacAlgorithms.HMAC_SHA_384, byte[])}\n     ",
      "child_ranges": [
        "(line 170,col 9)-(line 170,col 67)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.digest.HmacUtils.getHmacSha512(byte[])",
      "begin_line": 188,
      "end_line": 191,
      "comment": "\n     * Returns an initialized \u003ccode\u003eMac\u003c/code\u003e for the HmacSHA512 algorithm.\n     * \u003cp\u003e\n     * Every implementation of the Java platform is \u003cem\u003enot\u003c/em\u003e required to support this Mac algorithm.\n     * \u003c/p\u003e\n     *\n     * @param key\n     *            They key for the keyed digest (must not be null)\n     * @return A Mac instance initialized with the given key.\n     * @see Mac#getInstance(String)\n     * @see Mac#init(Key)\n     * @throws IllegalArgumentException\n     *             when a {@link NoSuchAlgorithmException} is caught or key is null or key is invalid.\n     * @deprecated Use {@code getInitializedMac(HmacAlgorithms.HMAC_SHA_512, byte[])}\n     ",
      "child_ranges": [
        "(line 190,col 9)-(line 190,col 67)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.digest.HmacUtils.getInitializedMac(org.apache.commons.codec.digest.HmacAlgorithms, byte[])",
      "begin_line": 209,
      "end_line": 211,
      "comment": "\n     * Returns an initialized \u003ccode\u003eMac\u003c/code\u003e for the given \u003ccode\u003ealgorithm\u003c/code\u003e.\n     *\n     * @param algorithm\n     *            the name of the algorithm requested. See\n     *            \u003ca href\u003d \"http://docs.oracle.com/javase/6/docs/technotes/guides/security/crypto/CryptoSpec.html#AppA\"\n     *            \u003eAppendix A in the Java Cryptography Architecture Reference Guide\u003c/a\u003e for information about standard\n     *            algorithm names.\n     * @param key\n     *            They key for the keyed digest (must not be null)\n     * @return A Mac instance initialized with the given key.\n     * @see Mac#getInstance(String)\n     * @see Mac#init(Key)\n     * @throws IllegalArgumentException\n     *             when a {@link NoSuchAlgorithmException} is caught or key is null or key is invalid.\n     ",
      "child_ranges": [
        "(line 210,col 9)-(line 210,col 59)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.digest.HmacUtils.getInitializedMac(java.lang.String, byte[])",
      "begin_line": 229,
      "end_line": 245,
      "comment": "\n     * Returns an initialized \u003ccode\u003eMac\u003c/code\u003e for the given \u003ccode\u003ealgorithm\u003c/code\u003e.\n     *\n     * @param algorithm\n     *            the name of the algorithm requested. See\n     *            \u003ca href\u003d \"http://docs.oracle.com/javase/6/docs/technotes/guides/security/crypto/CryptoSpec.html#AppA\"\n     *            \u003eAppendix A in the Java Cryptography Architecture Reference Guide\u003c/a\u003e for information about standard\n     *            algorithm names.\n     * @param key\n     *            They key for the keyed digest (must not be null)\n     * @return A Mac instance initialized with the given key.\n     * @see Mac#getInstance(String)\n     * @see Mac#init(Key)\n     * @throws IllegalArgumentException\n     *             when a {@link NoSuchAlgorithmException} is caught or key is null or key is invalid.\n     ",
      "child_ranges": [
        "(line 231,col 9)-(line 233,col 9)",
        "(line 235,col 9)-(line 244,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.digest.HmacUtils.hmacMd5(byte[], byte[])",
      "begin_line": 261,
      "end_line": 264,
      "comment": "\n     * Returns a HmacMD5 Message Authentication Code (MAC) for the given key and value.\n     *\n     * @param key\n     *            They key for the keyed digest (must not be null)\n     * @param valueToDigest\n     *            The value (data) which should to digest (maybe empty or null)\n     * @return HmacMD5 MAC for the given key and value\n     * @throws IllegalArgumentException\n     *             when a {@link NoSuchAlgorithmException} is caught or key is null or key is invalid.\n     * @deprecated Use {@code new HmacUtils(HmacAlgorithms.HMAC_MD5, byte[]).hmac(byte[])}\n     ",
      "child_ranges": [
        "(line 263,col 9)-(line 263,col 79)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.digest.HmacUtils.hmacMd5(byte[], java.io.InputStream)",
      "begin_line": 283,
      "end_line": 286,
      "comment": "\n     * Returns a HmacMD5 Message Authentication Code (MAC) for the given key and value.\n     *\n     * @param key\n     *            They key for the keyed digest (must not be null)\n     * @param valueToDigest\n     *            The value (data) which should to digest\n     *            \u003cp\u003e\n     *            The InputStream must not be null and will not be closed\n     *            \u003c/p\u003e\n     * @return HmacMD5 MAC for the given key and value\n     * @throws IOException\n     *             If an I/O error occurs.\n     * @throws IllegalArgumentException\n     *             when a {@link NoSuchAlgorithmException} is caught or key is null or key is invalid.\n     * @deprecated Use {@code new HmacUtils(HmacAlgorithms.HMAC_MD5, byte[]).hmac(InputStream)}\n     ",
      "child_ranges": [
        "(line 285,col 9)-(line 285,col 79)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.digest.HmacUtils.hmacMd5(java.lang.String, java.lang.String)",
      "begin_line": 300,
      "end_line": 303,
      "comment": "\n     * Returns a HmacMD5 Message Authentication Code (MAC) for the given key and value.\n     *\n     * @param key\n     *            They key for the keyed digest (must not be null)\n     * @param valueToDigest\n     *            The value (data) which should to digest (maybe empty or null)\n     * @return HmacMD5 MAC for the given key and value\n     * @throws IllegalArgumentException\n     *             when a {@link NoSuchAlgorithmException} is caught or key is null or key is invalid.\n     * @deprecated Use {@code new HmacUtils(HmacAlgorithms.HMAC_MD5, String).hmac(String)}\n     ",
      "child_ranges": [
        "(line 302,col 9)-(line 302,col 79)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.digest.HmacUtils.hmacMd5Hex(byte[], byte[])",
      "begin_line": 317,
      "end_line": 320,
      "comment": "\n     * Returns a HmacMD5 Message Authentication Code (MAC) as a hex string (lowercase) for the given key and value.\n     *\n     * @param key\n     *            They key for the keyed digest (must not be null)\n     * @param valueToDigest\n     *            The value (data) which should to digest (maybe empty or null)\n     * @return HmacMD5 MAC for the given key and value as a hex string (lowercase)\n     * @throws IllegalArgumentException\n     *             when a {@link NoSuchAlgorithmException} is caught or key is null or key is invalid.\n     * @deprecated Use {@code new HmacUtils(HmacAlgorithms.HMAC_MD5, byte[]).hmacHex(byte[])}\n     ",
      "child_ranges": [
        "(line 319,col 9)-(line 319,col 82)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.digest.HmacUtils.hmacMd5Hex(byte[], java.io.InputStream)",
      "begin_line": 339,
      "end_line": 342,
      "comment": "\n     * Returns a HmacMD5 Message Authentication Code (MAC) as a hex string (lowercase) for the given key and value.\n     *\n     * @param key\n     *            They key for the keyed digest (must not be null)\n     * @param valueToDigest\n     *            The value (data) which should to digest\n     *            \u003cp\u003e\n     *            The InputStream must not be null and will not be closed\n     *            \u003c/p\u003e\n     * @return HmacMD5 MAC for the given key and value as a hex string (lowercase)\n     * @throws IOException\n     *             If an I/O error occurs.\n     * @throws IllegalArgumentException\n     *             when a {@link NoSuchAlgorithmException} is caught or key is null or key is invalid.\n     * @deprecated Use {@code new HmacUtils(HmacAlgorithms.HMAC_MD5, byte[]).hmacHex(InputStream)}\n     ",
      "child_ranges": [
        "(line 341,col 9)-(line 341,col 82)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.digest.HmacUtils.hmacMd5Hex(java.lang.String, java.lang.String)",
      "begin_line": 356,
      "end_line": 359,
      "comment": "\n     * Returns a HmacMD5 Message Authentication Code (MAC) as a hex string (lowercase) for the given key and value.\n     *\n     * @param key\n     *            They key for the keyed digest (must not be null)\n     * @param valueToDigest\n     *            The value (data) which should to digest (maybe empty or null)\n     * @return HmacMD5 MAC for the given key and value as a hex string (lowercase)\n     * @throws IllegalArgumentException\n     *             when a {@link NoSuchAlgorithmException} is caught or key is null or key is invalid.\n     * @deprecated Use {@code new HmacUtils(HmacAlgorithms.HMAC_MD5, String).hmacHex(String)}\n     ",
      "child_ranges": [
        "(line 358,col 9)-(line 358,col 82)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.digest.HmacUtils.hmacSha1(byte[], byte[])",
      "begin_line": 375,
      "end_line": 378,
      "comment": "\n     * Returns a HmacSHA1 Message Authentication Code (MAC) for the given key and value.\n     *\n     * @param key\n     *            They key for the keyed digest (must not be null)\n     * @param valueToDigest\n     *            The value (data) which should to digest (maybe empty or null)\n     * @return HmacSHA1 MAC for the given key and value\n     * @throws IllegalArgumentException\n     *             when a {@link NoSuchAlgorithmException} is caught or key is null or key is invalid.\n     * @deprecated Use {@code new HmacUtils(HmacAlgorithms.HMAC_SHA_1, byte[]).hmac(byte[])}\n     ",
      "child_ranges": [
        "(line 377,col 9)-(line 377,col 81)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.digest.HmacUtils.hmacSha1(byte[], java.io.InputStream)",
      "begin_line": 397,
      "end_line": 400,
      "comment": "\n     * Returns a HmacSHA1 Message Authentication Code (MAC) for the given key and value.\n     *\n     * @param key\n     *            They key for the keyed digest (must not be null)\n     * @param valueToDigest\n     *            The value (data) which should to digest\n     *            \u003cp\u003e\n     *            The InputStream must not be null and will not be closed\n     *            \u003c/p\u003e\n     * @return HmacSHA1 MAC for the given key and value\n     * @throws IOException\n     *             If an I/O error occurs.\n     * @throws IllegalArgumentException\n     *             when a {@link NoSuchAlgorithmException} is caught or key is null or key is invalid.\n     * @deprecated Use {@code new HmacUtils(HmacAlgorithms.HMAC_SHA_1, byte[]).hmac(InputStream)}\n     ",
      "child_ranges": [
        "(line 399,col 9)-(line 399,col 81)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.digest.HmacUtils.hmacSha1(java.lang.String, java.lang.String)",
      "begin_line": 414,
      "end_line": 417,
      "comment": "\n     * Returns a HmacSHA1 Message Authentication Code (MAC) for the given key and value.\n     *\n     * @param key\n     *            They key for the keyed digest (must not be null)\n     * @param valueToDigest\n     *            The value (data) which should to digest (maybe empty or null)\n     * @return HmacSHA1 MAC for the given key and value\n     * @throws IllegalArgumentException\n     *             when a {@link NoSuchAlgorithmException} is caught or key is null or key is invalid.\n     * @deprecated Use {@code new HmacUtils(HmacAlgorithms.HMAC_SHA_1, String).hmac(String)}\n     ",
      "child_ranges": [
        "(line 416,col 9)-(line 416,col 81)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.digest.HmacUtils.hmacSha1Hex(byte[], byte[])",
      "begin_line": 431,
      "end_line": 434,
      "comment": "\n     * Returns a HmacSHA1 Message Authentication Code (MAC) as hex string (lowercase) for the given key and value.\n     *\n     * @param key\n     *            They key for the keyed digest (must not be null)\n     * @param valueToDigest\n     *            The value (data) which should to digest (maybe empty or null)\n     * @return HmacSHA1 MAC for the given key and value as hex string (lowercase)\n     * @throws IllegalArgumentException\n     *             when a {@link NoSuchAlgorithmException} is caught or key is null or key is invalid.\n     * @deprecated Use {@code new HmacUtils(HmacAlgorithms.HMAC_SHA_1, byte[]).hmacHex(byte[])}\n     ",
      "child_ranges": [
        "(line 433,col 9)-(line 433,col 84)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.digest.HmacUtils.hmacSha1Hex(byte[], java.io.InputStream)",
      "begin_line": 453,
      "end_line": 456,
      "comment": "\n     * Returns a HmacSHA1 Message Authentication Code (MAC) as hex string (lowercase) for the given key and value.\n     *\n     * @param key\n     *            They key for the keyed digest (must not be null)\n     * @param valueToDigest\n     *            The value (data) which should to digest\n     *            \u003cp\u003e\n     *            The InputStream must not be null and will not be closed\n     *            \u003c/p\u003e\n     * @return HmacSHA1 MAC for the given key and value as hex string (lowercase)\n     * @throws IOException\n     *             If an I/O error occurs.\n     * @throws IllegalArgumentException\n     *             when a {@link NoSuchAlgorithmException} is caught or key is null or key is invalid.\n     * @deprecated Use {@code new HmacUtils(HmacAlgorithms.HMAC_SHA_1, byte[]).hmacHex(InputStream)}\n     ",
      "child_ranges": [
        "(line 455,col 9)-(line 455,col 84)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.digest.HmacUtils.hmacSha1Hex(java.lang.String, java.lang.String)",
      "begin_line": 470,
      "end_line": 473,
      "comment": "\n     * Returns a HmacSHA1 Message Authentication Code (MAC) as hex string (lowercase) for the given key and value.\n     *\n     * @param key\n     *            They key for the keyed digest (must not be null)\n     * @param valueToDigest\n     *            The value (data) which should to digest (maybe empty or null)\n     * @return HmacSHA1 MAC for the given key and value as hex string (lowercase)\n     * @throws IllegalArgumentException\n     *             when a {@link NoSuchAlgorithmException} is caught or key is null or key is invalid.\n     * @deprecated Use {@code new HmacUtils(HmacAlgorithms.HMAC_SHA_1, String).hmacHex(String)}\n     ",
      "child_ranges": [
        "(line 472,col 9)-(line 472,col 84)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.digest.HmacUtils.hmacSha256(byte[], byte[])",
      "begin_line": 489,
      "end_line": 492,
      "comment": "\n     * Returns a HmacSHA256 Message Authentication Code (MAC) for the given key and value.\n     *\n     * @param key\n     *            They key for the keyed digest (must not be null)\n     * @param valueToDigest\n     *            The value (data) which should to digest (maybe empty or null)\n     * @return HmacSHA256 MAC for the given key and value\n     * @throws IllegalArgumentException\n     *             when a {@link NoSuchAlgorithmException} is caught or key is null or key is invalid.\n     * @deprecated Use {@code new HmacUtils(HmacAlgorithms.HMAC_SHA_256, byte[]).hmac(byte[])}\n     ",
      "child_ranges": [
        "(line 491,col 9)-(line 491,col 83)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.digest.HmacUtils.hmacSha256(byte[], java.io.InputStream)",
      "begin_line": 511,
      "end_line": 514,
      "comment": "\n     * Returns a HmacSHA256 Message Authentication Code (MAC) for the given key and value.\n     *\n     * @param key\n     *            They key for the keyed digest (must not be null)\n     * @param valueToDigest\n     *            The value (data) which should to digest\n     *            \u003cp\u003e\n     *            The InputStream must not be null and will not be closed\n     *            \u003c/p\u003e\n     * @return HmacSHA256 MAC for the given key and value\n     * @throws IOException\n     *             If an I/O error occurs.\n     * @throws IllegalArgumentException\n     *             when a {@link NoSuchAlgorithmException} is caught or key is null or key is invalid.\n     * @deprecated Use {@code new HmacUtils(HmacAlgorithms.HMAC_SHA_256, byte[]).hmac(InputStream)}\n     ",
      "child_ranges": [
        "(line 513,col 9)-(line 513,col 83)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.digest.HmacUtils.hmacSha256(java.lang.String, java.lang.String)",
      "begin_line": 528,
      "end_line": 531,
      "comment": "\n     * Returns a HmacSHA256 Message Authentication Code (MAC) for the given key and value.\n     *\n     * @param key\n     *            They key for the keyed digest (must not be null)\n     * @param valueToDigest\n     *            The value (data) which should to digest (maybe empty or null)\n     * @return HmacSHA256 MAC for the given key and value\n     * @throws IllegalArgumentException\n     *             when a {@link NoSuchAlgorithmException} is caught or key is null or key is invalid.\n     * @deprecated Use {@code new HmacUtils(HmacAlgorithms.HMAC_SHA_256, String).hmac(String)}\n     ",
      "child_ranges": [
        "(line 530,col 9)-(line 530,col 83)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.digest.HmacUtils.hmacSha256Hex(byte[], byte[])",
      "begin_line": 545,
      "end_line": 548,
      "comment": "\n     * Returns a HmacSHA256 Message Authentication Code (MAC) as hex string (lowercase) for the given key and value.\n     *\n     * @param key\n     *            They key for the keyed digest (must not be null)\n     * @param valueToDigest\n     *            The value (data) which should to digest (maybe empty or null)\n     * @return HmacSHA256 MAC for the given key and value as hex string (lowercase)\n     * @throws IllegalArgumentException\n     *             when a {@link NoSuchAlgorithmException} is caught or key is null or key is invalid.\n     * @deprecated Use {@code new HmacUtils(HmacAlgorithms.HMAC_SHA_256, byte[]).hmacHex(byte[])}\n     ",
      "child_ranges": [
        "(line 547,col 9)-(line 547,col 86)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.digest.HmacUtils.hmacSha256Hex(byte[], java.io.InputStream)",
      "begin_line": 567,
      "end_line": 570,
      "comment": "\n     * Returns a HmacSHA256 Message Authentication Code (MAC) as hex string (lowercase) for the given key and value.\n     *\n     * @param key\n     *            They key for the keyed digest (must not be null)\n     * @param valueToDigest\n     *            The value (data) which should to digest\n     *            \u003cp\u003e\n     *            The InputStream must not be null and will not be closed\n     *            \u003c/p\u003e\n     * @return HmacSHA256 MAC for the given key and value as hex string (lowercase)\n     * @throws IOException\n     *             If an I/O error occurs.\n     * @throws IllegalArgumentException\n     *             when a {@link NoSuchAlgorithmException} is caught or key is null or key is invalid.\n     * @deprecated Use {@code new HmacUtils(HmacAlgorithms.HMAC_SHA_256, byte[]).hmacHex(InputStream)}\n     ",
      "child_ranges": [
        "(line 569,col 9)-(line 569,col 86)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.digest.HmacUtils.hmacSha256Hex(java.lang.String, java.lang.String)",
      "begin_line": 584,
      "end_line": 587,
      "comment": "\n     * Returns a HmacSHA256 Message Authentication Code (MAC) as hex string (lowercase) for the given key and value.\n     *\n     * @param key\n     *            They key for the keyed digest (must not be null)\n     * @param valueToDigest\n     *            The value (data) which should to digest (maybe empty or null)\n     * @return HmacSHA256 MAC for the given key and value as hex string (lowercase)\n     * @throws IllegalArgumentException\n     *             when a {@link NoSuchAlgorithmException} is caught or key is null or key is invalid.\n     * @deprecated Use {@code new HmacUtils(HmacAlgorithms.HMAC_SHA_256, String).hmacHex(String)}\n     ",
      "child_ranges": [
        "(line 586,col 9)-(line 586,col 86)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.digest.HmacUtils.hmacSha384(byte[], byte[])",
      "begin_line": 603,
      "end_line": 606,
      "comment": "\n     * Returns a HmacSHA384 Message Authentication Code (MAC) for the given key and value.\n     *\n     * @param key\n     *            They key for the keyed digest (must not be null)\n     * @param valueToDigest\n     *            The value (data) which should to digest (maybe empty or null)\n     * @return HmacSHA384 MAC for the given key and value\n     * @throws IllegalArgumentException\n     *             when a {@link NoSuchAlgorithmException} is caught or key is null or key is invalid.\n     * @deprecated Use {@code new HmacUtils(HmacAlgorithms.HMAC_SHA_384, byte[]).hmac(byte[])}\n     ",
      "child_ranges": [
        "(line 605,col 9)-(line 605,col 83)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.digest.HmacUtils.hmacSha384(byte[], java.io.InputStream)",
      "begin_line": 625,
      "end_line": 628,
      "comment": "\n     * Returns a HmacSHA384 Message Authentication Code (MAC) for the given key and value.\n     *\n     * @param key\n     *            They key for the keyed digest (must not be null)\n     * @param valueToDigest\n     *            The value (data) which should to digest\n     *            \u003cp\u003e\n     *            The InputStream must not be null and will not be closed\n     *            \u003c/p\u003e\n     * @return HmacSHA384 MAC for the given key and value\n     * @throws IOException\n     *             If an I/O error occurs.\n     * @throws IllegalArgumentException\n     *             when a {@link NoSuchAlgorithmException} is caught or key is null or key is invalid.\n     * @deprecated Use {@code new HmacUtils(HmacAlgorithms.HMAC_SHA_384, byte[]).hmac(InputStream)}\n     ",
      "child_ranges": [
        "(line 627,col 9)-(line 627,col 83)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.digest.HmacUtils.hmacSha384(java.lang.String, java.lang.String)",
      "begin_line": 642,
      "end_line": 645,
      "comment": "\n     * Returns a HmacSHA384 Message Authentication Code (MAC) for the given key and value.\n     *\n     * @param key\n     *            They key for the keyed digest (must not be null)\n     * @param valueToDigest\n     *            The value (data) which should to digest (maybe empty or null)\n     * @return HmacSHA384 MAC for the given key and value\n     * @throws IllegalArgumentException\n     *             when a {@link NoSuchAlgorithmException} is caught or key is null or key is invalid.\n     * @deprecated Use {@code new HmacUtils(HmacAlgorithms.HMAC_SHA_384, String).hmac(String)}\n     ",
      "child_ranges": [
        "(line 644,col 9)-(line 644,col 83)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.digest.HmacUtils.hmacSha384Hex(byte[], byte[])",
      "begin_line": 659,
      "end_line": 662,
      "comment": "\n     * Returns a HmacSHA384 Message Authentication Code (MAC) as hex string (lowercase) for the given key and value.\n     *\n     * @param key\n     *            They key for the keyed digest (must not be null)\n     * @param valueToDigest\n     *            The value (data) which should to digest (maybe empty or null)\n     * @return HmacSHA384 MAC for the given key and value as hex string (lowercase)\n     * @throws IllegalArgumentException\n     *             when a {@link NoSuchAlgorithmException} is caught or key is null or key is invalid.\n     * @deprecated Use {@code new HmacUtils(HmacAlgorithms.HMAC_SHA_384, byte[]).hmacHex(byte[])}\n     ",
      "child_ranges": [
        "(line 661,col 9)-(line 661,col 86)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.digest.HmacUtils.hmacSha384Hex(byte[], java.io.InputStream)",
      "begin_line": 681,
      "end_line": 684,
      "comment": "\n     * Returns a HmacSHA384 Message Authentication Code (MAC) as hex string (lowercase) for the given key and value.\n     *\n     * @param key\n     *            They key for the keyed digest (must not be null)\n     * @param valueToDigest\n     *            The value (data) which should to digest\n     *            \u003cp\u003e\n     *            The InputStream must not be null and will not be closed\n     *            \u003c/p\u003e\n     * @return HmacSHA384 MAC for the given key and value as hex string (lowercase)\n     * @throws IOException\n     *             If an I/O error occurs.\n     * @throws IllegalArgumentException\n     *             when a {@link NoSuchAlgorithmException} is caught or key is null or key is invalid.\n     * @deprecated Use {@code new HmacUtils(HmacAlgorithms.HMAC_SHA_384, byte[]).hmacHex(InputStream)}\n     ",
      "child_ranges": [
        "(line 683,col 9)-(line 683,col 86)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.digest.HmacUtils.hmacSha384Hex(java.lang.String, java.lang.String)",
      "begin_line": 698,
      "end_line": 701,
      "comment": "\n     * Returns a HmacSHA384 Message Authentication Code (MAC) as hex string (lowercase) for the given key and value.\n     *\n     * @param key\n     *            They key for the keyed digest (must not be null)\n     * @param valueToDigest\n     *            The value (data) which should to digest (maybe empty or null)\n     * @return HmacSHA384 MAC for the given key and value as hex string (lowercase)\n     * @throws IllegalArgumentException\n     *             when a {@link NoSuchAlgorithmException} is caught or key is null or key is invalid.\n     * @deprecated Use {@code new HmacUtils(HmacAlgorithms.HMAC_SHA_384, String).hmacHex(String)}\n     ",
      "child_ranges": [
        "(line 700,col 9)-(line 700,col 86)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.digest.HmacUtils.hmacSha512(byte[], byte[])",
      "begin_line": 717,
      "end_line": 720,
      "comment": "\n     * Returns a HmacSHA512 Message Authentication Code (MAC) for the given key and value.\n     *\n     * @param key\n     *            They key for the keyed digest (must not be null)\n     * @param valueToDigest\n     *            The value (data) which should to digest (maybe empty or null)\n     * @return HmacSHA512 MAC for the given key and value\n     * @throws IllegalArgumentException\n     *             when a {@link NoSuchAlgorithmException} is caught or key is null or key is invalid.\n     * @deprecated Use {@code new HmacUtils(HmacAlgorithms.HMAC_SHA_512, byte[]).hmac(byte[])}\n     ",
      "child_ranges": [
        "(line 719,col 9)-(line 719,col 83)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.digest.HmacUtils.hmacSha512(byte[], java.io.InputStream)",
      "begin_line": 739,
      "end_line": 742,
      "comment": "\n     * Returns a HmacSHA512 Message Authentication Code (MAC) for the given key and value.\n     *\n     * @param key\n     *            They key for the keyed digest (must not be null)\n     * @param valueToDigest\n     *            The value (data) which should to digest\n     *            \u003cp\u003e\n     *            The InputStream must not be null and will not be closed\n     *            \u003c/p\u003e\n     * @return HmacSHA512 MAC for the given key and value\n     * @throws IOException\n     *             If an I/O error occurs.\n     * @throws IllegalArgumentException\n     *             when a {@link NoSuchAlgorithmException} is caught or key is null or key is invalid.\n     * @deprecated Use {@code new HmacUtils(HmacAlgorithms.HMAC_SHA_512, byte[]).hmac(InputStream)}\n     ",
      "child_ranges": [
        "(line 741,col 9)-(line 741,col 83)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.digest.HmacUtils.hmacSha512(java.lang.String, java.lang.String)",
      "begin_line": 756,
      "end_line": 759,
      "comment": "\n     * Returns a HmacSHA512 Message Authentication Code (MAC) for the given key and value.\n     *\n     * @param key\n     *            They key for the keyed digest (must not be null)\n     * @param valueToDigest\n     *            The value (data) which should to digest (maybe empty or null)\n     * @return HmacSHA512 MAC for the given key and value\n     * @throws IllegalArgumentException\n     *             when a {@link NoSuchAlgorithmException} is caught or key is null or key is invalid.\n     * @deprecated Use {@code new HmacUtils(HmacAlgorithms.HMAC_SHA_512, String).hmac(String)}\n     ",
      "child_ranges": [
        "(line 758,col 9)-(line 758,col 83)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.digest.HmacUtils.hmacSha512Hex(byte[], byte[])",
      "begin_line": 773,
      "end_line": 776,
      "comment": "\n     * Returns a HmacSHA512 Message Authentication Code (MAC) as hex string (lowercase) for the given key and value.\n     *\n     * @param key\n     *            They key for the keyed digest (must not be null)\n     * @param valueToDigest\n     *            The value (data) which should to digest (maybe empty or null)\n     * @return HmacSHA512 MAC for the given key and value as hex string (lowercase)\n     * @throws IllegalArgumentException\n     *             when a {@link NoSuchAlgorithmException} is caught or key is null or key is invalid.\n     * @deprecated Use {@code new HmacUtils(HmacAlgorithms.HMAC_SHA_512, byte[]).hmacHex(byte[])}\n     ",
      "child_ranges": [
        "(line 775,col 9)-(line 775,col 86)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.digest.HmacUtils.hmacSha512Hex(byte[], java.io.InputStream)",
      "begin_line": 795,
      "end_line": 798,
      "comment": "\n     * Returns a HmacSHA512 Message Authentication Code (MAC) as hex string (lowercase) for the given key and value.\n     *\n     * @param key\n     *            They key for the keyed digest (must not be null)\n     * @param valueToDigest\n     *            The value (data) which should to digest\n     *            \u003cp\u003e\n     *            The InputStream must not be null and will not be closed\n     *            \u003c/p\u003e\n     * @return HmacSHA512 MAC for the given key and value as hex string (lowercase)\n     * @throws IOException\n     *             If an I/O error occurs.\n     * @throws IllegalArgumentException\n     *             when a {@link NoSuchAlgorithmException} is caught or key is null or key is invalid.\n     * @deprecated Use {@code new HmacUtils(HmacAlgorithms.HMAC_SHA_512, byte[]).hmacHex(InputStream)}\n     ",
      "child_ranges": [
        "(line 797,col 9)-(line 797,col 86)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.digest.HmacUtils.hmacSha512Hex(java.lang.String, java.lang.String)",
      "begin_line": 812,
      "end_line": 815,
      "comment": "\n     * Returns a HmacSHA512 Message Authentication Code (MAC) as hex string (lowercase) for the given key and value.\n     *\n     * @param key\n     *            They key for the keyed digest (must not be null)\n     * @param valueToDigest\n     *            The value (data) which should to digest (maybe empty or null)\n     * @return HmacSHA512 MAC for the given key and value as hex string (lowercase)\n     * @throws IllegalArgumentException\n     *             when a {@link NoSuchAlgorithmException} is caught or key is null or key is invalid.\n     * @deprecated Use {@code new HmacUtils(HmacAlgorithms.HMAC_SHA_512, String).hmacHex(String)}\n     ",
      "child_ranges": [
        "(line 814,col 9)-(line 814,col 86)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.digest.HmacUtils.updateHmac(javax.crypto.Mac, byte[])",
      "begin_line": 830,
      "end_line": 834,
      "comment": "\n     * Resets and then updates the given {@link Mac} with the value.\n     *\n     * @param mac\n     *            the initialized {@link Mac} to update\n     * @param valueToDigest\n     *            the value to update the {@link Mac} with (maybe null or empty)\n     * @return the updated {@link Mac}\n     * @throws IllegalStateException\n     *             if the Mac was not initialized\n     ",
      "child_ranges": [
        "(line 831,col 9)-(line 831,col 20)",
        "(line 832,col 9)-(line 832,col 34)",
        "(line 833,col 9)-(line 833,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.digest.HmacUtils.updateHmac(javax.crypto.Mac, java.io.InputStream)",
      "begin_line": 852,
      "end_line": 863,
      "comment": "\n     * Resets and then updates the given {@link Mac} with the value.\n     *\n     * @param mac\n     *            the initialized {@link Mac} to update\n     * @param valueToDigest\n     *            the value to update the {@link Mac} with\n     *            \u003cp\u003e\n     *            The InputStream must not be null and will not be closed\n     *            \u003c/p\u003e\n     * @return the updated {@link Mac}\n     * @throws IOException\n     *             If an I/O error occurs.\n     * @throws IllegalStateException\n     *             If the Mac was not initialized\n     ",
      "child_ranges": [
        "(line 853,col 9)-(line 853,col 20)",
        "(line 854,col 9)-(line 854,col 61)",
        "(line 855,col 9)-(line 855,col 71)",
        "(line 857,col 9)-(line 860,col 9)",
        "(line 862,col 9)-(line 862,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.digest.HmacUtils.updateHmac(javax.crypto.Mac, java.lang.String)",
      "begin_line": 876,
      "end_line": 880,
      "comment": "\n     * Resets and then updates the given {@link Mac} with the value.\n     *\n     * @param mac\n     *            the initialized {@link Mac} to update\n     * @param valueToDigest\n     *            the value to update the {@link Mac} with (maybe null or empty)\n     * @return the updated {@link Mac}\n     * @throws IllegalStateException\n     *             if the Mac was not initialized\n     ",
      "child_ranges": [
        "(line 877,col 9)-(line 877,col 20)",
        "(line 878,col 9)-(line 878,col 60)",
        "(line 879,col 9)-(line 879,col 19)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.codec.digest.HmacUtils.HmacUtils()",
      "begin_line": 887,
      "end_line": 890,
      "comment": "\n     * Preserves binary compatibity only.\n     * As for previous versions does not provide useful behaviour\n     * @deprecated since 1.11; only useful to preserve binary compatibility\n     ",
      "child_ranges": [
        "(line 889,col 9)-(line 889,col 19)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "mac"
      ],
      "begin_line": 892,
      "end_line": 892,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.codec.digest.HmacUtils.HmacUtils(javax.crypto.Mac)",
      "begin_line": 894,
      "end_line": 896,
      "comment": "",
      "child_ranges": [
        "(line 895,col 9)-(line 895,col 23)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.codec.digest.HmacUtils.HmacUtils(java.lang.String, byte[])",
      "begin_line": 907,
      "end_line": 909,
      "comment": "\n     * Creates an instance using the provided algorithm type.\n     *\n     * @param algorithm to use\n     * @param  key the key to use\n     * @throws IllegalArgumentException\n     *             when a {@link NoSuchAlgorithmException} is caught or key is null or key is invalid.\n     * @since 1.11\n     ",
      "child_ranges": [
        "(line 908,col 9)-(line 908,col 48)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.codec.digest.HmacUtils.HmacUtils(java.lang.String, java.lang.String)",
      "begin_line": 920,
      "end_line": 922,
      "comment": "\n     * Creates an instance using the provided algorithm type.\n     *\n     * @param algorithm to use\n     * @param  key the key to use\n     * @throws IllegalArgumentException\n     *             when a {@link NoSuchAlgorithmException} is caught or key is null or key is invalid.\n     * @since 1.11\n     ",
      "child_ranges": [
        "(line 921,col 9)-(line 921,col 55)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.codec.digest.HmacUtils.HmacUtils(org.apache.commons.codec.digest.HmacAlgorithms, java.lang.String)",
      "begin_line": 933,
      "end_line": 935,
      "comment": "\n     * Creates an instance using the provided algorithm type.\n     *\n     * @param algorithm to use\n     * @param  key the key to use\n     * @throws IllegalArgumentException\n     *             when a {@link NoSuchAlgorithmException} is caught or key is null or key is invalid.\n     * @since 1.11\n     ",
      "child_ranges": [
        "(line 934,col 9)-(line 934,col 65)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.codec.digest.HmacUtils.HmacUtils(org.apache.commons.codec.digest.HmacAlgorithms, byte[])",
      "begin_line": 946,
      "end_line": 948,
      "comment": "\n     * Creates an instance using the provided algorithm type.\n     *\n     * @param algorithm to use.\n     * @param key the key to use\n     * @throws IllegalArgumentException\n     *             when a {@link NoSuchAlgorithmException} is caught or key is null or key is invalid.\n     * @since 1.11\n     ",
      "child_ranges": [
        "(line 947,col 9)-(line 947,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.digest.HmacUtils.hmac(byte[])",
      "begin_line": 957,
      "end_line": 959,
      "comment": "\n     * Returns the digest for the input data.\n     *\n     * @param valueToDigest the input to use\n     * @return the digest as a byte[]\n     * @since 1.11\n     ",
      "child_ranges": [
        "(line 958,col 9)-(line 958,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.digest.HmacUtils.hmacHex(byte[])",
      "begin_line": 968,
      "end_line": 970,
      "comment": "\n     * Returns the digest for the input data.\n     *\n     * @param valueToDigest the input to use\n     * @return the digest as a hex String\n     * @since 1.11\n     ",
      "child_ranges": [
        "(line 969,col 9)-(line 969,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.digest.HmacUtils.hmac(java.lang.String)",
      "begin_line": 979,
      "end_line": 981,
      "comment": "\n     * Returns the digest for the input data.\n     *\n     * @param valueToDigest the input to use, treated as UTF-8\n     * @return the digest as a byte[]\n     * @since 1.11\n     ",
      "child_ranges": [
        "(line 980,col 9)-(line 980,col 68)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.digest.HmacUtils.hmacHex(java.lang.String)",
      "begin_line": 990,
      "end_line": 992,
      "comment": "\n     * Returns the digest for the input data.\n     *\n     * @param valueToDigest the input to use, treated as UTF-8\n     * @return the digest as a hex String\n     * @since 1.11\n     ",
      "child_ranges": [
        "(line 991,col 9)-(line 991,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.digest.HmacUtils.hmac(java.nio.ByteBuffer)",
      "begin_line": 1001,
      "end_line": 1004,
      "comment": "\n     * Returns the digest for the input data.\n     *\n     * @param valueToDigest the input to use\n     * @return the digest as a byte[]\n     * @since 1.11\n     ",
      "child_ranges": [
        "(line 1002,col 9)-(line 1002,col 34)",
        "(line 1003,col 9)-(line 1003,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.digest.HmacUtils.hmacHex(java.nio.ByteBuffer)",
      "begin_line": 1013,
      "end_line": 1015,
      "comment": "\n     * Returns the digest for the input data.\n     *\n     * @param valueToDigest the input to use\n     * @return the digest as a hex String\n     * @since 1.11\n     ",
      "child_ranges": [
        "(line 1014,col 9)-(line 1014,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.digest.HmacUtils.hmac(java.io.InputStream)",
      "begin_line": 1030,
      "end_line": 1038,
      "comment": "\n     * Returns the digest for the stream.\n     *\n     * @param valueToDigest\n     *            the data to use\n     *            \u003cp\u003e\n     *            The InputStream must not be null and will not be closed\n     *            \u003c/p\u003e\n     * @return the digest\n     * @throws IOException\n     *             If an I/O error occurs.\n     * @since 1.11\n     ",
      "child_ranges": [
        "(line 1031,col 9)-(line 1031,col 61)",
        "(line 1032,col 9)-(line 1032,col 17)",
        "(line 1034,col 9)-(line 1036,col 9)",
        "(line 1037,col 9)-(line 1037,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.digest.HmacUtils.hmacHex(java.io.InputStream)",
      "begin_line": 1053,
      "end_line": 1055,
      "comment": "\n     * Returns the digest for the stream.\n     *\n     * @param valueToDigest\n     *            the data to use\n     *            \u003cp\u003e\n     *            The InputStream must not be null and will not be closed\n     *            \u003c/p\u003e\n     * @return the digest as a hex String\n     * @throws IOException\n     *             If an I/O error occurs.\n     * @since 1.11\n     ",
      "child_ranges": [
        "(line 1054,col 9)-(line 1054,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.digest.HmacUtils.hmac(java.io.File)",
      "begin_line": 1066,
      "end_line": 1073,
      "comment": "\n     * Returns the digest for the file.\n     *\n     * @param valueToDigest the file to use\n     * @return the digest\n     * @throws IOException\n     *             If an I/O error occurs.\n     * @since 1.11\n     ",
      "child_ranges": [
        "(line 1067,col 9)-(line 1067,col 103)",
        "(line 1068,col 9)-(line 1072,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.digest.HmacUtils.hmacHex(java.io.File)",
      "begin_line": 1084,
      "end_line": 1086,
      "comment": "\n     * Returns the digest for the file.\n     *\n     * @param valueToDigest the file to use\n     * @return the digest as a hex String\n     * @throws IOException\n     *             If an I/O error occurs.\n     * @since 1.11\n     ",
      "child_ranges": [
        "(line 1085,col 9)-(line 1085,col 56)"
      ]
    }
  ]
}