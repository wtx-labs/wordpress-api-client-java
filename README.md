# WordPress API Client for Java

[![License: MIT](https://img.shields.io/badge/License-MIT-yellow.svg)](https://opensource.org/licenses/MIT)
[![Java Version](https://img.shields.io/badge/Java-8%2B-blue)](https://www.java.com)
[![Maven Central](https://img.shields.io/maven-central/v/pl.wtx.wordpress/wordpress-api-client?label=Maven%20Central&logo=apache-maven&color=blue)](https://mvnrepository.com/artifact/pl.wtx.wordpress/wordpress-api-client)

A lightweight Java client library for WordPress REST API integration. Built for Java developers who need to integrate their applications with the WordPress `wp/v2` HTTP API. 🚀

This API client provides a type-safe Java interface for WordPress REST API v2, enabling seamless management of:

- **Content & media**
  - Posts and pages with CRUD, revisions, and autosaves
  - Media (attachments) and post comments
  - Site search

- **Taxonomies & content types**
  - Categories, tags, and custom taxonomies
  - Registered post types and post statuses

- **Users & site settings**
  - Users and authentication-friendly Basic auth (e.g. Application Passwords)
  - Site settings, themes, and plugins

- **Editor, blocks & patterns**
  - Block editor content (blocks), block types, block patterns, block directory
  - Pattern directory and pattern categories
  - Navigation menus, menu items, and menu locations

- **Site builder & typography**
  - Templates, template parts, and global styles–related routes where exposed
  - Font families and font collections

- **Widgets & legacy UI**
  - Sidebars, widgets, and widget types

## ✨ Why choose this client?

- 💡 **Type-Safe Java API** - fully typed interfaces for WordPress REST endpoints
- 🛡️ **Basic authentication** - secure WordPress API access (e.g. username + Application Password)
- 📚 **Clear documentation** - comprehensive examples for Java integration
- 🚀 **Wide Java support** - compatible with Java 8 and newer
- ⚡ **OpenAPI Generated** - based on our [OpenAPI specification](https://github.com/wtx-labs/wordpress-api-openapi-specification); regenerate sources with [`wordpress-api-client-generator`](https://github.com/wtx-labs/wordpress-api-client-generator) when the spec changes

- ✅ Posts API
  - List all posts
  - Create a new post
  - Get a specific post
  - Update a post
  - Delete a post
  - List, get, and delete revisions; work with autosaves

- ✅ Pages API
  - List all pages
  - Create a new page
  - Get a specific page
  - Update a page
  - Delete a page
  - List, get, and delete revisions; work with autosaves

- ✅ Media API
  - List all media items
  - Upload / create media
  - Get, update, or delete a media item
  - Post-processing and related operations as defined in the spec

- ✅ Comments API
  - List all comments
  - Create a new comment
  - Get a specific comment
  - Update a comment
  - Delete a comment

- ✅ Users API
  - List all users
  - Create a new user
  - Get a specific user
  - Update a user
  - Delete a user
  - Application passwords and related user sub-resources as defined in the spec

- ✅ Categories API
  - List all categories
  - Create a new category
  - Get a specific category
  - Update a category
  - Delete a category

- ✅ Tags API
  - List all tags
  - Create a new tag
  - Get a specific tag
  - Update a tag
  - Delete a tag

- ✅ Taxonomies API
  - List all taxonomies
  - Get a specific taxonomy

- ✅ Post Types API
  - List all post types
  - Get a specific post type

- ✅ Post Statuses API
  - List all post statuses
  - Get a specific post status

- ✅ Settings API
  - Get or update site settings as exposed by the REST API

- ✅ Themes API
  - List themes and theme-related operations

- ✅ Plugins API
  - List plugins and plugin-related operations

- ✅ Sidebars API
  - List sidebars and sidebar configuration

- ✅ Widgets API
  - List, create, get, update, and delete widgets

- ✅ Widget Types API
  - List and inspect widget types

- ✅ Blocks API
  - CRUD and nested routes for block posts (revisions, autosaves) as in the spec

- ✅ Block Types API
  - List and read block type definitions

- ✅ Block Patterns API
  - List and read block patterns

- ✅ Block Directory API
  - Block directory search and related endpoints

- ✅ Pattern Directory API
  - Pattern directory endpoints

- ✅ Pattern Categories API
  - Pattern category taxonomy endpoints

- ✅ Menus API
  - List, create, get, update, and delete menus

- ✅ Menu Items API
  - Full CRUD for menu items; revisions and autosaves where applicable

- ✅ Menu Locations API
  - List and manage menu locations

- ✅ Navigation API
  - Navigation post type endpoints (revisions, autosaves, etc.)

- ✅ Templates API
  - Templates and template revisions / autosaves

- ✅ Template Parts API
  - Template parts and related revision routes

- ✅ Font Families API
  - Font family resources

- ✅ Font Collections API
  - Font collection resources

- ✅ Search API
  - Search across content types exposed by the API

- ✅ Other API
  - Miscellaneous routes grouped under “Other” in the OpenAPI document

## 📦 Version information

- **Current version**: `1.0.0`
- **Supported WordPress REST API version**: `v2`
- **Java compatibility**: Java 8+

## 🔓 License

**MIT License**

Permission is hereby granted, free of charge, to any person obtaining a copy of this software and associated documentation files, to use, copy, modify, merge, publish, distribute, sublicense, and/or sell copies of the software.

The only requirement is to preserve the original author attribution in the source code and documentation.

## 🚀 Quick start guide

### 1️⃣ Installation

You can add the library to your project by including the dependency from Maven Central:
```xml
<!-- https://mvnrepository.com/artifact/pl.wtx.wordpress/wordpress-api-client -->
<dependency>
    <groupId>pl.wtx.wordpress</groupId>
    <artifactId>wordpress-api-client</artifactId>
    <version>1.0.0</version>
</dependency>
```

Alternatively, clone and build the library from source:

```sh
git clone https://github.com/wtx-labs/wordpress-api-client-java.git
cd wordpress-api-client-java
mvn clean install
```

Then add the locally built artifact to your project:

```xml
<dependency>
    <groupId>pl.wtx.wordpress</groupId>
    <artifactId>wordpress-api-client</artifactId>
    <version>1.0.0</version>
</dependency>
```

### 2️⃣ Java integration example

Here's how to fetch WordPress posts using the client (see `WordPressApiClientUsageDemo` in the repository):

```java
package pl.wtx.wordpress;

import java.util.List;

import pl.wtx.wordpress.api.client.PostsApi;
import pl.wtx.wordpress.api.client.invoker.ApiException;
import pl.wtx.wordpress.api.client.model.Post;

public class WordPressApiClientUsageDemo {

    // TODO: Set your WordPress REST API base path.
    private static final String API_BASE_PATH = "https://your-wordpress-site.com/wp-json/wp/v2";
    private static final String API_USERNAME = "TODO_SET_USERNAME";
    private static final String API_PASSWORD = "TODO_SET_APPLICATION_PASSWORD";

    public static void main(String[] args) {

        System.out.println(">>> Start running the WordPressApiClientUsageDemo...");

        // Use WordPressApiClient(true) if you need to log API communication messages.
        WordPressApiClient apiClient = new WordPressApiClient();

        apiClient.setBasePath(API_BASE_PATH);
        apiClient.setUsername(API_USERNAME);
        apiClient.setPassword(API_PASSWORD);

        PostsApi postsApi = new PostsApi(apiClient);

        try {

            List<Post> posts = postsApi.postsGet(
                    null, null, null, null, null, null, null, null, null, null,
                    null, null, null, null, null, null, null, null, null, null,
                    null, null, null, null, null, null, null);

            posts.forEach(p -> System.out.println("Post id=" + p.getId() + " slug=" + p.getSlug()));

        } catch (ApiException e) {
            System.err.println("Error occurred during API call: " + e);
        }

        System.out.println("<<< The WordPressApiClientUsageDemo has been finished.");

    }

}
```

## 🔗 Get involved

- ✨ Check our [GitHub Issues](https://github.com/wtx-labs/wordpress-api-client-java/issues) for latest updates
- 💡 Have suggestions? Open an Issue or contribute to the project
- 🌟 Star this repository if you find it helpful!

## 🔍 Keywords

wordpress java client, wordpress rest api java, java wordpress integration, wordpress api v2 java, wp-json java client, wordpress java library, java rest api client wordpress, wordpress api client library for java, openapi wordpress java

🚀 Happy coding! 😊

**Your WTX Labs Team** 🚀
