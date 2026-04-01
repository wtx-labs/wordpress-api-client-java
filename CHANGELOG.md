# Changelog

All notable changes to this project will be documented in this file.

The format is based on [Keep a Changelog](https://keepachangelog.com/en/1.0.0/),
and this project adheres to [Semantic Versioning](https://semver.org/spec/v2.0.0.html).

## [1.0.0] - 2026-04-02

### Added

- Initial release: Java client for WordPress **REST API** (`wp/v2`), generated from the [OpenAPI specification](https://github.com/wtx-labs/wordpress-api-openapi-specification) (OkHttp + Gson).
- Facade `WordPressApiClient` with optional HTTP body logging (`WordPressApiClient(true)`).
- `WordPressApiClientUsageDemo` listing posts via `PostsApi`.
- API facades for core resources, including: `PostsApi`, `PagesApi`, `MediaApi`, `CommentsApi`, `UsersApi`, `CategoriesApi`, `TagsApi`, `TaxonomiesApi`, `PostTypesApi`, `PostStatusesApi`, `SettingsApi`, `ThemesApi`, `PluginsApi`, `MenusApi`, `MenuItemsApi`, `MenuLocationsApi`, `NavigationApi`, `TemplatesApi`, `TemplatePartsApi`, `BlocksApi`, `BlockTypesApi`, `BlockPatternsApi`, `BlockDirectoryApi`, `PatternDirectoryApi`, `PatternCategoriesApi`, `FontFamiliesApi`, `FontCollectionsApi`, `SearchApi`, `SidebarsApi`, `WidgetsApi`, `WidgetTypesApi`, and `OtherApi`.
