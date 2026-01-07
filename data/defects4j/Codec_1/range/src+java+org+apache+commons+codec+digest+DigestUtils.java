{
  "filepath": "/tmp/Codec-1b/src/java/org/apache/commons/codec/digest/DigestUtils.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "DigestUtils",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 33,
      "end_line": 536,
      "comment": "\n * Operations to simplifiy common {@link java.security.MessageDigest} tasks. This class is thread safe.\n * \n * @author Apache Software Foundation\n * @version $Id$\n "
    },
    {
      "type": "field",
      "varNames": [
        "STREAM_BUFFER_LENGTH"
      ],
      "begin_line": 35,
      "end_line": 35,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.digest.DigestUtils.getDigest(java.lang.String)",
      "begin_line": 50,
      "end_line": 56,
      "comment": "\n     * Returns a \u003ccode\u003eMessageDigest\u003c/code\u003e for the given \u003ccode\u003ealgorithm\u003c/code\u003e.\n     * \n     * @param algorithm\n     *            the name of the algorithm requested. See \u003ca\n     *            href\u003d\"http://java.sun.com/j2se/1.3/docs/guide/security/CryptoSpec.html#AppA\"\u003eAppendix A in the Java\n     *            Cryptography Architecture API Specification \u0026 Reference\u003c/a\u003e for information about standard algorithm\n     *            names.\n     * @return An MD5 digest instance.\n     * @see MessageDigest#getInstance(String)\n     * @throws RuntimeException\n     *             when a {@link java.security.NoSuchAlgorithmException} is caught.\n     ",
      "child_ranges": [
        "(line 51,col 9)-(line 55,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.digest.DigestUtils.getMd5Digest()",
      "begin_line": 65,
      "end_line": 67,
      "comment": "\n     * Returns an MD5 MessageDigest.\n     * \n     * @return An MD5 digest instance.\n     * @throws RuntimeException\n     *             when a {@link java.security.NoSuchAlgorithmException} is caught.\n     ",
      "child_ranges": [
        "(line 66,col 9)-(line 66,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.digest.DigestUtils.getSha256Digest()",
      "begin_line": 79,
      "end_line": 81,
      "comment": "\n     * Returns an SHA-256 digest.\n     * \u003cp\u003e\n     * Throws a \u003ccode\u003eRuntimeException\u003c/code\u003e on JRE versions prior to 1.4.0.\n     * \u003c/p\u003e\n     * \n     * @return An SHA-256 digest instance.\n     * @throws RuntimeException\n     *             when a {@link java.security.NoSuchAlgorithmException} is caught.\n     ",
      "child_ranges": [
        "(line 80,col 9)-(line 80,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.digest.DigestUtils.getSha384Digest()",
      "begin_line": 93,
      "end_line": 95,
      "comment": "\n     * Returns an SHA-384 digest.\n     * \u003cp\u003e\n     * Throws a \u003ccode\u003eRuntimeException\u003c/code\u003e on JRE versions prior to 1.4.0.\n     * \u003c/p\u003e\n     * \n     * @return An SHA-384 digest instance.\n     * @throws RuntimeException\n     *             when a {@link java.security.NoSuchAlgorithmException} is caught.\n     ",
      "child_ranges": [
        "(line 94,col 9)-(line 94,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.digest.DigestUtils.getSha512Digest()",
      "begin_line": 107,
      "end_line": 109,
      "comment": "\n     * Returns an SHA-512 digest.\n     * \u003cp\u003e\n     * Throws a \u003ccode\u003eRuntimeException\u003c/code\u003e on JRE versions prior to 1.4.0.\n     * \u003c/p\u003e\n     * \n     * @return An SHA-512 digest instance.\n     * @throws RuntimeException\n     *             when a {@link java.security.NoSuchAlgorithmException} is caught.\n     ",
      "child_ranges": [
        "(line 108,col 9)-(line 108,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.digest.DigestUtils.getShaDigest()",
      "begin_line": 118,
      "end_line": 120,
      "comment": "\n     * Returns an SHA-1 digest.\n     * \n     * @return An SHA-1 digest instance.\n     * @throws RuntimeException\n     *             when a {@link java.security.NoSuchAlgorithmException} is caught.\n     ",
      "child_ranges": [
        "(line 119,col 9)-(line 119,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.digest.DigestUtils.digest(java.security.MessageDigest, java.io.InputStream)",
      "begin_line": 130,
      "end_line": 140,
      "comment": "\n     * Read through an InputStream and returns the digest for the data\n     * \n     * @param digest The MessageDigest to use (e.g. MD5)\n     * @param data Data to digest\n     * @return MD5 digest\n     * @throws IOException On error reading from the stream\n     ",
      "child_ranges": [
        "(line 131,col 9)-(line 131,col 55)",
        "(line 132,col 9)-(line 132,col 62)",
        "(line 134,col 9)-(line 137,col 9)",
        "(line 139,col 9)-(line 139,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.digest.DigestUtils.md5(byte[])",
      "begin_line": 149,
      "end_line": 151,
      "comment": "\n     * Calculates the MD5 digest and returns the value as a 16 element \u003ccode\u003ebyte[]\u003c/code\u003e.\n     * \n     * @param data\n     *            Data to digest\n     * @return MD5 digest\n     ",
      "child_ranges": [
        "(line 150,col 9)-(line 150,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.digest.DigestUtils.md5(java.io.InputStream)",
      "begin_line": 161,
      "end_line": 163,
      "comment": "\n     * Calculates the MD5 digest and returns the value as a 16 element \u003ccode\u003ebyte[]\u003c/code\u003e.\n     * \n     * @param data\n     *            Data to digest\n     * @return MD5 digest\n     * @throws IOException On error reading from the stream\n     ",
      "child_ranges": [
        "(line 162,col 9)-(line 162,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.digest.DigestUtils.md5(java.lang.String)",
      "begin_line": 172,
      "end_line": 174,
      "comment": "\n     * Calculates the MD5 digest and returns the value as a 16 element \u003ccode\u003ebyte[]\u003c/code\u003e.\n     * \n     * @param data\n     *            Data to digest\n     * @return MD5 digest\n     ",
      "child_ranges": [
        "(line 173,col 9)-(line 173,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.digest.DigestUtils.md5Hex(byte[])",
      "begin_line": 183,
      "end_line": 185,
      "comment": "\n     * Calculates the MD5 digest and returns the value as a 32 character hex string.\n     * \n     * @param data\n     *            Data to digest\n     * @return MD5 digest as a hex string\n     ",
      "child_ranges": [
        "(line 184,col 9)-(line 184,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.digest.DigestUtils.md5Hex(java.lang.String)",
      "begin_line": 194,
      "end_line": 196,
      "comment": "\n     * Calculates the MD5 digest and returns the value as a 32 character hex string.\n     * \n     * @param data\n     *            Data to digest\n     * @return MD5 digest as a hex string\n     ",
      "child_ranges": [
        "(line 195,col 9)-(line 195,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.digest.DigestUtils.md5Hex(java.io.InputStream)",
      "begin_line": 206,
      "end_line": 208,
      "comment": "\n     * Calculates the MD5 digest and returns the value as a 32 character hex string.\n     * \n     * @param data\n     *            Data to digest\n     * @return MD5 digest as a hex string\n     * @throws IOException On error reading from the stream\n     ",
      "child_ranges": [
        "(line 207,col 9)-(line 207,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.digest.DigestUtils.sha(byte[])",
      "begin_line": 217,
      "end_line": 219,
      "comment": "\n     * Calculates the SHA-1 digest and returns the value as a \u003ccode\u003ebyte[]\u003c/code\u003e.\n     * \n     * @param data\n     *            Data to digest\n     * @return SHA-1 digest\n     ",
      "child_ranges": [
        "(line 218,col 9)-(line 218,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.digest.DigestUtils.sha(java.lang.String)",
      "begin_line": 228,
      "end_line": 230,
      "comment": "\n     * Calculates the SHA-1 digest and returns the value as a \u003ccode\u003ebyte[]\u003c/code\u003e.\n     * \n     * @param data\n     *            Data to digest\n     * @return SHA-1 digest\n     ",
      "child_ranges": [
        "(line 229,col 9)-(line 229,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.digest.DigestUtils.sha(java.io.InputStream)",
      "begin_line": 240,
      "end_line": 242,
      "comment": "\n     * Calculates the SHA-1 digest and returns the value as a \u003ccode\u003ebyte[]\u003c/code\u003e.\n     * \n     * @param data\n     *            Data to digest\n     * @return SHA-1 digest\n     * @throws IOException On error reading from the stream\n     ",
      "child_ranges": [
        "(line 241,col 9)-(line 241,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.digest.DigestUtils.sha256(byte[])",
      "begin_line": 254,
      "end_line": 256,
      "comment": "\n     * Calculates the SHA-256 digest and returns the value as a \u003ccode\u003ebyte[]\u003c/code\u003e.\n     * \u003cp\u003e\n     * Throws a \u003ccode\u003eRuntimeException\u003c/code\u003e on JRE versions prior to 1.4.0.\n     * \u003c/p\u003e\n     * \n     * @param data\n     *            Data to digest\n     * @return SHA-256 digest\n     ",
      "child_ranges": [
        "(line 255,col 9)-(line 255,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.digest.DigestUtils.sha256(java.lang.String)",
      "begin_line": 268,
      "end_line": 270,
      "comment": "\n     * Calculates the SHA-256 digest and returns the value as a \u003ccode\u003ebyte[]\u003c/code\u003e.\n     * \u003cp\u003e\n     * Throws a \u003ccode\u003eRuntimeException\u003c/code\u003e on JRE versions prior to 1.4.0.\n     * \u003c/p\u003e\n     * \n     * @param data\n     *            Data to digest\n     * @return SHA-256 digest\n     ",
      "child_ranges": [
        "(line 269,col 9)-(line 269,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.digest.DigestUtils.sha256(java.io.InputStream)",
      "begin_line": 283,
      "end_line": 285,
      "comment": "\n     * Calculates the SHA-256 digest and returns the value as a \u003ccode\u003ebyte[]\u003c/code\u003e.\n     * \u003cp\u003e\n     * Throws a \u003ccode\u003eRuntimeException\u003c/code\u003e on JRE versions prior to 1.4.0.\n     * \u003c/p\u003e\n     * \n     * @param data\n     *            Data to digest\n     * @return SHA-256 digest\n     * @throws IOException On error reading from the stream\n     ",
      "child_ranges": [
        "(line 284,col 9)-(line 284,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.digest.DigestUtils.sha256Hex(byte[])",
      "begin_line": 297,
      "end_line": 299,
      "comment": "\n     * Calculates the SHA-256 digest and returns the value as a hex string.\n     * \u003cp\u003e\n     * Throws a \u003ccode\u003eRuntimeException\u003c/code\u003e on JRE versions prior to 1.4.0.\n     * \u003c/p\u003e\n     * \n     * @param data\n     *            Data to digest\n     * @return SHA-256 digest as a hex string\n     ",
      "child_ranges": [
        "(line 298,col 9)-(line 298,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.digest.DigestUtils.sha256Hex(java.lang.String)",
      "begin_line": 311,
      "end_line": 313,
      "comment": "\n     * Calculates the SHA-256 digest and returns the value as a hex string.\n     * \u003cp\u003e\n     * Throws a \u003ccode\u003eRuntimeException\u003c/code\u003e on JRE versions prior to 1.4.0.\n     * \u003c/p\u003e\n     * \n     * @param data\n     *            Data to digest\n     * @return SHA-256 digest as a hex string\n     ",
      "child_ranges": [
        "(line 312,col 9)-(line 312,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.digest.DigestUtils.sha256Hex(java.io.InputStream)",
      "begin_line": 326,
      "end_line": 328,
      "comment": "\n     * Calculates the SHA-256 digest and returns the value as a hex string.\n     * \u003cp\u003e\n     * Throws a \u003ccode\u003eRuntimeException\u003c/code\u003e on JRE versions prior to 1.4.0.\n     * \u003c/p\u003e\n     * \n     * @param data\n     *            Data to digest\n     * @return SHA-256 digest as a hex string\n     * @throws IOException On error reading from the stream\n     ",
      "child_ranges": [
        "(line 327,col 9)-(line 327,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.digest.DigestUtils.sha384(byte[])",
      "begin_line": 340,
      "end_line": 343,
      "comment": "\n     * Calculates the SHA-384 digest and returns the value as a \u003ccode\u003ebyte[]\u003c/code\u003e.\n     * \u003cp\u003e\n     * Throws a \u003ccode\u003eRuntimeException\u003c/code\u003e on JRE versions prior to 1.4.0.\n     * \u003c/p\u003e\n     * \n     * @param data\n     *            Data to digest\n     * @return SHA-384 digest\n     ",
      "child_ranges": [
        "(line 342,col 9)-(line 342,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.digest.DigestUtils.sha384(java.lang.String)",
      "begin_line": 355,
      "end_line": 357,
      "comment": "\n     * Calculates the SHA-384 digest and returns the value as a \u003ccode\u003ebyte[]\u003c/code\u003e.\n     * \u003cp\u003e\n     * Throws a \u003ccode\u003eRuntimeException\u003c/code\u003e on JRE versions prior to 1.4.0.\n     * \u003c/p\u003e\n     * \n     * @param data\n     *            Data to digest\n     * @return SHA-384 digest\n     ",
      "child_ranges": [
        "(line 356,col 9)-(line 356,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.digest.DigestUtils.sha384(java.io.InputStream)",
      "begin_line": 370,
      "end_line": 372,
      "comment": "\n     * Calculates the SHA-384 digest and returns the value as a \u003ccode\u003ebyte[]\u003c/code\u003e.\n     * \u003cp\u003e\n     * Throws a \u003ccode\u003eRuntimeException\u003c/code\u003e on JRE versions prior to 1.4.0.\n     * \u003c/p\u003e\n     * \n     * @param data\n     *            Data to digest\n     * @return SHA-384 digest\n     * @throws IOException On error reading from the stream\n     ",
      "child_ranges": [
        "(line 371,col 9)-(line 371,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.digest.DigestUtils.sha384Hex(byte[])",
      "begin_line": 384,
      "end_line": 386,
      "comment": "\n     * Calculates the SHA-384 digest and returns the value as a hex string.\n     * \u003cp\u003e\n     * Throws a \u003ccode\u003eRuntimeException\u003c/code\u003e on JRE versions prior to 1.4.0.\n     * \u003c/p\u003e\n     * \n     * @param data\n     *            Data to digest\n     * @return SHA-384 digest as a hex string\n     ",
      "child_ranges": [
        "(line 385,col 9)-(line 385,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.digest.DigestUtils.sha384Hex(java.lang.String)",
      "begin_line": 398,
      "end_line": 400,
      "comment": "\n     * Calculates the SHA-384 digest and returns the value as a hex string.\n     * \u003cp\u003e\n     * Throws a \u003ccode\u003eRuntimeException\u003c/code\u003e on JRE versions prior to 1.4.0.\n     * \u003c/p\u003e\n     * \n     * @param data\n     *            Data to digest\n     * @return SHA-384 digest as a hex string\n     ",
      "child_ranges": [
        "(line 399,col 9)-(line 399,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.digest.DigestUtils.sha384Hex(java.io.InputStream)",
      "begin_line": 413,
      "end_line": 415,
      "comment": "\n     * Calculates the SHA-384 digest and returns the value as a hex string.\n     * \u003cp\u003e\n     * Throws a \u003ccode\u003eRuntimeException\u003c/code\u003e on JRE versions prior to 1.4.0.\n     * \u003c/p\u003e\n     * \n     * @param data\n     *            Data to digest\n     * @return SHA-384 digest as a hex string\n     * @throws IOException On error reading from the stream\n     ",
      "child_ranges": [
        "(line 414,col 9)-(line 414,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.digest.DigestUtils.sha512(byte[])",
      "begin_line": 427,
      "end_line": 429,
      "comment": "\n     * Calculates the SHA-512 digest and returns the value as a \u003ccode\u003ebyte[]\u003c/code\u003e.\n     * \u003cp\u003e\n     * Throws a \u003ccode\u003eRuntimeException\u003c/code\u003e on JRE versions prior to 1.4.0.\n     * \u003c/p\u003e\n     * \n     * @param data\n     *            Data to digest\n     * @return SHA-512 digest\n     ",
      "child_ranges": [
        "(line 428,col 9)-(line 428,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.digest.DigestUtils.sha512(java.lang.String)",
      "begin_line": 441,
      "end_line": 443,
      "comment": "\n     * Calculates the SHA-512 digest and returns the value as a \u003ccode\u003ebyte[]\u003c/code\u003e.\n     * \u003cp\u003e\n     * Throws a \u003ccode\u003eRuntimeException\u003c/code\u003e on JRE versions prior to 1.4.0.\n     * \u003c/p\u003e\n     * \n     * @param data\n     *            Data to digest\n     * @return SHA-512 digest\n     ",
      "child_ranges": [
        "(line 442,col 9)-(line 442,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.digest.DigestUtils.sha512(java.io.InputStream)",
      "begin_line": 456,
      "end_line": 458,
      "comment": "\n     * Calculates the SHA-512 digest and returns the value as a \u003ccode\u003ebyte[]\u003c/code\u003e.\n     * \u003cp\u003e\n     * Throws a \u003ccode\u003eRuntimeException\u003c/code\u003e on JRE versions prior to 1.4.0.\n     * \u003c/p\u003e\n     * \n     * @param data\n     *            Data to digest\n     * @return SHA-512 digest\n     * @throws IOException On error reading from the stream\n     ",
      "child_ranges": [
        "(line 457,col 9)-(line 457,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.digest.DigestUtils.sha512Hex(byte[])",
      "begin_line": 470,
      "end_line": 472,
      "comment": "\n     * Calculates the SHA-512 digest and returns the value as a hex string.\n     * \u003cp\u003e\n     * Throws a \u003ccode\u003eRuntimeException\u003c/code\u003e on JRE versions prior to 1.4.0.\n     * \u003c/p\u003e\n     * \n     * @param data\n     *            Data to digest\n     * @return SHA-512 digest as a hex string\n     ",
      "child_ranges": [
        "(line 471,col 9)-(line 471,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.digest.DigestUtils.sha512Hex(java.lang.String)",
      "begin_line": 484,
      "end_line": 486,
      "comment": "\n     * Calculates the SHA-512 digest and returns the value as a hex string.\n     * \u003cp\u003e\n     * Throws a \u003ccode\u003eRuntimeException\u003c/code\u003e on JRE versions prior to 1.4.0.\n     * \u003c/p\u003e\n     * \n     * @param data\n     *            Data to digest\n     * @return SHA-512 digest as a hex string\n     ",
      "child_ranges": [
        "(line 485,col 9)-(line 485,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.digest.DigestUtils.sha512Hex(java.io.InputStream)",
      "begin_line": 499,
      "end_line": 501,
      "comment": "\n     * Calculates the SHA-512 digest and returns the value as a hex string.\n     * \u003cp\u003e\n     * Throws a \u003ccode\u003eRuntimeException\u003c/code\u003e on JRE versions prior to 1.4.0.\n     * \u003c/p\u003e\n     * \n     * @param data\n     *            Data to digest\n     * @return SHA-512 digest as a hex string\n     * @throws IOException On error reading from the stream\n     ",
      "child_ranges": [
        "(line 500,col 9)-(line 500,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.digest.DigestUtils.shaHex(byte[])",
      "begin_line": 510,
      "end_line": 512,
      "comment": "\n     * Calculates the SHA-1 digest and returns the value as a hex string.\n     * \n     * @param data\n     *            Data to digest\n     * @return SHA-1 digest as a hex string\n     ",
      "child_ranges": [
        "(line 511,col 9)-(line 511,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.digest.DigestUtils.shaHex(java.lang.String)",
      "begin_line": 521,
      "end_line": 523,
      "comment": "\n     * Calculates the SHA-1 digest and returns the value as a hex string.\n     * \n     * @param data\n     *            Data to digest\n     * @return SHA-1 digest as a hex string\n     ",
      "child_ranges": [
        "(line 522,col 9)-(line 522,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.digest.DigestUtils.shaHex(java.io.InputStream)",
      "begin_line": 533,
      "end_line": 535,
      "comment": "\n     * Calculates the SHA-1 digest and returns the value as a hex string.\n     * \n     * @param data\n     *            Data to digest\n     * @return SHA-1 digest as a hex string\n     * @throws IOException On error reading from the stream\n     ",
      "child_ranges": [
        "(line 534,col 9)-(line 534,col 52)"
      ]
    }
  ]
}