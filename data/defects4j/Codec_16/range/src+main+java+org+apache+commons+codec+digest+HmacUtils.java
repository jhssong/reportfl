{
  "filepath": "/tmp/Codec-16b/src/main/java/org/apache/commons/codec/digest/HmacUtils.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "HmacUtils",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 44,
      "end_line": 794,
      "comment": "\n * Simplifies common {@link javax.crypto.Mac} tasks. This class is immutable and thread-safe.\n *\n *\n * \u003cp\u003e\n * \u003cstrong\u003eNote: Not all JCE implementations supports all algorithms. If not supported, an IllegalArgumentException is\n * thrown.\u003c/strong\u003e\n * \u003c/p\u003e\n *\n * @since 1.10\n * @version $Id$\n "
    },
    {
      "type": "field",
      "varNames": [
        "STREAM_BUFFER_LENGTH"
      ],
      "begin_line": 46,
      "end_line": 46,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.digest.HmacUtils.getHmacMd5(byte[])",
      "begin_line": 62,
      "end_line": 64,
      "comment": "\n     * Returns an initialized \u003ccode\u003eMac\u003c/code\u003e for the HmacMD5 algorithm.\n     * \u003cp\u003e\n     * Every implementation of the Java platform is required to support this standard Mac algorithm.\n     * \u003c/p\u003e\n     *\n     * @param key\n     *            They key for the keyed digest (must not be null)\n     * @return A Mac instance initialized with the given key.\n     * @see Mac#getInstance(String)\n     * @see Mac#init(Key)\n     * @throws IllegalArgumentException\n     *             when a {@link NoSuchAlgorithmException} is caught or key is null or key is invalid.\n     ",
      "child_ranges": [
        "(line 63,col 9)-(line 63,col 63)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.digest.HmacUtils.getHmacSha1(byte[])",
      "begin_line": 80,
      "end_line": 82,
      "comment": "\n     * Returns an initialized \u003ccode\u003eMac\u003c/code\u003e for the HmacSHA1 algorithm.\n     * \u003cp\u003e\n     * Every implementation of the Java platform is required to support this standard Mac algorithm.\n     * \u003c/p\u003e\n     *\n     * @param key\n     *            They key for the keyed digest (must not be null)\n     * @return A Mac instance initialized with the given key.\n     * @see Mac#getInstance(String)\n     * @see Mac#init(Key)\n     * @throws IllegalArgumentException\n     *             when a {@link NoSuchAlgorithmException} is caught or key is null or key is invalid.\n     ",
      "child_ranges": [
        "(line 81,col 9)-(line 81,col 65)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.digest.HmacUtils.getHmacSha256(byte[])",
      "begin_line": 98,
      "end_line": 100,
      "comment": "\n     * Returns an initialized \u003ccode\u003eMac\u003c/code\u003e for the HmacSHA256 algorithm.\n     * \u003cp\u003e\n     * Every implementation of the Java platform is required to support this standard Mac algorithm.\n     * \u003c/p\u003e\n     *\n     * @param key\n     *            They key for the keyed digest (must not be null)\n     * @return A Mac instance initialized with the given key.\n     * @see Mac#getInstance(String)\n     * @see Mac#init(Key)\n     * @throws IllegalArgumentException\n     *             when a {@link NoSuchAlgorithmException} is caught or key is null or key is invalid.\n     ",
      "child_ranges": [
        "(line 99,col 9)-(line 99,col 67)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.digest.HmacUtils.getHmacSha384(byte[])",
      "begin_line": 116,
      "end_line": 118,
      "comment": "\n     * Returns an initialized \u003ccode\u003eMac\u003c/code\u003e for the HmacSHA384 algorithm.\n     * \u003cp\u003e\n     * Every implementation of the Java platform is \u003cem\u003enot\u003c/em\u003e required to support this Mac algorithm.\n     * \u003c/p\u003e\n     *\n     * @param key\n     *            They key for the keyed digest (must not be null)\n     * @return A Mac instance initialized with the given key.\n     * @see Mac#getInstance(String)\n     * @see Mac#init(Key)\n     * @throws IllegalArgumentException\n     *             when a {@link NoSuchAlgorithmException} is caught or key is null or key is invalid.\n     ",
      "child_ranges": [
        "(line 117,col 9)-(line 117,col 67)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.digest.HmacUtils.getHmacSha512(byte[])",
      "begin_line": 134,
      "end_line": 136,
      "comment": "\n     * Returns an initialized \u003ccode\u003eMac\u003c/code\u003e for the HmacSHA512 algorithm.\n     * \u003cp\u003e\n     * Every implementation of the Java platform is \u003cem\u003enot\u003c/em\u003e required to support this Mac algorithm.\n     * \u003c/p\u003e\n     *\n     * @param key\n     *            They key for the keyed digest (must not be null)\n     * @return A Mac instance initialized with the given key.\n     * @see Mac#getInstance(String)\n     * @see Mac#init(Key)\n     * @throws IllegalArgumentException\n     *             when a {@link NoSuchAlgorithmException} is caught or key is null or key is invalid.\n     ",
      "child_ranges": [
        "(line 135,col 9)-(line 135,col 67)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.digest.HmacUtils.getInitializedMac(org.apache.commons.codec.digest.HmacAlgorithms, byte[])",
      "begin_line": 154,
      "end_line": 156,
      "comment": "\n     * Returns an initialized \u003ccode\u003eMac\u003c/code\u003e for the given \u003ccode\u003ealgorithm\u003c/code\u003e.\n     *\n     * @param algorithm\n     *            the name of the algorithm requested. See \u003ca href\u003d\n     *            \"http://docs.oracle.com/javase/6/docs/technotes/guides/security/crypto/CryptoSpec.html#AppA\" \u003eAppendix\n     *            A in the Java Cryptography Architecture Reference Guide\u003c/a\u003e for information about standard algorithm\n     *            names.\n     * @param key\n     *            They key for the keyed digest (must not be null)\n     * @return A Mac instance initialized with the given key.\n     * @see Mac#getInstance(String)\n     * @see Mac#init(Key)\n     * @throws IllegalArgumentException\n     *             when a {@link NoSuchAlgorithmException} is caught or key is null or key is invalid.\n     ",
      "child_ranges": [
        "(line 155,col 9)-(line 155,col 60)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.digest.HmacUtils.getInitializedMac(java.lang.String, byte[])",
      "begin_line": 174,
      "end_line": 190,
      "comment": "\n     * Returns an initialized \u003ccode\u003eMac\u003c/code\u003e for the given \u003ccode\u003ealgorithm\u003c/code\u003e.\n     *\n     * @param algorithm\n     *            the name of the algorithm requested. See \u003ca href\u003d\n     *            \"http://docs.oracle.com/javase/6/docs/technotes/guides/security/crypto/CryptoSpec.html#AppA\" \u003eAppendix\n     *            A in the Java Cryptography Architecture Reference Guide\u003c/a\u003e for information about standard algorithm\n     *            names.\n     * @param key\n     *            They key for the keyed digest (must not be null)\n     * @return A Mac instance initialized with the given key.\n     * @see Mac#getInstance(String)\n     * @see Mac#init(Key)\n     * @throws IllegalArgumentException\n     *             when a {@link NoSuchAlgorithmException} is caught or key is null or key is invalid.\n     ",
      "child_ranges": [
        "(line 176,col 9)-(line 178,col 9)",
        "(line 180,col 9)-(line 189,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.digest.HmacUtils.hmacMd5(byte[], byte[])",
      "begin_line": 205,
      "end_line": 212,
      "comment": "\n     * Returns a HmacMD5 Message Authentication Code (MAC) for the given key and value.\n     *\n     * @param key\n     *            They key for the keyed digest (must not be null)\n     * @param valueToDigest\n     *            The value (data) which should to digest (maybe empty or null)\n     * @return HmacMD5 MAC for the given key and value\n     * @throws IllegalArgumentException\n     *             when a {@link NoSuchAlgorithmException} is caught or key is null or key is invalid.\n     ",
      "child_ranges": [
        "(line 206,col 9)-(line 211,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.digest.HmacUtils.hmacMd5(byte[], java.io.InputStream)",
      "begin_line": 230,
      "end_line": 232,
      "comment": "\n     * Returns a HmacMD5 Message Authentication Code (MAC) for the given key and value.\n     *\n     * @param key\n     *            They key for the keyed digest (must not be null)\n     * @param valueToDigest\n     *            The value (data) which should to digest\n     *            \u003cp\u003e\n     *            The InputStream must not be null and will not be closed\n     *            \u003c/p\u003e\n     * @return HmacMD5 MAC for the given key and value\n     * @throws IOException\n     *             If an I/O error occurs.\n     * @throws IllegalArgumentException\n     *             when a {@link NoSuchAlgorithmException} is caught or key is null or key is invalid.\n     ",
      "child_ranges": [
        "(line 231,col 9)-(line 231,col 68)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.digest.HmacUtils.hmacMd5(java.lang.String, java.lang.String)",
      "begin_line": 245,
      "end_line": 247,
      "comment": "\n     * Returns a HmacMD5 Message Authentication Code (MAC) for the given key and value.\n     *\n     * @param key\n     *            They key for the keyed digest (must not be null)\n     * @param valueToDigest\n     *            The value (data) which should to digest (maybe empty or null)\n     * @return HmacMD5 MAC for the given key and value\n     * @throws IllegalArgumentException\n     *             when a {@link NoSuchAlgorithmException} is caught or key is null or key is invalid.\n     ",
      "child_ranges": [
        "(line 246,col 9)-(line 246,col 95)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.digest.HmacUtils.hmacMd5Hex(byte[], byte[])",
      "begin_line": 260,
      "end_line": 262,
      "comment": "\n     * Returns a HmacMD5 Message Authentication Code (MAC) as a hex string (lowercase) for the given key and value.\n     *\n     * @param key\n     *            They key for the keyed digest (must not be null)\n     * @param valueToDigest\n     *            The value (data) which should to digest (maybe empty or null)\n     * @return HmacMD5 MAC for the given key and value as a hex string (lowercase)\n     * @throws IllegalArgumentException\n     *             when a {@link NoSuchAlgorithmException} is caught or key is null or key is invalid.\n     ",
      "child_ranges": [
        "(line 261,col 9)-(line 261,col 64)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.digest.HmacUtils.hmacMd5Hex(byte[], java.io.InputStream)",
      "begin_line": 280,
      "end_line": 282,
      "comment": "\n     * Returns a HmacMD5 Message Authentication Code (MAC) as a hex string (lowercase) for the given key and value.\n     *\n     * @param key\n     *            They key for the keyed digest (must not be null)\n     * @param valueToDigest\n     *            The value (data) which should to digest\n     *            \u003cp\u003e\n     *            The InputStream must not be null and will not be closed\n     *            \u003c/p\u003e\n     * @return HmacMD5 MAC for the given key and value as a hex string (lowercase)\n     * @throws IOException\n     *             If an I/O error occurs.\n     * @throws IllegalArgumentException\n     *             when a {@link NoSuchAlgorithmException} is caught or key is null or key is invalid.\n     ",
      "child_ranges": [
        "(line 281,col 9)-(line 281,col 64)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.digest.HmacUtils.hmacMd5Hex(java.lang.String, java.lang.String)",
      "begin_line": 295,
      "end_line": 297,
      "comment": "\n     * Returns a HmacMD5 Message Authentication Code (MAC) as a hex string (lowercase) for the given key and value.\n     *\n     * @param key\n     *            They key for the keyed digest (must not be null)\n     * @param valueToDigest\n     *            The value (data) which should to digest (maybe empty or null)\n     * @return HmacMD5 MAC for the given key and value as a hex string (lowercase)\n     * @throws IllegalArgumentException\n     *             when a {@link NoSuchAlgorithmException} is caught or key is null or key is invalid.\n     ",
      "child_ranges": [
        "(line 296,col 9)-(line 296,col 64)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.digest.HmacUtils.hmacSha1(byte[], byte[])",
      "begin_line": 312,
      "end_line": 319,
      "comment": "\n     * Returns a HmacSHA1 Message Authentication Code (MAC) for the given key and value.\n     *\n     * @param key\n     *            They key for the keyed digest (must not be null)\n     * @param valueToDigest\n     *            The value (data) which should to digest (maybe empty or null)\n     * @return HmacSHA1 MAC for the given key and value\n     * @throws IllegalArgumentException\n     *             when a {@link NoSuchAlgorithmException} is caught or key is null or key is invalid.\n     ",
      "child_ranges": [
        "(line 313,col 9)-(line 318,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.digest.HmacUtils.hmacSha1(byte[], java.io.InputStream)",
      "begin_line": 337,
      "end_line": 339,
      "comment": "\n     * Returns a HmacSHA1 Message Authentication Code (MAC) for the given key and value.\n     *\n     * @param key\n     *            They key for the keyed digest (must not be null)\n     * @param valueToDigest\n     *            The value (data) which should to digest\n     *            \u003cp\u003e\n     *            The InputStream must not be null and will not be closed\n     *            \u003c/p\u003e\n     * @return HmacSHA1 MAC for the given key and value\n     * @throws IOException\n     *             If an I/O error occurs.\n     * @throws IllegalArgumentException\n     *             when a {@link NoSuchAlgorithmException} is caught or key is null or key is invalid.\n     ",
      "child_ranges": [
        "(line 338,col 9)-(line 338,col 69)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.digest.HmacUtils.hmacSha1(java.lang.String, java.lang.String)",
      "begin_line": 352,
      "end_line": 354,
      "comment": "\n     * Returns a HmacSHA1 Message Authentication Code (MAC) for the given key and value.\n     *\n     * @param key\n     *            They key for the keyed digest (must not be null)\n     * @param valueToDigest\n     *            The value (data) which should to digest (maybe empty or null)\n     * @return HmacSHA1 MAC for the given key and value\n     * @throws IllegalArgumentException\n     *             when a {@link NoSuchAlgorithmException} is caught or key is null or key is invalid.\n     ",
      "child_ranges": [
        "(line 353,col 9)-(line 353,col 96)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.digest.HmacUtils.hmacSha1Hex(byte[], byte[])",
      "begin_line": 367,
      "end_line": 369,
      "comment": "\n     * Returns a HmacSHA1 Message Authentication Code (MAC) as hex string (lowercase) for the given key and value.\n     *\n     * @param key\n     *            They key for the keyed digest (must not be null)\n     * @param valueToDigest\n     *            The value (data) which should to digest (maybe empty or null)\n     * @return HmacSHA1 MAC for the given key and value as hex string (lowercase)\n     * @throws IllegalArgumentException\n     *             when a {@link NoSuchAlgorithmException} is caught or key is null or key is invalid.\n     ",
      "child_ranges": [
        "(line 368,col 9)-(line 368,col 65)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.digest.HmacUtils.hmacSha1Hex(byte[], java.io.InputStream)",
      "begin_line": 387,
      "end_line": 389,
      "comment": "\n     * Returns a HmacSHA1 Message Authentication Code (MAC) as hex string (lowercase) for the given key and value.\n     *\n     * @param key\n     *            They key for the keyed digest (must not be null)\n     * @param valueToDigest\n     *            The value (data) which should to digest\n     *            \u003cp\u003e\n     *            The InputStream must not be null and will not be closed\n     *            \u003c/p\u003e\n     * @return HmacSHA1 MAC for the given key and value as hex string (lowercase)\n     * @throws IOException\n     *             If an I/O error occurs.\n     * @throws IllegalArgumentException\n     *             when a {@link NoSuchAlgorithmException} is caught or key is null or key is invalid.\n     ",
      "child_ranges": [
        "(line 388,col 9)-(line 388,col 65)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.digest.HmacUtils.hmacSha1Hex(java.lang.String, java.lang.String)",
      "begin_line": 402,
      "end_line": 404,
      "comment": "\n     * Returns a HmacSHA1 Message Authentication Code (MAC) as hex string (lowercase) for the given key and value.\n     *\n     * @param key\n     *            They key for the keyed digest (must not be null)\n     * @param valueToDigest\n     *            The value (data) which should to digest (maybe empty or null)\n     * @return HmacSHA1 MAC for the given key and value as hex string (lowercase)\n     * @throws IllegalArgumentException\n     *             when a {@link NoSuchAlgorithmException} is caught or key is null or key is invalid.\n     ",
      "child_ranges": [
        "(line 403,col 9)-(line 403,col 65)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.digest.HmacUtils.hmacSha256(byte[], byte[])",
      "begin_line": 419,
      "end_line": 426,
      "comment": "\n     * Returns a HmacSHA256 Message Authentication Code (MAC) for the given key and value.\n     *\n     * @param key\n     *            They key for the keyed digest (must not be null)\n     * @param valueToDigest\n     *            The value (data) which should to digest (maybe empty or null)\n     * @return HmacSHA256 MAC for the given key and value\n     * @throws IllegalArgumentException\n     *             when a {@link NoSuchAlgorithmException} is caught or key is null or key is invalid.\n     ",
      "child_ranges": [
        "(line 420,col 9)-(line 425,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.digest.HmacUtils.hmacSha256(byte[], java.io.InputStream)",
      "begin_line": 444,
      "end_line": 446,
      "comment": "\n     * Returns a HmacSHA256 Message Authentication Code (MAC) for the given key and value.\n     *\n     * @param key\n     *            They key for the keyed digest (must not be null)\n     * @param valueToDigest\n     *            The value (data) which should to digest\n     *            \u003cp\u003e\n     *            The InputStream must not be null and will not be closed\n     *            \u003c/p\u003e\n     * @return HmacSHA256 MAC for the given key and value\n     * @throws IOException\n     *             If an I/O error occurs.\ns     * @throws IllegalArgumentException\n     *             when a {@link NoSuchAlgorithmException} is caught or key is null or key is invalid.\n     ",
      "child_ranges": [
        "(line 445,col 9)-(line 445,col 71)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.digest.HmacUtils.hmacSha256(java.lang.String, java.lang.String)",
      "begin_line": 459,
      "end_line": 461,
      "comment": "\n     * Returns a HmacSHA256 Message Authentication Code (MAC) for the given key and value.\n     *\n     * @param key\n     *            They key for the keyed digest (must not be null)\n     * @param valueToDigest\n     *            The value (data) which should to digest (maybe empty or null)\n     * @return HmacSHA256 MAC for the given key and value\n     * @throws IllegalArgumentException\n     *             when a {@link NoSuchAlgorithmException} is caught or key is null or key is invalid.\n     ",
      "child_ranges": [
        "(line 460,col 9)-(line 460,col 98)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.digest.HmacUtils.hmacSha256Hex(byte[], byte[])",
      "begin_line": 474,
      "end_line": 476,
      "comment": "\n     * Returns a HmacSHA256 Message Authentication Code (MAC) as hex string (lowercase) for the given key and value.\n     *\n     * @param key\n     *            They key for the keyed digest (must not be null)\n     * @param valueToDigest\n     *            The value (data) which should to digest (maybe empty or null)\n     * @return HmacSHA256 MAC for the given key and value as hex string (lowercase)\n     * @throws IllegalArgumentException\n     *             when a {@link NoSuchAlgorithmException} is caught or key is null or key is invalid.\n     ",
      "child_ranges": [
        "(line 475,col 9)-(line 475,col 67)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.digest.HmacUtils.hmacSha256Hex(byte[], java.io.InputStream)",
      "begin_line": 494,
      "end_line": 496,
      "comment": "\n     * Returns a HmacSHA256 Message Authentication Code (MAC) as hex string (lowercase) for the given key and value.\n     *\n     * @param key\n     *            They key for the keyed digest (must not be null)\n     * @param valueToDigest\n     *            The value (data) which should to digest\n     *            \u003cp\u003e\n     *            The InputStream must not be null and will not be closed\n     *            \u003c/p\u003e\n     * @return HmacSHA256 MAC for the given key and value as hex string (lowercase)\n     * @throws IOException\n     *             If an I/O error occurs.\n     * @throws IllegalArgumentException\n     *             when a {@link NoSuchAlgorithmException} is caught or key is null or key is invalid.\n     ",
      "child_ranges": [
        "(line 495,col 9)-(line 495,col 67)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.digest.HmacUtils.hmacSha256Hex(java.lang.String, java.lang.String)",
      "begin_line": 509,
      "end_line": 511,
      "comment": "\n     * Returns a HmacSHA256 Message Authentication Code (MAC) as hex string (lowercase) for the given key and value.\n     *\n     * @param key\n     *            They key for the keyed digest (must not be null)\n     * @param valueToDigest\n     *            The value (data) which should to digest (maybe empty or null)\n     * @return HmacSHA256 MAC for the given key and value as hex string (lowercase)\n     * @throws IllegalArgumentException\n     *             when a {@link NoSuchAlgorithmException} is caught or key is null or key is invalid.\n     ",
      "child_ranges": [
        "(line 510,col 9)-(line 510,col 67)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.digest.HmacUtils.hmacSha384(byte[], byte[])",
      "begin_line": 526,
      "end_line": 533,
      "comment": "\n     * Returns a HmacSHA384 Message Authentication Code (MAC) for the given key and value.\n     *\n     * @param key\n     *            They key for the keyed digest (must not be null)\n     * @param valueToDigest\n     *            The value (data) which should to digest (maybe empty or null)\n     * @return HmacSHA384 MAC for the given key and value\n     * @throws IllegalArgumentException\n     *             when a {@link NoSuchAlgorithmException} is caught or key is null or key is invalid.\n     ",
      "child_ranges": [
        "(line 527,col 9)-(line 532,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.digest.HmacUtils.hmacSha384(byte[], java.io.InputStream)",
      "begin_line": 551,
      "end_line": 553,
      "comment": "\n     * Returns a HmacSHA384 Message Authentication Code (MAC) for the given key and value.\n     *\n     * @param key\n     *            They key for the keyed digest (must not be null)\n     * @param valueToDigest\n     *            The value (data) which should to digest\n     *            \u003cp\u003e\n     *            The InputStream must not be null and will not be closed\n     *            \u003c/p\u003e\n     * @return HmacSHA384 MAC for the given key and value\n     * @throws IOException\n     *             If an I/O error occurs.\n     * @throws IllegalArgumentException\n     *             when a {@link NoSuchAlgorithmException} is caught or key is null or key is invalid.\n     ",
      "child_ranges": [
        "(line 552,col 9)-(line 552,col 71)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.digest.HmacUtils.hmacSha384(java.lang.String, java.lang.String)",
      "begin_line": 566,
      "end_line": 568,
      "comment": "\n     * Returns a HmacSHA384 Message Authentication Code (MAC) for the given key and value.\n     *\n     * @param key\n     *            They key for the keyed digest (must not be null)\n     * @param valueToDigest\n     *            The value (data) which should to digest (maybe empty or null)\n     * @return HmacSHA384 MAC for the given key and value\n     * @throws IllegalArgumentException\n     *             when a {@link NoSuchAlgorithmException} is caught or key is null or key is invalid.\n     ",
      "child_ranges": [
        "(line 567,col 9)-(line 567,col 98)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.digest.HmacUtils.hmacSha384Hex(byte[], byte[])",
      "begin_line": 581,
      "end_line": 583,
      "comment": "\n     * Returns a HmacSHA384 Message Authentication Code (MAC) as hex string (lowercase) for the given key and value.\n     *\n     * @param key\n     *            They key for the keyed digest (must not be null)\n     * @param valueToDigest\n     *            The value (data) which should to digest (maybe empty or null)\n     * @return HmacSHA384 MAC for the given key and value as hex string (lowercase)\n     * @throws IllegalArgumentException\n     *             when a {@link NoSuchAlgorithmException} is caught or key is null or key is invalid.\n     ",
      "child_ranges": [
        "(line 582,col 9)-(line 582,col 67)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.digest.HmacUtils.hmacSha384Hex(byte[], java.io.InputStream)",
      "begin_line": 601,
      "end_line": 603,
      "comment": "\n     * Returns a HmacSHA384 Message Authentication Code (MAC) as hex string (lowercase) for the given key and value.\n     *\n     * @param key\n     *            They key for the keyed digest (must not be null)\n     * @param valueToDigest\n     *            The value (data) which should to digest\n     *            \u003cp\u003e\n     *            The InputStream must not be null and will not be closed\n     *            \u003c/p\u003e\n     * @return HmacSHA384 MAC for the given key and value as hex string (lowercase)\n     * @throws IOException\n     *             If an I/O error occurs.\n     * @throws IllegalArgumentException\n     *             when a {@link NoSuchAlgorithmException} is caught or key is null or key is invalid.\n     ",
      "child_ranges": [
        "(line 602,col 9)-(line 602,col 67)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.digest.HmacUtils.hmacSha384Hex(java.lang.String, java.lang.String)",
      "begin_line": 616,
      "end_line": 618,
      "comment": "\n     * Returns a HmacSHA384 Message Authentication Code (MAC) as hex string (lowercase) for the given key and value.\n     *\n     * @param key\n     *            They key for the keyed digest (must not be null)\n     * @param valueToDigest\n     *            The value (data) which should to digest (maybe empty or null)\n     * @return HmacSHA384 MAC for the given key and value as hex string (lowercase)\n     * @throws IllegalArgumentException\n     *             when a {@link NoSuchAlgorithmException} is caught or key is null or key is invalid.\n     ",
      "child_ranges": [
        "(line 617,col 9)-(line 617,col 67)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.digest.HmacUtils.hmacSha512(byte[], byte[])",
      "begin_line": 633,
      "end_line": 640,
      "comment": "\n     * Returns a HmacSHA512 Message Authentication Code (MAC) for the given key and value.\n     *\n     * @param key\n     *            They key for the keyed digest (must not be null)\n     * @param valueToDigest\n     *            The value (data) which should to digest (maybe empty or null)\n     * @return HmacSHA512 MAC for the given key and value\n     * @throws IllegalArgumentException\n     *             when a {@link NoSuchAlgorithmException} is caught or key is null or key is invalid.\n     ",
      "child_ranges": [
        "(line 634,col 9)-(line 639,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.digest.HmacUtils.hmacSha512(byte[], java.io.InputStream)",
      "begin_line": 658,
      "end_line": 660,
      "comment": "\n     * Returns a HmacSHA512 Message Authentication Code (MAC) for the given key and value.\n     *\n     * @param key\n     *            They key for the keyed digest (must not be null)\n     * @param valueToDigest\n     *            The value (data) which should to digest\n     *            \u003cp\u003e\n     *            The InputStream must not be null and will not be closed\n     *            \u003c/p\u003e\n     * @return HmacSHA512 MAC for the given key and value\n     * @throws IOException\n     *             If an I/O error occurs.\n     * @throws IllegalArgumentException\n     *             when a {@link NoSuchAlgorithmException} is caught or key is null or key is invalid.\n     ",
      "child_ranges": [
        "(line 659,col 9)-(line 659,col 71)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.digest.HmacUtils.hmacSha512(java.lang.String, java.lang.String)",
      "begin_line": 673,
      "end_line": 675,
      "comment": "\n     * Returns a HmacSHA512 Message Authentication Code (MAC) for the given key and value.\n     *\n     * @param key\n     *            They key for the keyed digest (must not be null)\n     * @param valueToDigest\n     *            The value (data) which should to digest (maybe empty or null)\n     * @return HmacSHA512 MAC for the given key and value\n     * @throws IllegalArgumentException\n     *             when a {@link NoSuchAlgorithmException} is caught or key is null or key is invalid.\n     ",
      "child_ranges": [
        "(line 674,col 9)-(line 674,col 98)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.digest.HmacUtils.hmacSha512Hex(byte[], byte[])",
      "begin_line": 688,
      "end_line": 690,
      "comment": "\n     * Returns a HmacSHA512 Message Authentication Code (MAC) as hex string (lowercase) for the given key and value.\n     *\n     * @param key\n     *            They key for the keyed digest (must not be null)\n     * @param valueToDigest\n     *            The value (data) which should to digest (maybe empty or null)\n     * @return HmacSHA512 MAC for the given key and value as hex string (lowercase)\n     * @throws IllegalArgumentException\n     *             when a {@link NoSuchAlgorithmException} is caught or key is null or key is invalid.\n     ",
      "child_ranges": [
        "(line 689,col 9)-(line 689,col 67)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.digest.HmacUtils.hmacSha512Hex(byte[], java.io.InputStream)",
      "begin_line": 708,
      "end_line": 710,
      "comment": "\n     * Returns a HmacSHA512 Message Authentication Code (MAC) as hex string (lowercase) for the given key and value.\n     *\n     * @param key\n     *            They key for the keyed digest (must not be null)\n     * @param valueToDigest\n     *            The value (data) which should to digest\n     *            \u003cp\u003e\n     *            The InputStream must not be null and will not be closed\n     *            \u003c/p\u003e\n     * @return HmacSHA512 MAC for the given key and value as hex string (lowercase)\n     * @throws IOException\n     *             If an I/O error occurs.\n     * @throws IllegalArgumentException\n     *             when a {@link NoSuchAlgorithmException} is caught or key is null or key is invalid.\n     ",
      "child_ranges": [
        "(line 709,col 9)-(line 709,col 67)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.digest.HmacUtils.hmacSha512Hex(java.lang.String, java.lang.String)",
      "begin_line": 723,
      "end_line": 725,
      "comment": "\n     * Returns a HmacSHA512 Message Authentication Code (MAC) as hex string (lowercase) for the given key and value.\n     *\n     * @param key\n     *            They key for the keyed digest (must not be null)\n     * @param valueToDigest\n     *            The value (data) which should to digest (maybe empty or null)\n     * @return HmacSHA512 MAC for the given key and value as hex string (lowercase)\n     * @throws IllegalArgumentException\n     *             when a {@link NoSuchAlgorithmException} is caught or key is null or key is invalid.\n     ",
      "child_ranges": [
        "(line 724,col 9)-(line 724,col 67)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.digest.HmacUtils.updateHmac(javax.crypto.Mac, byte[])",
      "begin_line": 741,
      "end_line": 745,
      "comment": "\n     * Updates the given {@link Mac}. This generates a digest for valueToDigest and the key the Mac was initialized\n     *\n     * @param mac\n     *            the initialized {@link Mac} to update\n     * @param valueToDigest\n     *            the value to update the {@link Mac} with (maybe null or empty)\n     * @return the updated {@link Mac}\n     * @throws IllegalStateException\n     *             if the Mac was not initialized\n     * @since 1.x\n     ",
      "child_ranges": [
        "(line 742,col 9)-(line 742,col 20)",
        "(line 743,col 9)-(line 743,col 34)",
        "(line 744,col 9)-(line 744,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.digest.HmacUtils.updateHmac(javax.crypto.Mac, java.io.InputStream)",
      "begin_line": 764,
      "end_line": 775,
      "comment": "\n     * Updates the given {@link Mac}. This generates a digest for valueToDigest and the key the Mac was initialized\n     *\n     * @param mac\n     *            the initialized {@link Mac} to update\n     * @param valueToDigest\n     *            the value to update the {@link Mac} with\n     *            \u003cp\u003e\n     *            The InputStream must not be null and will not be closed\n     *            \u003c/p\u003e\n     * @return the updated {@link Mac}\n     * @throws IOException\n     *             If an I/O error occurs.\n     * @throws IllegalStateException\n     *             If the Mac was not initialized\n     * @since 1.x\n     ",
      "child_ranges": [
        "(line 765,col 9)-(line 765,col 20)",
        "(line 766,col 9)-(line 766,col 61)",
        "(line 767,col 9)-(line 767,col 71)",
        "(line 769,col 9)-(line 772,col 9)",
        "(line 774,col 9)-(line 774,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.digest.HmacUtils.updateHmac(javax.crypto.Mac, java.lang.String)",
      "begin_line": 789,
      "end_line": 793,
      "comment": "\n     * Updates the given {@link Mac}. This generates a digest for valueToDigest and the key the Mac was initialized\n     *\n     * @param mac\n     *            the initialized {@link Mac} to update\n     * @param valueToDigest\n     *            the value to update the {@link Mac} with (maybe null or empty)\n     * @return the updated {@link Mac}\n     * @throws IllegalStateException\n     *             if the Mac was not initialized\n     * @since 1.x\n     ",
      "child_ranges": [
        "(line 790,col 9)-(line 790,col 20)",
        "(line 791,col 9)-(line 791,col 60)",
        "(line 792,col 9)-(line 792,col 19)"
      ]
    }
  ]
}