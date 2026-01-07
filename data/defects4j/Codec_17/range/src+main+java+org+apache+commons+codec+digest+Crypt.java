{
  "filepath": "/tmp/Codec-17b/src/main/java/org/apache/commons/codec/digest/Crypt.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "Crypt",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 31,
      "end_line": 153,
      "comment": "\n * GNU libc crypt(3) compatible hash method.\n * \u003cp\u003e\n * See {@link #crypt(String, String)} for further details.\n * \u003cp\u003e\n * This class is immutable and thread-safe.\n *\n * @version $Id$\n * @since 1.7\n "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.digest.Crypt.crypt(byte[])",
      "begin_line": 45,
      "end_line": 47,
      "comment": "\n     * Encrypts a password in a crypt(3) compatible way.\n     * \u003cp\u003e\n     * A random salt and the default algorithm (currently SHA-512) are used. See {@link #crypt(String, String)} for\n     * details.\n     *\n     * @param keyBytes\n     *            plaintext password\n     * @return hash value\n     * @throws RuntimeException\n     *             when a {@link java.security.NoSuchAlgorithmException} is caught.\n     ",
      "child_ranges": [
        "(line 46,col 9)-(line 46,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.digest.Crypt.crypt(byte[], java.lang.String)",
      "begin_line": 65,
      "end_line": 77,
      "comment": "\n     * Encrypts a password in a crypt(3) compatible way.\n     * \u003cp\u003e\n     * If no salt is provided, a random salt and the default algorithm (currently SHA-512) will be used. See\n     * {@link #crypt(String, String)} for details.\n     *\n     * @param keyBytes\n     *            plaintext password\n     * @param salt\n     *            salt value\n     * @return hash value\n     * @throws IllegalArgumentException\n     *             if the salt does not match the allowed pattern\n     * @throws RuntimeException\n     *             when a {@link java.security.NoSuchAlgorithmException} is caught.\n     ",
      "child_ranges": [
        "(line 66,col 9)-(line 76,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.digest.Crypt.crypt(java.lang.String)",
      "begin_line": 91,
      "end_line": 93,
      "comment": "\n     * Calculates the digest using the strongest crypt(3) algorithm.\n     * \u003cp\u003e\n     * A random salt and the default algorithm (currently SHA-512) are used.\n     *\n     * @see #crypt(String, String)\n     * @param key\n     *            plaintext password\n     * @return hash value\n     * @throws RuntimeException\n     *             when a {@link java.security.NoSuchAlgorithmException} is caught.\n     ",
      "child_ranges": [
        "(line 92,col 9)-(line 92,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.digest.Crypt.crypt(java.lang.String, java.lang.String)",
      "begin_line": 150,
      "end_line": 152,
      "comment": "\n     * Encrypts a password in a crypt(3) compatible way.\n     * \u003cp\u003e\n     * The exact algorithm depends on the format of the salt string:\n     * \u003cul\u003e\n     * \u003cli\u003eSHA-512 salts start with {@code $6$} and are up to 16 chars long.\n     * \u003cli\u003eSHA-256 salts start with {@code $5$} and are up to 16 chars long\n     * \u003cli\u003eMD5 salts start with {@code $1$} and are up to 8 chars long\n     * \u003cli\u003eDES, the traditional UnixCrypt algorithm is used with only 2 chars\n     * \u003cli\u003eOnly the first 8 chars of the passwords are used in the DES algorithm!\n     * \u003c/ul\u003e\n     * The magic strings {@code \"$apr1$\"} and {@code \"$2a$\"} are not recognized by this method as its output should be\n     * identical with that of the libc implementation.\n     * \u003cp\u003e\n     * The rest of the salt string is drawn from the set {@code [a-zA-Z0-9./]} and is cut at the maximum length of if a\n     * {@code \"$\"} sign is encountered. It is therefore valid to enter a complete hash value as salt to e.g. verify a\n     * password with:\n     *\n     * \u003cpre\u003e\n     * storedPwd.equals(crypt(enteredPwd, storedPwd))\n     * \u003c/pre\u003e\n     * \u003cp\u003e\n     * The resulting string starts with the marker string ({@code $n$}), where n is the same as the input salt.\n     * The salt is then appended, followed by a {@code \"$\"} sign.\n     * This is followed by the actual hash value.\n     * For DES the string only contains the salt and actual hash.\n     * The total length is dependent on the algorithm used:\n     * \u003cul\u003e\n     * \u003cli\u003eSHA-512: 106 chars\n     * \u003cli\u003eSHA-256: 63 chars\n     * \u003cli\u003eMD5: 34 chars\n     * \u003cli\u003eDES: 13 chars\n     * \u003c/ul\u003e\n     * \u003cp\u003e\n     * Example:\n     *\n     * \u003cpre\u003e\n     *      crypt(\"secret\", \"$1$xxxx\") \u003d\u0026gt; \"$1$xxxx$aMkevjfEIpa35Bh3G4bAc.\"\n     *      crypt(\"secret\", \"xx\") \u003d\u0026gt; \"xxWAum7tHdIUw\"\n     * \u003c/pre\u003e\n     * \u003cp\u003e\n     * This method comes in a variation that accepts a byte[] array to support input strings that are not encoded in\n     * UTF-8 but e.g. in ISO-8859-1 where equal characters result in different byte values.\n     *\n     * @see \"The man page of the libc crypt (3) function.\"\n     * @param key\n     *            plaintext password as entered by the used\n     * @param salt\n     *            salt value\n     * @return hash value, i.e. encrypted password including the salt string\n     * @throws IllegalArgumentException\n     *             if the salt does not match the allowed pattern\n     * @throws RuntimeException\n     *             when a {@link java.security.NoSuchAlgorithmException} is caught. *\n     ",
      "child_ranges": [
        "(line 151,col 9)-(line 151,col 57)"
      ]
    }
  ]
}